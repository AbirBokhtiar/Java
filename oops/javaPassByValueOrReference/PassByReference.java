 package oops.javaPassByValueOrReference;

public class PassByReference {

	public static void main(String[] args) {
		CallByReference r1 = new CallByReference();
		r1.name = "Abir";
		System.out.println("Before calling "+ r1.name);
		r1.changeName(r1);
		System.out.println("After calling "+ r1.name);
	}
}
class CallByReference {
	String name;
	void changeName(CallByReference r2) {
		r2.name = "Bokhtiar";
	}
}


