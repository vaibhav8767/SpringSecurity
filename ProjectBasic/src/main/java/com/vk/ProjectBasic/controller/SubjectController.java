package com.vk.ProjectBasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.ProjectBasic.Entity.Student;
import com.vk.ProjectBasic.Entity.Subject;
import com.vk.ProjectBasic.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;
    @PostMapping("/save")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject  sub) {
        Subject sab = subjectService.saveSubject(sub);
        return new ResponseEntity<>(sab, HttpStatus.CREATED);
    }
    
    
    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
