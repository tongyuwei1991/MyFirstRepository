package com.tom.myFirstRepository.dao;

import com.tom.myFirstRepository.beans.Student;

public interface IStudentDao {
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
