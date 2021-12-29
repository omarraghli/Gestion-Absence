package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.services.ModuleService;

@Controller
public class ModuleController {
	@Autowired
	private ModuleService etservice;
	public ModuleController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/moduleDetails")
	public String showModule(Model model) {
		model.addAttribute("list", etservice.getAll());
		return "listModule";
	}
	
	
}
