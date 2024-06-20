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

import com.stock.entitys.Categories;
import com.stock.entitys.Colors;
import com.stock.repository.CategoriesRepository;
import com.stock.service.CategoriesService;
import com.stock.service.ColorsService;

@CrossOrigin
@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	
	@Autowired
	CategoriesService categoriesService;
	@Autowired
	ColorsService colorsService;
	
	@Autowired
	CategoriesRepository categoriesRepository;

	
	@GetMapping
	Iterable<Categories> List(){
		return categoriesRepository.findAll();
	}
	@GetMapping("{id}")
	public Categories lista( @PathVariable Integer id) {	 
		return categoriesService.findById(id);
	}
	
	@PostMapping
	public Categories create(@RequestBody Categories categorie) {
		Integer id = categorie.getId();
		System.out.print(id);
		Colors color =colorsService.findById(id);
		categorie.setColor(color);
		categorie.setCreationDate(new Date());
		return categoriesRepository.save(categorie);
	}
	
	
	@PutMapping("{id}")
	public Categories update(@PathVariable Integer id,@RequestBody Categories categorie) {
		Categories categorieUpdate = categoriesService.update(categorie);
		return categorieUpdate;	
	}
	
	@DeleteMapping("{id}")
	public void borrar( @PathVariable Integer id) {
		
		categoriesService.delete(id);
		}

}