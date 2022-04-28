package com.ide.dao;

import javax.persistence.EntityManager;
import com.ide.entities.Student;

public class StudentDAOImpl implements StudentDAO
{
	private EntityManager entityManager;
	public StudentDAOImpl()
	{
	entityManager = JPA_Util.getEntityManager();
	}
	
	@Override
	public Student getStudentById(int id) {
	Student student = entityManager.find(Student.class, id);
	return student;
	}
	@Override
	public void addStudent(Student student) {
	entityManager.persist(student);
	}
	@Override
	public void removeStudent(Student student) {
	entityManager.remove(student);
	}
	@Override
	public void updateStudent(Student student) {
	entityManager.merge(student);
	}
	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}	
	
}
