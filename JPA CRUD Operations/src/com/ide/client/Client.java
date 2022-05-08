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
//		student.setstudentid(104);
//		student.setname("Mummy");
//		service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
//		student = service.findStudentById(100);
//		System.out.print("ID:"+student.getstudentid());
//		System.out.println(" Name:"+student.getname());
		
		// Update Operation
//		student = service.findStudentById(101);
//		student.setname("Hitesh Piwal");
//		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
//		student = service.findStudentById(100);
//		System.out.print("ID:"+student.getstudentid());
//		System.out.println(" Name:"+student.getname());
		
	
		// Delete Operation
//		student = service.findStudentById(10);
//		service.removeStudent(student);
//		System.out.println("End of program/Life cycle completed...");
	
		//at this breakpoint, record is removed from table
	}

}
