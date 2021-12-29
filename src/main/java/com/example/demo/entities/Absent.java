package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="absent")
public class Absent implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private Date date;
@JoinColumn(name="etudiant")
@ManyToOne
private Etudiant etudiant;
@JoinColumn(name="module")
@ManyToOne
private Module module;
	public Absent() {
		// TODO Auto-generated constructor stub
	}
	public Absent(int id, Date date, Etudiant etudiant, Module module) {
		super();
		this.id = id;
		this.date = date;
		this.etudiant = etudiant;
		this.module = module;
	}	public Absent( Date date, Etudiant etudiant, Module module) {
	
		this.date = date;
		this.etudiant = etudiant;
		this.module = module;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}


}
