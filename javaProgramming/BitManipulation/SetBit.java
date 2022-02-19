package javaProgramming.BitManipulation;
import java.util.*;
public class SetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bits");
		int n = sc.nextInt();
		int pos = sc.nextInt();
		setBit(n , pos);
	}
	static void setBit(int n, int pos) {
		int mask = 1<<pos;
		int res = n|mask;
		System.out.println(res);
		
	}
}
