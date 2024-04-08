package com.chaitanya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chaitanya.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
