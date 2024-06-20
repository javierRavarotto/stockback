package com.stock.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Colors;
import com.stock.repository.ColorsRepository;

@Service
public class ColorsService {
	
	@Autowired
	ColorsRepository colorsRepository;
	
	public Colors findById(Integer id) {
		Colors color = colorsRepository.findById(id).get();
		return color;
	}
	
	@Transactional
	public Colors update(Colors color) {	
	return colorsRepository.save(color);
	
	}
	
	@Transactional
	public void delete( Integer id) {
		Colors colorDelete= findById(id);
		colorsRepository.delete(colorDelete);
	}
	
	
}