package javaProgramming.Recursion.Basic;

public class Power {

	public static void main(String[] args) {
		System.out.println(pow(4,3));
		System.out.println(fastPow(4,3));
	}
	static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a* pow(a,b-1);
	}
	static int fastPow(int a,int b) {
		if(b==0) {
			return 1;
		}
		if(b % 2 == 0) {
			return fastPow(a*a,b/2);
		}
		return a * fastPow(a,b-1);
	}
}
