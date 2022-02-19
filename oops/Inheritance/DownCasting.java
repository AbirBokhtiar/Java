package oops.Inheritance;

public class DownCasting {

	public static void main(String[] args) {
		Animal myPet = new Dog();
		Cat myCat = new Cat();
		allAnimal(myPet);
	}
	public static void allAnimal(Animal animal) {
		animal.makeNoise();
		if(animal instanceof Dog) {
			Dog myDog = (Dog)animal;
			myDog.growl();
		}
	}
}
