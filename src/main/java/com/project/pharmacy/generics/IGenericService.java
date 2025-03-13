package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<T extends BaseEntity, ID extends Serializable> {
	public List<T> findAll();
	public T findById(ID id);
	public T save(T entity);
	public void delete(ID id);
	public T update(T entity, ID id);
}

