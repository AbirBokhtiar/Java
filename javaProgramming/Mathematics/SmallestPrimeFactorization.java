package javaProgramming.Mathematics;
import java.util.Scanner;
public class SmallestPrimeFactorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		primeFactor(n);
	}
	static void primeFactor(int n) {
		int spf[] = new int[n+1];
//		spf[n] = 0;
//		fill(spf,0);
		for(int i=2; i<=n; i++) {
			spf[i] = i;       //Assigning every number's spf itself bcz
			                  //Prime number's spf is itself
		}
		for(int i=2; i<=n; i++) {
			if(spf[i]==i) {
				for(int j=i*i; j<=n; j+=i) {
					if(spf[j]==j) {      //spf[4]=4 bcz spf[i]=i so spf[j]=j
						spf[j] = i;         
					}
				}
			}
		}
		while(n!=1) {
			System.out.print(spf[n]+" ");   //spf[6]-->2
			n = n/spf[n];    //Exa : 6/2->3/3->1
		}
	}

}
