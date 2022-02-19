package javaProgramming.Mathematics;
import java.util.Scanner;
public class InclusionExclusion {
	//Numbers divisible by a or b in between n
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		double n = sc.nextDouble();
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		System.out.println(union(n,a,b));
	}
	static double union(double n, double a, double b) {
		double c1 = n/a;
		double c2 = n/b;
		double c3 = n/(a*b);
		double res = c1+c2-c3;
		return res;
	}
}
