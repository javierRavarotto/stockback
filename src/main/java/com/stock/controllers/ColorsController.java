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

import com.stock.entitys.Colors;
import com.stock.repository.ColorsRepository;
import com.stock.service.ColorsService;
@CrossOrigin
@RestController
@RequestMapping("/api/colors")
public class ColorsController {
	
	@Autowired
	ColorsService colorsService;
	
	@Autowired
	ColorsRepository colorsRepository;
	
	@GetMapping
	Iterable<Colors> List(){
		return colorsRepository.findAll();
	}
	@GetMapping("{id}")
	public Colors lista( @PathVariable Integer id) {	 
		return colorsService.findById(id);
	}
	
	@PostMapping
	public Colors create(@RequestBody Colors color) {
		System.out.print(color);
		
		color.setCreationDate(new Date());
		return colorsRepository.save(color);
	}
	
	@PutMapping("{id}")
	public Colors update(@PathVariable Integer id,@RequestBody Colors color) {
		Colors colorUpdate = colorsService.update(color);
		return colorUpdate;	
	}
	
	@DeleteMapping("{id}")
	public void borrar( @PathVariable Integer id) {
		
		colorsService.delete(id);
		}
	
}