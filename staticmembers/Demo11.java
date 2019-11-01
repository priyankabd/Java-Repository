package com.staticmembers;

public class Demo11 {
    static int i;
    static 
    {
    System.out.println("from Sib of Demo11");	
    }
	public static void main(String[] args)
	{
		System.out.println("from main of DEMO11 ");
		System.out.println(Demo12.j);
	}

}
