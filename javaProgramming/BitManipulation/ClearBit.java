package javaProgramming.BitManipulation;

import java.util.Scanner;

public class ClearBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bits");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		clearBit(n , pos);
	}
	static void clearBit(int n, int pos) {
		int mask = ~(1<<pos);
		int res = n & mask;
		System.out.println(res);
	}
}
