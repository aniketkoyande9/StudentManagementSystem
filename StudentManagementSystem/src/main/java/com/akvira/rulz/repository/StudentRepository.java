package com.akvira.rulz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akvira.rulz.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
