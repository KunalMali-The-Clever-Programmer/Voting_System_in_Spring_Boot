package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;

public interface AdminService {
	
	public void saveAdmin(Admin admin);
	public List<Admin> adminList();
	public Admin findByUsernameAndPassword(String username, String password);
}
