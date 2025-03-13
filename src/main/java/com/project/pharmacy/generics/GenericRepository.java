package com.project.pharmacy.generics;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GenericRepository<T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID>{
}
