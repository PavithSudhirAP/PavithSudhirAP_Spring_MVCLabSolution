package com.gl.studentRegistrations.service;

import java.util.List;

import com.gl.studentRegistrations.entity.Student;


public interface StudentService {

	List<Student> listAll();

	Student findById(int theId);

	void save(Student thestudent);

	void deleteById(int theId);

}