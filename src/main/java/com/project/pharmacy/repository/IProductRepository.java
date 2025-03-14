package com.project.pharmacy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Category;
import com.project.pharmacy.model.Product;

@Repository
public interface IProductRepository extends GenericRepository<Product, Long> {
}