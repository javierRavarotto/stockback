package com.stock.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entitys.Colors;
import com.stock.entitys.Inventory;
import com.stock.repository.InventoryRepository;
import com.stock.service.InventoryService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/inventary")
public class InventaryController {


	@Autowired
	InventoryRepository inventoryRepository;
	@Autowired
	InventoryService inventoryService;

	
	@GetMapping
	Iterable<Inventory> List(){
		return inventoryRepository.findAll();
	}
	
	@PutMapping("{id}/addClothe")
	public Inventory addClothe(@PathVariable Integer id,@RequestBody Inventory inventory) {
		System.out.print("emntro");
		Inventory localUpdate = inventoryService.addClothe(id, inventory);
		return localUpdate;	
	}
}
