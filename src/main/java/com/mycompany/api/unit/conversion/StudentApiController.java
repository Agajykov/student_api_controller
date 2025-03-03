package com.mycompany.api.unit.conversion;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
public class StudentApiController {
	
	private static List<Student> listStudents = new ArrayList<>();
	
	@GetMapping
	public 	List<Student> list() {
		return listStudents;
	}
}
