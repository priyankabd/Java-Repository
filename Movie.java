package com.arraylist;

public class Movie {
String name;
double ratings;
Movie()
{
	
}
Movie(String name,double ratings)
{
	this.name=name;
	this.ratings=ratings;
}
public String toString()
{
	return name+" "+ratings;
}
}
