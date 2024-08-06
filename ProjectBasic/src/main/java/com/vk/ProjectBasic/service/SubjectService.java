package com.vk.ProjectBasic.service;

import com.vk.ProjectBasic.Entity.Subject;
import com.vk.ProjectBasic.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }
public Subject saveSubject( Subject sub) {
	return subjectRepository.save(sub);
}
    
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
   
}
