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
	
	
	// tengo qque hacer una funcion para que bsuque al inventario que coincida el id clothe y id stoc la variable que entra con el nomre id clothe es en realida el invenatario hay que actualizarlo
	@Transactional
	public Inventory addClothe(Integer idStock,Inventory idClothe) {
		Inventory inventory = new Inventory();
		Stock stock = stockService.findById(idStock);
//		Clothes clothe = clothesService.findById(idClothe);
		System.out.print(idClothe);
		//inventory.setClothe(clothe);
		inventory.setStock(stock);
		inventory.setS(idClothe.getS());
		System.out.print("emntro");
		
	return inventoryRepository.save(inventory);
	
	}
}
