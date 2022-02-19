package javaProgramming.BitManipulation.UniqueNumber;

public class UniqueInTriplets {

	public static void main(String[] args) {
		int a[] = {1,6,2,6,4,2,1,1,6,2};
	    int n = a.length;
	    int k = 3;
	    System.out.println(unique(a, n, k));
	}
	public static int unique(int arr[], int n, int k) {
		int res = 0;
	    int INT_SIZE = 8 * n;
	    int count[] = new int[INT_SIZE];
		for(int i=0; i<INT_SIZE; i++) {
			for(int j=0; j<n; j++) {
				if(getBit(arr[j], i)) {     //ith bit 1 or not in arr[j]
					count[i]++;                  
				}
			}	
			if(count[i] % k !=0) {         //every 1 in ith position
				res = setBit(res, i);      //res = 000 | 100 = 100 (4)
			}
		}
		return res;
	}
	static boolean getBit(int n, int pos) {
		return ((n & (1<<pos))!=0);
	}
	static int setBit(int n, int pos) {
		return (n | (1<<pos));
	}
}
