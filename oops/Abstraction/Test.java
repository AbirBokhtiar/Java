package oops.Abstraction;

public class Test {

	public static void main(String[] args) {
		MobileUser ms;
		ms = new Karim();
		ms.sendMessage();
		ms.call();
		ms = new Rahim();
		ms.sendMessage();
	}

}
