package oops.javaPassByValueOrReference;

public class PassByValue {

	public static void main(String[] args) {
		int a = 25;
		System.out.println("Before calling "+ a);
		func(a);
		System.out.println("After calling "+ a);
	}
	static void func(int b) {
		b = 10;
		System.out.println(b);
	}
}
