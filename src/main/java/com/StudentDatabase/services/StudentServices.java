package com.StudentDatabase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDatabase.Entity.StudentEntity;
import com.StudentDatabase.Repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository student;
	
	public StudentEntity AddRecord(StudentEntity db) {
		
		student.save(db);
		return db;
	}

}
