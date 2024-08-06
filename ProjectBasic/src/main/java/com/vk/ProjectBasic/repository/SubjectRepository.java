package com.vk.ProjectBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.ProjectBasic.Entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
