package javaProgramming.Recursion.Basic;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(nthfib(6));
	}
	static int nthfib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return nthfib(n-1) + nthfib(n-2);
	}
}
