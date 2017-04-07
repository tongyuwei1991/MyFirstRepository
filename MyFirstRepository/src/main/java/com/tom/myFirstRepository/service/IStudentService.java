package com.tom.myFirstRepository.service;

import com.tom.myFirstRepository.beans.Student;

public interface IStudentService {
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
