package javaProgramming.BitManipulation;
import java.util.Scanner;
public class SumXorSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(sumXor(a,n));
	}
	static int sumXor(int arr[], int n) {
		int bits = 0;
		for(int i=0; i<n; i++) {
			bits |= arr[i];        // 1 | 5 | 6 = 001 | 101 | 110 = 111
		}
		int res = bits * (int)Math.pow(2, n-1);
		return res;
	}	
}
