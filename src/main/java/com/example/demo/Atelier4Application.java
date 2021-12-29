package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Etudiant;
import com.example.demo.services.EtudiantService;
import com.example.demo.services.EtudiantServiceImp;

@SpringBootApplication
public class Atelier4Application implements CommandLineRunner{
	@Autowired
	EtudiantServiceImp etudiantServiceImp;
public static void main(String[] args) {
	SpringApplication.run(Atelier4Application.class, args);
		
}
@Override
public void run(String... args) throws Exception {

	//etudiantServiceImp.update(new Etudiant(0,"barrou","mouad","p1420155"));
	}

}
