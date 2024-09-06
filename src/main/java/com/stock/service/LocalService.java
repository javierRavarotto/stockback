package com.stock.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Clothes;
import com.stock.entitys.Inventory;
import com.stock.entitys.Local;
import com.stock.repository.LocalRepository;
import com.stock.repository.StockRepository;

@Service
public class LocalService {


	@Autowired
	LocalRepository localRepository;


	@Autowired
	StockRepository stockRepository;

	@Autowired
	ClothesService clothesService;


	@Autowired
	StockService stockService;

	public Local findById(Integer id) {
		Local local = localRepository.findById(id).get();
		return local;
	}
	
	
	@Transactional
	public Local update(Integer id,Local local) {
		Local localUpdate = findById(id);
		localUpdate.setName(local.getName());
		
	return localRepository.save(localUpdate);
	
	}
	
	@Transactional
	public void delete( Integer id) {
		Local localDelete= findById(id);
		localRepository.delete(localDelete);
	}
}

 

