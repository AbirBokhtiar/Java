package javaProgramming.BitManipulation;

public class Conversion {

	public static void main(String[] args) {
		System.out.println(binToDec(111110));
	}
	public static int binToDec(int binary) {
		int decimal = 0, n = 0;
		while(binary > 0) {
			int lastDigit = binary % 10;
			decimal += lastDigit * Math.pow(2,n);
			binary /= 10;
			n++;
		}	
		return decimal;
	}

}
