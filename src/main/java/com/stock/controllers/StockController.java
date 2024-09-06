package com.stock.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entitys.Colors;
import com.stock.repository.StockRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
	@Autowired
	StockRepository stockRepository;


}
