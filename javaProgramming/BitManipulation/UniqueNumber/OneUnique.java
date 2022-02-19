package javaProgramming.BitManipulation.UniqueNumber;

public class OneUnique {

	public static void main(String[] args) {
		int a[] = {1,1,2,3,4,5,6,3,5,6,4};
		System.out.println(uniqueOne(a, 11));
	}	
	static int uniqueOne(int arr[], int n) {
		int res = 0;
		for(int i=0; i<n; i++) {
			res = res ^ arr[i];
		}
		return res;
	}
}
