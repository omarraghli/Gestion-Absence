package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Absent;
import com.example.demo.repository.AbsentRepository;
@Service
public class AbsentServiceImp implements AbsentService{
@Autowired
AbsentRepository absrep;
	public AbsentServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Absent> getAll() {

		return absrep.findAll();
	}

	@Override
	public void save(Absent abs) {
		absrep.save(abs);
		
	}

	@Override
	public void update(Absent abs) {
		absrep.save(abs);
		
	}

	@Override
	public Absent getOne(int id) {
		// TODO Auto-generated method stub
		return absrep.getById(id);
	}

}
