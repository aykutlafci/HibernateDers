package ders;

import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity
public class Student {
 
	@Id
	private int studentId;
	private String name;
	
	private String surname;
 
	public Student(int studentId, String name, String surname) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
 
}