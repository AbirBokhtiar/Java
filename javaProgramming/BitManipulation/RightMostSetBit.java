package javaProgramming.BitManipulation;
import java.util.*;
public class RightMostSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(rmSetBit(n));
		System.out.println(getFirstSetBitPos(n));
	}	
	static int rmSetBit(int n) {
		int pos = 0;
		int check = 1;
		while((n & check) == 0) {
			check = check << 1;
			pos++;
		}
		return pos;
	}
	static int getFirstSetBitPos(int n) {
	    int res = 0;
		res = (int)((Math.log10(n & -n)) / Math.log10(2)) ;
		return res;
	}
}