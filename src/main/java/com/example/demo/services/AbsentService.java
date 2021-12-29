package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Absent;

public interface AbsentService {
public List<Absent> getAll();
public void save(Absent abs);
public void update(Absent abs);
public Absent getOne(int id);
}
