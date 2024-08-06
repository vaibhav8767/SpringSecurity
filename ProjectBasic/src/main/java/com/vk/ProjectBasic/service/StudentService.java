package com.vk.ProjectBasic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.ProjectBasic.Entity.Student;
import com.vk.ProjectBasic.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
   
    

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
