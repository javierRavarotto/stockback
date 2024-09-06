package com.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Local;
import com.stock.entitys.Stock;
import com.stock.repository.StockRepository;

@Service
public class StockService {
	

	@Autowired
	StockRepository stockRepository;
	
	public Stock findById(Integer id) {
		Stock stock = stockRepository.findById(id).get();
		
		return stock;
	}
	
	@Transactional
	public Stock create() {
		Stock stock = new Stock();
		
		return stockRepository.save(stock);
	}
	
	@Transactional
	public Stock update(Integer id,Local local) {
		Stock stockUpdate = findById(id);
		
		
		
	return stockRepository.save(stockUpdate);
	
	}
}
