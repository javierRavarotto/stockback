package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entitys.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository <Clothes,Integer>   {

}
