package com.StudentDatabase.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentDatabase.Entity.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository <StudentEntity, Integer> {

}