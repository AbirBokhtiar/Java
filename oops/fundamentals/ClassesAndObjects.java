package oops.fundamentals;

public class ClassesAndObjects {
	
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "Nyan";
		cat1.legs = 4;
		cat1.eyes = 2;
		cat1.color = "white";
		cat1.breed = "persian";
		cat1.walk();
		cat1.description();
	}
}
	class Cat {
		int legs,eyes;
		String name,color,breed;
		public void walk() {
			System.out.println(name+" is walking");
		}
		public void description() {
			System.out.println(name+" has "+legs+" legs and "+eyes+" eyes");
			System.out.println("I have a "+breed+" cat and it's color is "+color);
		}
		
	}