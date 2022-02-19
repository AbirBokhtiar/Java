package oops.fundamentals;

public class Constructors {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle(4);
		System.out.println(car.wheels);
		Vehicle car2 = new Vehicle("black",4);
		System.out.println("car is "+car2.color+" and it has "+ car2.sits + " sits");
	}

}
//Parameterized Constructor
	class Vehicle {
		int wheels;
		int sits;
		String color;
		
		
//	Vehicle(int noOfWheels) {
//		wheels = noOfWheels;
//		}

	Vehicle(int wheels) {
		this.wheels = wheels;       //this keyword solves the problem of having the same name
	}  
//Contructor overloading
	Vehicle(String color , int sits){
		this.color = color;
		this.sits = sits;
	}
	}