package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Etudiant;
import com.example.demo.repository.EtudiantRepository;
@Service
public class EtudiantServiceImp implements EtudiantService{
@Autowired
private EtudiantRepository etudiantrep;
	public EtudiantServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return etudiantrep.findAll();
	}

	@Override
	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return etudiantrep.getById(id);
	}

	@Override
	public void delete(Etudiant et) {
		// TODO Auto-generated method stub
		etudiantrep.delete(et);
	}

	@Override
	public void update(Etudiant et) {
		etudiantrep.save(et);
		
	}

	@Override
	public void save(Etudiant et) {
		etudiantrep.save(et);
		
	}

}
