package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Absent;
import com.example.demo.repository.AbsentRepository;
import com.example.demo.repository.ModuleRepository;
import com.example.demo.services.AbsentService;
import com.example.demo.services.EtudiantService;
import com.example.demo.services.ModuleService;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class AbsentController {
@Autowired
private AbsentService abservice;
@Autowired
private ModuleService mdservice;
@Autowired
private EtudiantService etservice;

	public AbsentController() {
		// TODO Auto-generated constructor stub
	}

@GetMapping("/absenceDetails")
public String getModuleDetails(Model model,@RequestParam int id) {
	model.addAttribute("list", etservice.getAll());
	model.addAttribute("mod", mdservice.getOne(id));
	return "moduleDetails";
}
// GetAbsence
@PostMapping("/GetAbsence")
public String gets(@RequestParam(value = "etudiant" , required = false) int[] cers,@RequestParam int idModule) {
	com.example.demo.entities.Module module=mdservice.getOne(idModule);
	for(int i=0;i<cers.length;i++) {
	   abservice.save(new Absent(new Date(),etservice.getById(cers[i]),module)); 
	}
 
	return "moduleDetails";
}
//   @RequestParam(value = "cers" , required = false) int[] cers
}
