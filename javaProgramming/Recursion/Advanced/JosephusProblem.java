package javaProgramming.Recursion.Advanced;

public class JosephusProblem {
	//Rules - 1.Cannot shoot himself
	//        2.Gun moves to the person after the dead man
	//        3.Can only shoot the person at kth position
	public static void main(String[] args) {
		System.out.println("No." + lastManStanding(5,3));
	}
	static int lastManStanding(int n, int k) {
		if(n == 1) return 0;
		int res = (lastManStanding(n-1,k) + k) % n ;
		return res;
	}
}
