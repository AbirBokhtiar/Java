package javaProgramming;
import java.util.*;
public class Loops {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int temp = n;
		int revNum= 0;
		while(temp>0) {
			int lastDigit = temp%10;
			revNum = revNum*10 + lastDigit;
			temp = temp/10;	
		}
		if(revNum == n & revNum!=0) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
	
		}
	}		
}


