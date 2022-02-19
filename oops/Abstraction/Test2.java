package oops.Abstraction;

public class Test2 {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(10);
		shape.area();
		shape = new Triangle(10,20);
		shape.area();
	}

}
