package com.StudentDatabase.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDatabase.Entity.StudentEntity;
import com.StudentDatabase.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServices services;
	
	
	@PostMapping("/home")
	public StudentEntity insert(@RequestBody StudentEntity db) {
		
		services.AddRecord(db);
		
		return db;
	}

}
