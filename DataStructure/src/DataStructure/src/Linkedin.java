package DataStructure.src;

import java.util.*;

class Linkedin {

	public static void main(String[] args) {
	Map m1 = new HashMap<>();
	
	m1.put(1, "Ajit");
	m1.put(2, "Karan");
	//m1.remove(2);
	m1.put(2, "vinod");

	Set s1=m1.entrySet();
	Iterator itr= s1.iterator();
	
	
	while(itr.hasNext())
	{
		//System.out.println(itr.next());
		
		Map.Entry entry = (Map.Entry)itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	
	
				
		
	}
	
}
