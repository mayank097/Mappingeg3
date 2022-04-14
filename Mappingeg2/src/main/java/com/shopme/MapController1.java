package com.shopme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapController1 {
	
	@Autowired
	public MapRepo r1;
	@Autowired
	public MapRepo2 r2;
	
	@Autowired
	public MapRepo3 r3;
	

	

	@GetMapping("/get")
	public String knew() {
		Student s1= new Student();
		
		
		s1.setRoll(1);
		s1.setName("naveen");
		
		
		Name n1= new Name();
		n1.setFname("ma");
		n1.setMname("ku");
		n1.setLname("Th");
				
				
	//	s1.setN1(n1);
		
		
		Laptop l1= new Laptop();
		l1.setLid(1);
		l1.setLname("Dell");
		
		//s1.setLaptop(l1);
          s1.getLaptop().add(l1);
		//l1.setStudent(s1);
		
		//l1.getStudent().add(s1);
		
		r2.save(l1);
		
		r1.save(s1);
		
		r3.save(n1);
		
	String f1=r3.getById(1).getFname();
		
		return f1;
	}
	
}
