package com.pichincha.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pichincha.market.entity.Persona;
import com.pichincha.market.service.PersonaService;

@Controller
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/persona")
	public String userForm(Model model) {
		model.addAttribute("personaList",personaService.getAllPeople());
		return "user-form/user-view";
	}

	@PostMapping("/persona")
	public String createPersona(@Validated @ModelAttribute("userForm")Persona persona, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("personaList", persona);
			model.addAttribute("formTab", "active");
		}else {
			
		}
		
		model.addAttribute("personaList", personaService.getAllPeople());
		return "user-form/user-view";
	}
	
}
