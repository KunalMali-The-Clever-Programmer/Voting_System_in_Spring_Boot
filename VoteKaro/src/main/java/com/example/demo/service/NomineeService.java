package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Nominee;
import com.example.demo.entity.Voter;
import com.example.demo.repository.NomineeRepository;


@Service
public class NomineeService {
    
    @Autowired
    private NomineeRepository nomineeRepository;
    
    public List<Nominee> getAllNominees() {
        return nomineeRepository.findAll();
    }
    
  

    public Nominee getNomineeById(int id) {
        return nomineeRepository.findById(id).orElse(null);
    }

    public Nominee saveNominee(Nominee nominee) {
        return nomineeRepository.save(nominee);
    }

    public void deleteNominee(int id) {
        nomineeRepository.deleteById(id);
    }
}