package javaProgramming.BitManipulation;

import java.util.Scanner;

public class GetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bits");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		getBit(n , pos);
		
	}
		static void getBit(int n , int pos) {
		int mask = 1<<pos;	
		int res = n & mask;
		System.out.println(res);
		if(res == 0) { 
			System.out.println("bit is 0");
		}
		else {  
			System.out.println("bit is 1");
		}
		
	}
}
