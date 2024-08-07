package com.example.demo.service;

import org.springframework.context.annotation.Profile;

public interface ProfileService {

	public Profile setProfile(Profile profile);
	
	public Profile getById(int id);
	
	public boolean existById(int id);
}