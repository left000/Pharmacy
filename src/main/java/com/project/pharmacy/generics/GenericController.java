package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.model.Product;


public class GenericController<D extends BaseEntity, ID extends Serializable> {

	private final IGenericService<D, ID> genericService;

	public GenericController(IGenericService<D, ID> genericService) {
		super();
		this.genericService = genericService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<D>> getAll(){
		List<D> productList = this.genericService.findAll();
		return productList.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(productList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<D> getById(@PathVariable ID id){
		D entity = this.genericService.findById(id);

		if (entity == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(entity);
	}

	@PostMapping("/create")
	public ResponseEntity<D> create(@RequestBody D entity){
		D newEntity = this.genericService.save(entity);

		if (newEntity == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(newEntity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePerson(@PathVariable ID id) {
		D entity = this.genericService.findById(id);
		if (entity == null) {
			return ResponseEntity.notFound().build();
		}
		this.genericService.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<D> update(@RequestBody D entity, @PathVariable ID id){
		D existingEntity  = this.genericService.findById(id);

		if (existingEntity  == null) {
			return ResponseEntity.notFound().build();
		}
		entity.setId(id);
		D newEntity = this.genericService.update(entity, id);
		return ResponseEntity.ok(newEntity);
	}

}
