package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
public class GenericServiceImpl<T extends BaseEntity, ID extends Serializable> implements IGenericService<T, ID>{

	@Autowired
	private GenericRepository<T, ID> repository;

    public GenericServiceImpl(GenericRepository<T, ID> repository) {
        this.repository = repository;
    }

	@Override
	public List<T> findAll() {
		return this.repository.findAll();		
	}

    @Override
    public T findById(ID id) {
        Optional<T> entity = repository.findById(id);
        return entity.orElse(null); 
    } 

	@Override
	public T save(T entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(ID id) {
		this.repository.deleteById(id);
	}

	@Override
	public T update(T entity, ID id) {
		Optional<T> entity2 = this.repository.findById(id);
		if (entity2.isPresent()) {
			this.repository.save(entity);
			return entity;
		}
		return null;
	}

} 
