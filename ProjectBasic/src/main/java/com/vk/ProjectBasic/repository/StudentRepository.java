package com.vk.ProjectBasic.repository;

import com.vk.ProjectBasic.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
