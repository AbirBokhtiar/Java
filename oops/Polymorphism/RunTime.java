package oops.Polymorphism;

public class RunTime {
	public static void main(String[] args) {
//		Student d = new Student();
		Student d = new Developer();      //Parent class reference variable d
		d.create();                       //refering to many object
	}
}
class Student {
	public void create() {
		System.out.println("Creating stuff");
	}
}	
class Developer extends Student {
	public void create() {
		System.out.println("Developing stuff");
	}	
}