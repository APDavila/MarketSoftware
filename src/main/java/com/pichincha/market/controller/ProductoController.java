package com.pichincha.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.service.PersonaService;
import com.pichincha.market.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	
	@GetMapping("/producto")
	public String userForm(Model model) {
		model.addAttribute("productoList", productoService.getAllProducts());
		return "user-form/user-view";
	}
	
}
