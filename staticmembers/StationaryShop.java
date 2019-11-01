package com.staticmembers;

class StationaryShop {

	
	public static void main(String[] args) {
					
			
			System.out.println(Marker.price);
			System.out.println(Marker.color);
			Marker.price=100;
			Marker.color="black";
			Marker.price=80;
			Marker.color="blue";
			Marker.writing();
			System.out.println("Marker color is "+Marker.color+" "+"Marker price is "+Marker.price);
			

	}

}
