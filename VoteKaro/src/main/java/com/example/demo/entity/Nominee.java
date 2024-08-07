package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nominee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Nominee [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	public Nominee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nominee(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
    
    



}
 