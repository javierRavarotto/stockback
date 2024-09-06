package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.entitys.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository <Inventory,Integer>  {

}
