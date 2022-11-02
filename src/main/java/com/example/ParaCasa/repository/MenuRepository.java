package com.example.ParaCasa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ParaCasa.model.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {
//	Menu findById(long id);
//	Iterable<Menu> findAll();
	
	
}
