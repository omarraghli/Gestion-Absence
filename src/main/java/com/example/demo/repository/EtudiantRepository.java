package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
