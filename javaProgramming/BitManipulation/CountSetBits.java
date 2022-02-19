package javaProgramming.BitManipulation;
import java.util.Scanner;
public class CountSetBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(countSet(n));
	}
	static int countSet(int n) {
		int count = 0;
		while(n != 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
}
