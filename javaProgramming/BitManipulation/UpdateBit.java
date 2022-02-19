package javaProgramming.BitManipulation;

import java.util.Scanner;

public class UpdateBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bits");
		int n = sc.nextInt();
		System.out.println("Enter position");
		int pos = sc.nextInt();
		System.out.println("Enter bit to set");
		int set = sc.nextInt();
		updateBit(n , pos, set);
	}
	static void updateBit(int n, int pos, int set) {
		int mask = 1<<pos;
		if(set == 1) {
			int newNum = n|mask;
			System.out.println(newNum);
		}
		else if(set == 0){
			int newMask = ~(mask);
			int newNum = n & newMask;
			System.out.println(newNum);
		}
	}

}
