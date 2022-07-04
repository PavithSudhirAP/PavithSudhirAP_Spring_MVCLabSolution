package com.gl.studentRegistrations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.studentRegistrations.entity.Student;
import com.gl.studentRegistrations.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/list")
	public String handleListStudents(Model theModel) {

		List<Student> students = studentService.listAll();

		theModel.addAttribute("students", students);

		return "students-lister";
	}

}