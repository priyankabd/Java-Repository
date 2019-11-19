package com.Abstractclass;

public class Jungle {

	
	public static void main(String[] args) {
     	Dog d=new Dog(12,22);
		Lion lion=new Lion(50,55);
		System.out.println(d.height+" "+d.weight);
		d.talk();
		System.out.println(lion.height+" "+lion.weight);
		lion.talk();
		
			
     }

}
