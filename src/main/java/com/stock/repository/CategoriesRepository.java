package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entitys.Categories;

@Repository
public interface CategoriesRepository  extends JpaRepository <Categories,Integer>  {

}
