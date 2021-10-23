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
import com.pichincha.market.service.TransaccionService;

@Controller
public class VentaController {
	
	@Autowired
	TransaccionService transaccionService;
	
	@GetMapping("/venta")
	public String userForm(Model model) {
		model.addAttribute("transaccionList",transaccionService.getAllTransacts());
		return "user-form/user-view";
	}
	
}
