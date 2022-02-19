package oops.fundamentals;

public class Methods {

	public static void main(String[] args) {
		System.out.println(maxOf(3,2));
		System.out.println(maxOf(2.3f,2.6f));
	}
	

	public static int maxOf(int a, int b) {
		return a>b?a:b;
	}
	public static float maxOf(float a, float b) {
		return a>b?a:b;
	}
}
