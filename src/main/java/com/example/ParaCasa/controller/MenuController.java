package com.example.ParaCasa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ParaCasa.model.Menu;
import com.example.ParaCasa.service.MenuService;

import com.example.ParaCasa.repository.MenuRepository;



@RestController
@RequestMapping("/menu")
public class MenuController {
//	private final MenuService menuService;
//	
//	@Autowired
//	public MenuController(MenuService menuService) {
//		this.menuService = menuService;
//	}
//	
//	@GetMapping
//	public List<Menu> getMenus() {
//		return menuService.getMenus();
//	}
	@Autowired
	MenuRepository repo;
	
	@GetMapping("/menus")
	public ModelAndView urlMenu() {
		Iterable<Menu> menus = repo.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/menu");
		mv.addObject("menus", menus);
		return mv;
	}
		
	
	@GetMapping("/menus/1")
	public ModelAndView getById() {
		Optional<Menu> menu = repo.findById((long) 1);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/menu");
		mv.addObject("menus", menu);
		return mv;
	}
}

