package oops.Polymorphism;

public class CompileTime {

	public static void main(String[] args) {
		Person.walk();
		Person.walk(2,"Abir");
		
	}
}
class Person {
	public static void walk() {
		System.out.println("Walking");
	}
	public static void walk(int x, String y) {
		System.out.println("Still walking");
	}
}
