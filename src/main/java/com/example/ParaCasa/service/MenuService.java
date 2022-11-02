package com.example.ParaCasa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ParaCasa.model.Menu;

@Service 
public class MenuService {
	
	
	public List<Menu> getMenus() {
		return List.of(
				new Menu(123L, 23.35)
				);
	}
}
