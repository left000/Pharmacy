package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Category;

@Repository
public interface ICategoryRepository extends GenericRepository<Category, Long> {

}
