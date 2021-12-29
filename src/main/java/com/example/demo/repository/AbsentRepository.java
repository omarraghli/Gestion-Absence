package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Absent;

public interface AbsentRepository extends JpaRepository<Absent, Integer>{

}
