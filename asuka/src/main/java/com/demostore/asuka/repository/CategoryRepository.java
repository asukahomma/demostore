package com.demostore.asuka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demostore.asuka.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
