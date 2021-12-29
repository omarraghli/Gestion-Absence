package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Etudiant;

public interface EtudiantService {
public List<Etudiant> getAll();
public Etudiant getById(int id);
public void delete(Etudiant et);
public void update(Etudiant et);
public void save(Etudiant et);

}
