package com.stock.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Categories;
import com.stock.entitys.Colors;
import com.stock.repository.CategoriesRepository;

@Service
public class CategoriesService {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Autowired
	ColorsService colorsService;
	
	public Categories findById(Integer id) {
		Categories categorie = categoriesRepository.findById(id).get();
		return categorie;
	}
	
	@Transactional
	public Categories update(Integer id,Categories categorie) {
		 Integer idColor=categorie.getId();
		Colors color =colorsService.findById(idColor);
		Categories categorieUpdate= findById(id);
		categorieUpdate.setName(categorie.getName());
		categorieUpdate.setColor(color);
		
	return categoriesRepository.save(categorieUpdate);
	
	}
	
	@Transactional
	public void delete( Integer id) {
		Categories categorieDelete= findById(id);
		categoriesRepository.delete(categorieDelete);
	}
	
}