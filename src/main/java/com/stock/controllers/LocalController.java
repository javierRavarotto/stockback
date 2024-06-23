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

import com.stock.entitys.Local;
import com.stock.repository.LocalRepository;
import com.stock.service.LocalService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("api/local")
public class LocalController {
	
	@Autowired
	LocalService localService;
	
	@Autowired
	LocalRepository localRepository;

	
	@GetMapping
	Iterable<Local> List(){
		return localRepository.findAll();
	}
	@GetMapping("{id}")
	public Local lista( @PathVariable Integer id) {	 
		return localService.findById(id);
	}
	
	@PostMapping
	public Local create(@RequestBody Local local) {
		
		local.setCreationDate(new Date());
		return localRepository.save(local);
	}
	
	
	@PutMapping("{id}")
	public Local update(@PathVariable Integer id,@RequestBody Local local) {
		Local localUpdate = localService.update(local);
		return localUpdate;	
	}
	
	@DeleteMapping("{id}")
	public void borrar( @PathVariable Integer id) {
		
		localService.delete(id);
		}
	
}