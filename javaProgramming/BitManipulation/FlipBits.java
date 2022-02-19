package javaProgramming.BitManipulation;
import java.util.Scanner;
public class FlipBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		flip(n);
	}
	static void flip(int num) {
		int x = num;
		if(num == 0) {
			System.out.println(1);		
		}	                     // say num = 100000
	    x |= x >> 1;   		 // 100000 | 010000 = 110000
	    x |= x >> 2;    	 // 110000 | 001100 = 111100
	    x |= x >> 4;    	 // 111100 | 000011 = 111111
	    x |= x >> 8;    	 // 111111 | 000000 = 111111
	    x |= x >> 16;    	 // 111111 | 000000 = 111111
	    System.out.println(x - num);      // 100000 | 111111 = 011111
//	    System.out.println(x ^ num);
	}
}
