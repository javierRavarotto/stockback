package com.stock.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.repository.ClothesRepository;
import com.stock.service.ClothesService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/clothes")
public class ClothesController {
	
	@Autowired
	ClothesService clothesServicio;
	
	@Autowired
	ClothesRepository clothesRepositorio;
	
}