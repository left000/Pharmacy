package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.model.Product;


public class GenericController<T extends BaseEntity, ID extends Serializable> {

	
	private final IGenericService<T, ID> genericService;
	
	public GenericController(IGenericService<T, ID> genericService) {
		super();
		this.genericService = genericService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<T>> getAll(){
		List<T> productList = this.genericService.findAll();
		return productList.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(productList);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<T> getById(@PathVariable ID id){
		T entity = this.genericService.findById(id);
		
		if (entity == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(entity);
	}
	
	@PostMapping("/create")
	public ResponseEntity<T> create(@RequestBody T entity){
		T newEntity = this.genericService.save(entity);
		
		if (newEntity == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(newEntity);
	}
	
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePerson(@PathVariable ID id) {
      T entity = this.genericService.findById(id);
	  if (entity == null) {
		  return ResponseEntity.notFound().build();
      }
	  return ResponseEntity.noContent().build();
  }
	
	

}
