package com.project.pharmacy.generics;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<D extends BaseEntity, ID extends Serializable> {
	public List<D> findAll();
	public D findById(ID id);
	public D save(D entity);
	public void delete(ID id);
	public D update(D entity, ID id);
}

