package javaProgramming.Mathematics;
import java.util.Scanner;
public class EuclidGCD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a =sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println(gcd(a, b));
	}
//	static int gcd(int a, int b) {
//		return a%b == 0? b : gcd(b, a%b);
//	}
	static int gcd(int a, int b) {
		while(b!=0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
}
