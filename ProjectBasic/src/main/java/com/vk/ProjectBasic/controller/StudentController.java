package com.vk.ProjectBasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vk.ProjectBasic.Entity.Student;
import com.vk.ProjectBasic.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	  @Autowired
	    private StudentService studentService;

	  @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        Student savedStudent = studentService.saveStudent(student);
	        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	    }
       
	    @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }
}
