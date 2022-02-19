package javaProgramming.BitManipulation;

public class XorCompute {

	public static void main(String[] args) {
		System.out.println(xORCompute(4));
	}
	static int xORCompute(int n) {
		if(n % 4 == 0) return n;
		if(n % 4 == 1) return 1;
		if(n % 4 == 2) return n+1;
		else return 0;
	}
}
