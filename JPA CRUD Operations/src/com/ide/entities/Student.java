package com.ide.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greet")
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private int studentid;
	private String name;
	public int getstudentid()
	{
	return studentid;
	}
	public void setstudentid(int studentid) {
		this.studentid = studentid;
		}
		public String getname() {
		return name;
		}
		public void setname(String name) {
		this.name = name;
		}

}
