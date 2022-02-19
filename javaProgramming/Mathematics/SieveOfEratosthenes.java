package javaProgramming.Mathematics;
import java.util.Scanner;
import java.util.Arrays;
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		sieve(n);
	}
	static void sieve(int n) {
		int prime[] = new int[n+1];
//		Arrays.fill(prime, 1);
		fill(prime,1);
		for(int i=2; i<=n; i++) {
			if(prime[i]==1) {
				for(int j=i*i; j<=n; j+=i) {
					prime[j] = 0;
				}
			}
		}
		for(int i=2; i<=n; i++) {
			if(prime[i]==1) {
				System.out.print(i+" ");
			}
		}
	}
	public static void fill(int[] a, int value) {
		for(int i=0; i<a.length;i++) {
			a[i] = value;
		}
	}
}
