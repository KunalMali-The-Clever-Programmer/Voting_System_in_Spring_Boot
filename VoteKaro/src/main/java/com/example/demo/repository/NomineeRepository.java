package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Nominee;

@Repository
public interface NomineeRepository extends JpaRepository<Nominee, Integer> {
	
}