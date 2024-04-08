package com.chaitanya.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chaitanya.entity.Student;
import com.chaitanya.repository.StudentRepository;
import com.chaitanya.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Integer studId) {
		
		return studentRepo.findById(studId).get();
	}

	@Override
	public Student studentUpdate(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Integer studId) {
		
		studentRepo.deleteById(studId);
		
	}

}
