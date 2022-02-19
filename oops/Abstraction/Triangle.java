package oops.Abstraction;

public class Triangle extends Shape {
	Triangle(double a,double b) {
		super(a,b);
	}
	void area() {
		double result = 0.5 * dim1 * dim2;
		System.out.println("Triangle area is "+ result);
	}
}
