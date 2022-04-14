package com.shopme;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roll;
	
	private String name;


		public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany
	private List<Laptop> laptop= new ArrayList<Laptop>();

	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public Student() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer roll, String name, List<Laptop> laptop) {
		super();
		this.roll = roll;
		this.name = name;
	//	this.n1 = n1;
		this.laptop = laptop;
	}
	
	
	
	
	
	
	
	
}
