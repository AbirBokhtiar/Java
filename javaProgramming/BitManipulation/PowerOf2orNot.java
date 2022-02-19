package javaProgramming.BitManipulation;
import java.util.Scanner;
public class PowerOf2orNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(isPowerOf2(n)? "Yes":"No");
	}
	static boolean isPowerOf2(int n) {
		boolean res = ( n!=0 && ((n & (n-1)) == 0) );
		return res;
	}
	
}
