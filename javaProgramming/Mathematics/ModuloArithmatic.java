package javaProgramming.Mathematics;

public class ModuloArithmatic {

	public static void main(String[] args) {
		System.out.println(fastPow(44,5));
		System.out.println(fastPower(44,5));
		System.out.println(optimisation(44,5,10000005));

	}
	static int fastPow(int a, int b) {
		int res;
		if(b == 0) {
			return 1;
		}
		if(b % 2 == 0) {
			return res = fastPow(a*a, b/2);
		}
		return res = a * fastPow(a, b-1);
	}
	
	static int fastPower(int a, int b) {		
		int res = 1; 
		while (b > 0) {
		   // If b is odd, multiply a with result
			 if ((b & 1) != 0) {
				 res = res * a;
			 }	 
		   // b must be even now
			 a = a * a;  // Change a to a^2
			 b = b >> 1; // b = b/2
		}
		return res;
	}
	
	static long optimisation(long a, long b, int n) {		
		long res = 1;		
		while ( b > 0) {			
			if ( (b&1) != 0) {
				res = (res % n * a % n) % n;    //(res * a) % n  
			}			
			a = (a % n * a % n) % n;
			b =  b >> 1;
		}		
		return res;		
	}
}
