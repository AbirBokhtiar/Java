package javaProgramming.Mathematics;
import java.util.Scanner;
public class TrailingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		factorialTrail(n);
	}
	static void factorialTrail(int n) {
		int res = 0;
		for(int i=5; i<=n; i=i*5) {
			res += n/i;
		}
//		while(n!=0) {
//			res += n/5;
//			n = n/5;
//		}
		System.out.println(res);
	}
}
