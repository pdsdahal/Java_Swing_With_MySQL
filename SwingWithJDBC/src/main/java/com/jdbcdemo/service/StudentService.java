package com.jdbcdemo.service;

import java.util.List;

import com.jdbcdemo.model.Student;

public interface StudentService {
	public int addStudent(Student student);
	public int updateStudent(Student student);
	public List<Student> getStudents();
	public Student getStudent(int sid);
	public String deleteStudent(int sid);
}
