package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	
	@GetMapping(path="/teachers")
	public String getTeachers() {
		List<String> list = Arrays.asList("anu","priya","guna");
		return list.toString();
		
	}
	@GetMapping(path="/teachers/{dept}")
	public String getTeacherByDept(@PathVariable("dept") String dept) {
	List<String> list = Arrays.asList("amar","swetha","sumi");
	
	if(dept.equals("cse")) {
		list = Arrays.asList("amar","swetha","sumi");		
	}
	return list.toString();
	}
	
	@GetMapping(path="/teachers/{id}")
	public String getTeacherById(@PathVariable("id") int id) {
	List<String> list = Arrays.asList("amar","swetha","sumi");

	return "Best Teachers";
	}


}
