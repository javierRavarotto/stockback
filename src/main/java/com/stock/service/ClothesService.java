package com.stock.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Clothes;
import com.stock.entitys.Local;
import com.stock.repository.ClothesRepository;

@Service
public class ClothesService {
	@Autowired
	ClothesRepository clothesRepository;
	
	public Clothes findById(Integer id) {
		Clothes clothes = clothesRepository.findById(id).get();
		return clothes;
	}
	
	@Transactional
	public Clothes update(Integer id,Clothes clothes) {
		
		Clothes clothesUpdate = findById(id);
		System.out.print(clothes.getCode());
		clothesUpdate.setCode(clothes.getCode());
		clothesUpdate.setName(clothes.getName());
		
	return clothesRepository.save(clothesUpdate);
	
	}
	
	@Transactional
	public void delete( Integer id) {
		Clothes clothesDelete= findById(id);
		clothesRepository.delete(clothesDelete);
	}
} 