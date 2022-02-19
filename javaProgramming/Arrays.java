package javaProgramming;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimention for A");
		int aRow = sc.nextInt();
		int aCol = sc.nextInt();
		System.out.println("Enter dimention for B");
		int bRow = sc.nextInt();
		int bCol = sc.nextInt();
		if(aCol != bRow) {
			System.out.println("Invalid");
		}
		else {
			int a[][] = new int [aRow][aCol];
			int b[][] = new int[bRow][bCol];
			int c[][] = new int[aRow][bCol];
			System.out.println("Enter array a");
			for(int i=0;i<aRow;i++) {
				for(int j=0;j<aCol;j++) {
					a[i][j]= sc.nextInt();
				}
			}	
			System.out.println("Enter array b");
			for(int i=0;i<bRow;i++) {
				for(int j=0;j<bCol;j++) {
					b[i][j]= sc.nextInt();
				}	
			}
			
			for(int i=0;i<aRow;i++) {
				for(int j=0;j<bCol;j++) {
					c[i][j] = 0;
					for(int k=0;k<aCol;k++) {
					c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			System.out.println("Result array c is ");
			for(int i=0;i<aRow;i++) {
				for(int j=0;j<bCol;j++) {
					System.out.print(c[i][j]+" ");
				} 
				System.out.println();
			}
		}	
	}

}
