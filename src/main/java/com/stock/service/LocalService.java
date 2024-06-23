package com.stock.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.entitys.Colors;
import com.stock.entitys.Local;
import com.stock.repository.LocalRepository;

@Service
public class LocalService {


	@Autowired
	LocalRepository localRepository;
	
	public Local findById(Integer id) {
		Local local = localRepository.findById(id).get();
		return local;
	}
	
	@Transactional
	public Local update(Local local) {	
	return localRepository.save(local);
	
	}
	
	@Transactional
	public void delete( Integer id) {
		Local localDelete= findById(id);
		localRepository.delete(localDelete);
	}
	
}


