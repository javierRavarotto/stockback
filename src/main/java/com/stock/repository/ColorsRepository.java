package com.stock.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stock.entitys.Colors;

@Repository
public interface ColorsRepository extends CrudRepository<Colors, Integer>  {



	

}
