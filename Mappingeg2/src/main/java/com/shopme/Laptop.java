package com.shopme;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private Integer lid;
	
	private String lname;

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Laptop(Integer lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}

	public Laptop() {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
	
	@ManyToMany(mappedBy="laptop")
	private List<Student> student= new ArrayList<>();

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
	
	
}
