package com.gl.studentRegistrations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {

	@RequestMapping("/")
	public String handleWelcome() {
		return "welcome to student registration page";
	}
}