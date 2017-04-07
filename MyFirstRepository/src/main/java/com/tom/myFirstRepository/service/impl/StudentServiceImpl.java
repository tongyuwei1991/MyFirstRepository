package com.tom.myFirstRepository.service.impl;

import com.tom.myFirstRepository.beans.Student;
import com.tom.myFirstRepository.dao.impl.StudentDaoImpl;
import com.tom.myFirstRepository.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	private StudentDaoImpl studentDao;

	
	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentServiceImpl(StudentDaoImpl studentDao) {
		super();
		this.studentDao = studentDao;
	}


	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.addStudent(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
	}

	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(student);
	}
}
