package com.akvira.rulz.Service;

import java.util.List;

import com.akvira.rulz.entity.Student;

public interface StudentService {
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
