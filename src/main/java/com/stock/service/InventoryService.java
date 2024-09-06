package com.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Clothes;
import com.stock.entitys.Inventory;
import com.stock.entitys.Stock;
import com.stock.repository.InventoryRepository;

@Service
public class InventoryService {

	
	@Autowired
	InventoryRepository inventoryRepository;
	
	@Autowired
	StockService stockService;

	@Autowired
	ClothesService clothesService;
	
	
	
	@Transactional
	public Inventory addClothe(Integer idStock,Integer idClothe) {
		Inventory inventory = new Inventory();
		Stock stock = stockService.findById(idStock);
		Clothes clothe = clothesService.findById(idClothe);
		
		inventory.setClothe(clothe);
		inventory.setStock(stock);
		
		
	return inventoryRepository.save(inventory);
	
	}
}
