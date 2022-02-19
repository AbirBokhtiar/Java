package javaProgramming.BitManipulation.UniqueNumber;

public class TwoUnique {

	public static void main(String[] args) {
		int a[] = {2,4,6,7,4,5,6,2};
		uniqueTwo(a,a.length);
	}
	static boolean getBit(int n, int pos) {
		return ((n & (1<<pos)) != 0);
	}
	static int rmSetBit(int n) {        //n = xorAll = 7^5 = 0010
		int pos = 0;
		int check = 1;
		while((n & check) == 0) {       //n & 1 = 0010 & 0001 = 0
			check = check << 1;         //check = 0001 << 1 = 0010
			pos++;                      //pos = 1
		}
		return pos;
	}
	public static void uniqueTwo(int arr[], int n) {
		int xorAll = 0;
		for(int i=0; i<n; i++) {
			xorAll = xorAll ^ arr[i];  //exa: (7^5)0111^0101=0010
		}
		int temp = xorAll;
		int setBit = 0;
		int xorNew = 0;
		for(int i=0; i<n; i++) {
			if(getBit(arr[i], rmSetBit(xorAll))) { //elements that have 1 in pos=1
				xorNew = xorNew ^ arr[i];       //{2^2^6^6^7} = {7}
			}	
		}
		System.out.println(xorNew);
		System.out.println(temp ^ xorNew);
	}
}
