package oops.Inheritance;

public class UpCasting {

	public static void main(String[] args) {
		Animal myPet = new Dog();
		Cat myCat = new Cat();    //we can use this also instead of Animal
		allAnimal(myCat);
		myPet.makeNoise();
	}
	public static void allAnimal(Animal animal) {    //we can make any animal make noise as long as it's a child of the Animal class 
		animal.makeNoise();							//and have their specific methods that are overridden
	}
}
