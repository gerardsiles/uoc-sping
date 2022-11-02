package com.example.ParaCasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ParaCasa.model.Producto;
import com.example.ParaCasa.repository.ProductoRepository;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	ProductoRepository repo;
	
	@GetMapping("")
	public ModelAndView base() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/producto");
		return mv;
	}
	
	
	@GetMapping("/prodcutos")
	public ModelAndView productos() {
		Iterable<Producto> menus = repo.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/menu");
		mv.addObject("menus", menus);
		return mv;
	}
}
