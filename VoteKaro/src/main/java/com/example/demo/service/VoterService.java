package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Voter;

public interface VoterService {
	
	public Voter saveVoter(Voter voter);
	public List<Voter> voterlist();
	public void deleteById(int id);
	public Voter findById(int id);
	public Voter updateVoter(Voter voter,int id);
	static Voter findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
