package com.chaitanya.service;

import java.util.List;

import com.chaitanya.entity.Student;

public interface StudentService{
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Integer studId);
	
	Student studentUpdate(Student student);
	
	void deleteStudentById(Integer studId);

}
