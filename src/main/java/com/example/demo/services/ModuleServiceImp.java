package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ModuleRepository;
import com.example.demo.entities.Module;
@Service
public class ModuleServiceImp implements ModuleService{
@Autowired
ModuleRepository moderep;
	public ModuleServiceImp() {
		
	}

	@Override
	public List<Module> getAll() {

		return moderep.findAll();
	}

	@Override
	public com.example.demo.entities.Module getOne(int id) {
		// TODO Auto-generated method stub
		return moderep.findById(id).get();
	}

}
