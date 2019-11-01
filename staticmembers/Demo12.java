package com.staticmembers;

public class Demo12 {
  static boolean j;
	static
	{
		System.out.println("from Sib of Demo12");
	}
	public static void main(String[] args) {
		System.out.println("from main of Demo12");
		
		System.out.println(Demo11.i);

	}

}
