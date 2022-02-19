import java.util.Scanner;
public class FirstProgram {


	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int dayOfWeek = sc.nextInt(); 
	switch(dayOfWeek) {
	case 1: System.out.println("Saturday");break;
	case 2: System.out.println("Sunday");break;
	case 3: System.out.println("Friday");break;
	default : System.out.println("No day");
	}
		
	}

	
}	

	
	


