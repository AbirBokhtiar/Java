package javaProgramming.BitManipulation;
import java.util.*;
public class PrintAllSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n;i++) {
			a[i] = sc.nextInt();
		}
		subSets(a,n);
	}
	static void subSets(int arr[], int n) {        
		// (1<<j) is a number with jth bit 1
        // so when we '&' them with the
        // subset number we get which numbers
        // are present in the subset and which are not
        
		for(int i=0; i<(1<<n); i++) {           
			System.out.print("{ ");
			for(int j=0; j<n; j++) {
				if( (i & (1<<j)) > 0) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.print("}");
			System.out.println();
		}
	}
}
