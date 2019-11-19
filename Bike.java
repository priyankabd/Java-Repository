package com.arraylist;

public class Bike {
	String color;
	double milage;
	Bike()
	{
		
	}
	Bike(String color,double mileage)
	{
		this.color=color;
		this.milage=milage;
	}
public String toString()
{
	return "[Bike details :"+color+" "+milage+"]";
}
}
