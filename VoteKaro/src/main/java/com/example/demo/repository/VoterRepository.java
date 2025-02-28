package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Integer> {
    Voter findByUsernameAndPassword(String username, String password);
}
