package com.stock.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.repository.LocalRepository;
import com.stock.service.LocalService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/local")
public class LocalController {
	
	@Autowired
	LocalService localServicio;
	
	@Autowired
	LocalRepository localRepositorio;
}