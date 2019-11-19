package com.arraylist;
import java.util.ArrayList;
public class HetroAL {

	
	public static void main(String[] args) {
		ArrayList hetro=new ArrayList();
		hetro.add(new Bike("red",60));
		hetro.add(new Employee("vishnu",1));
		hetro.add("priyanka");
		
		hetro.add(new Movie("Bala",5.0));

		System.out.println(hetro);
		
		
		
		
		
	}

}
