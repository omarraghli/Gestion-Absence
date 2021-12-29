package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.EtudiantService;

@Controller
public class EtudiantController {
@Autowired
private EtudiantService etservice;
	public EtudiantController() {
		// TODO Auto-generated constructor stub
	}
	
@GetMapping("/showetudiants")
public String showListEtudiant(Model model) {
	model.addAttribute("list", etservice.getAll());
	return "listEtudiant";
}
@GetMapping("/addetudiant")
public String AddEtudiant(Model model) {
	model.addAttribute("etudiant", new Etudiant());
	return "addEtudiant";
}

@GetMapping("/editetudiant")
public String EditEtudiant(Model model,@RequestParam int id) {
	model.addAttribute("etudiant",etservice.getById(id));
	return "EditEtudiant";
}

@GetMapping("/deletEtudiant")
public String DeleteEtudiant(Model model,@RequestParam int id) {
	etservice.delete(etservice.getById(id));
	return "redirect:/showetudiants";
}

@PostMapping("/saveEtudiant")
public String SaveEtudiant(@ModelAttribute("etudiant") Etudiant etudiant) {
	etservice.save(etudiant);
	return "redirect:/showetudiants";
}
@PostMapping("/updateEtudiant")
public String UpdateEtudiant(@ModelAttribute("etudiant") Etudiant etudiant) {
	etservice.save(etudiant);
	return "redirect:/showetudiants";
}
// updateEtudiant

}
