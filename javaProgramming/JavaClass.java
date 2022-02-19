package javaProgramming;
import java.util.*;
public class JavaClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;		 
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n-2;i++) {
			int c =a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
//		int petals = sc.nextInt();
//		if(petals<0) {
//			System.out.println(petals);
//		}
//		
//		else if(petals%2 ==0) { 
//			System.out.println(petals);
//		}
//		else {
//			System.out.println(petals);
//		}

	}
}