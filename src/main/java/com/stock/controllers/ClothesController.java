package com.stock.controllers;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entitys.Clothes;
import com.stock.entitys.Local;
import com.stock.repository.ClothesRepository;
import com.stock.service.ClothesService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/clothes")
public class ClothesController {
	
	@Autowired
	ClothesService clothesService;
	
	@Autowired
	ClothesRepository clothesRepository;
	

	@GetMapping
	Iterable<Clothes> List(){
		return clothesRepository.findAll();
	}
	@GetMapping("{id}")
	public Clothes lista( @PathVariable Integer id) {	 
		return clothesService.findById(id);
	}
	
	@PostMapping
	public Clothes create(@RequestBody Clothes clothes) {
		System.out.print(clothes);
		clothes.setCreationDate(new Date());
		return clothesRepository.save(clothes);
	}
	
	
	@PutMapping("{id}")
	public Clothes update(@PathVariable Integer id,@RequestBody Clothes clothes) {
		Clothes clothesUpdate = clothesService.update(id,clothes);
		return clothesUpdate;	
	}
	
	@DeleteMapping("{id}")
	public void borrar( @PathVariable Integer id) {
		
		clothesService.delete(id);
		}

	
} 