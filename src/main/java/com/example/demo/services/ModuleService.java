package com.example.demo.services;

import java.util.List;
import com.example.demo.entities.Module;
public interface ModuleService {
public List<Module> getAll();
public Module getOne(int id);
}
