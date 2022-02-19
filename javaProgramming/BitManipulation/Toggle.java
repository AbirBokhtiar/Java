package javaProgramming.BitManipulation;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bits");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		toggle(n , pos);
	}
	static void toggle(int n, int pos) {
		int mask = 1<<pos;
		int res = n ^ mask;
		System.out.println(res);
	}
}
