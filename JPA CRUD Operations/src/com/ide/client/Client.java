package com.ide.client;

import com.ide.entities.Student;
import com.ide.service.StudentService;
import com.ide.service.StudentServiceImpl;

public class Client
{

	public static void main(String[] args)
	{
		
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		// Create Operation
		student.setstudentid(101);
		student.setname("Kapil");
		service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getstudentid());
		System.out.println(" Name:"+student.getname());
		
		// Update Operation
		student = service.findStudentById(100);
		student.setname("Hitesh Piwal");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getstudentid());
		System.out.println(" Name:"+student.getname());
		
		//at this breakpoint, record is removed from table
		// Delete Operation
		student = service.findStudentById(100);
		service.removeStudent(student);
		System.out.println("End of program/Life cycle completed...");
		
	}

}
