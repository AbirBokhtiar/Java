package javaProgramming.Recursion.Advanced;
import java.util.Scanner;
public class FindPathInGrid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grid");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(path(x,y));
	}
	static int path(int n, int m) {
		if(n == 1 || m == 1 ) return 1;
		int res = path(n-1,m) + path(n,m-1);
		return res;
	}
}
