package com.arraylist;
import java.util.ArrayList;
class AL1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add("jyothi");
		
		al.add("priyanak");
		System.out.println(al);
		al.add("anjali");
		System.out.println(al);
		al.add("keerthi");
		al.add("Pinkzzz");
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Object ob=al.set(5, "Resham");
		System.out.println(ob);
		System.out.println(al);
		System.out.println(al.contains("prathi"));
		System.out.println(al.add("megha"));
		System.out.println(al);
		System.out.println(al.indexOf("megha"));
		System.out.println(al.lastIndexOf("jyothi"));
		System.out.println(al.indexOf("priyanak"));
		System.out.println(al.size());
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
