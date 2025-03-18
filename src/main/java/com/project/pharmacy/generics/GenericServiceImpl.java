package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.pharmacy.exception.DataNotFoundException;

public class GenericServiceImpl<T extends BaseEntity, D extends BaseEntity, ID extends Serializable> implements IGenericService<D,ID>{

	@Autowired
	private GenericRepository<T, ID> repository;

	private Class<D> dto;
	private Class<T> type;
	private ModelMapper modelMapper;

	public GenericServiceImpl(GenericRepository<T, ID> repository, ModelMapper modelMapper, Class<D> dto, Class<T> type) {
		this.repository = repository;
		this.modelMapper = modelMapper;
		this.dto = dto;
		this.type = type;
	}

	@Override
	public List<D> findAll() {
		List<D> list = this.repository.findAll()
				.stream()
				.map(t -> modelMapper.map(t, dto))
				.collect(Collectors.toList());
		
		if (list.isEmpty()) {
		    throw new DataNotFoundException("Lista vuota");
		}
		return list;
	}

	@Override
	public D findById(ID id) {
		Optional<D> entity = repository.findById(id)
				.map(t -> modelMapper.map(t, dto));
		return entity.orElse(null); 
	} 

	@Override
	public D save(D entityDto) {
		if (entityDto == null) {
			throw new IllegalArgumentException("Can't be null");
		}

		try {

			T newUser = modelMapper.map(entityDto, type);
			T savedUser = repository.save(newUser);

			return modelMapper.map(savedUser, dto);

		} catch (Exception e) {
			throw new RuntimeException("error in creation" + e.getMessage(), e);
		}
	}

	@Override
	public void delete(ID id) {
		if (id == null) {
			throw new IllegalArgumentException("id null");
		}

		Optional<T> entity = repository.findById(id);

		entity.ifPresentOrElse(
				t -> this.repository.deleteById(id), 
				() -> {
					throw new RuntimeException("Type with id: " + id + "not found");
				});
	}

	@Override
	public D update(D entityDto, ID id) {

		if (id == null) {
			throw new IllegalArgumentException("Can't be null");
		}

		Optional<T> entity = this.repository.findById(id);

		// in questo caso se non trova niente nella Repo, restituisce un Optional vuoto, e non entrerá nel ifPresent 
		entity.ifPresent(t -> this.repository.save(t));

		// il Map ha la stessa funzione di ifPresent, se non trova niente salta al orElseThrow
		return entity
				.map(t -> modelMapper.map(t, dto))
				.orElseThrow(() -> new RuntimeException("Type with id: " + id + "not found"));
	}

} 
