package com.arraylist;

public class Employee {
	String name;
	int id;
	Employee()
	{
		
	}
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return "[Employee details :"+name+" "+id;
	}
	

}
