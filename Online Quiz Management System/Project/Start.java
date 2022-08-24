import java.util.*;
import java.lang.*;
import java.io.*;

public class Start {
	private static File file;				
	private static FileWriter writer;		
	private static FileReader reader;		
	private static BufferedReader bfr;
    public static void main(String[] args) {

        /*
        //We are telling the scanner class to read the input from input stream
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char singleChar = scan.next().charAt(0);
        System.out.println(singleChar);
         */
        	
		
		System.out.println("");
		cls();
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("**********  Welcome to Online Quiz  ***********");
		
		System.out.println("");
		System.out.println("");
	
		
		System.out.println("Sign Up");
		System.out.println();
		
		
	
		System.out.println("Enter new id: ");
		String n=sc.nextLine();
		
		System.out.println("Enter new pass: ");
		String p=sc.nextLine();
		
		System.out.println("");
		cls();
		System.out.println("Signed Up Successfully!");
		System.out.println("");
		
		System.out.println("Sign In");
		System.out.println("");
		
		System.out.println("Enter Login id: ");
		String n1=sc.nextLine();
		
		System.out.println("Enter Login pass: ");
		String p1=sc.nextLine();
		
		System.out.println("");
		cls();
		
		if(n1.equals(n) && p.equals(p1))
		{
			System.out.println("Signed In Successfully!");
			System.out.println("");
			
			
			Quiz quiz = new Quiz();
			boolean done = true;
			while (done)
			{
				System.out.println("Enter 1 for Quiz");
				System.out.println("Enter 2 for Registration & get study materials free");
				System.out.println("Enter 3 for Exit");
				
				int x= sc.nextInt();
				
				switch(x)
				{
					case 1:
						System.out.println("");
						cls();
						sc.nextLine();
						System.out.println("Enter Student Name: ");
						String Name=sc.nextLine();
						
						System.out.println("Enter Student Id: ");
						String Id=sc.nextLine();
						Student s=new Student(Name,Id);
						System.out.println("");
						cls();
						quiz.begin();
						s.showDetails();
						System.out.println();
						break;
					case 2:
						System.out.println("");
						cls();
						sc.nextLine();
						System.out.println("Enter Student Name: ");
						String str=sc.nextLine();
						System.out.println("Enter Student ID: ");
						String str1=sc.nextLine();
						System.out.println("Enter E-mail Address: ");
						String str2=sc.nextLine();
						System.out.println("Enter Student Address: ");
						String str3=sc.nextLine();
						try
						{
							file = new File("History.txt");			
							file.createNewFile();					
							writer = new FileWriter(file, true);	
							writer.write("Name: "+str+"\r"+"\n");	
							writer.write("Id: "+str1+"\r"+"\n");
							writer.write("E-mail: "+str2+"\r"+"\n");
							writer.write("Address: "+str3+"\r"+"\n");
							
							writer.flush();							
							writer.close();							
						}
						catch(IOException ioe)
						{
							ioe.printStackTrace();
						}
				
					try
						{
							reader = new FileReader(file);			
							bfr = new BufferedReader(reader);		
							String text="", temp;					
							
							while((temp=bfr.readLine())!=null)		
							{
								text=text+temp+"\n"+"\r";			
							}
							
							System.out.print(text);   				
							reader.close();							
						}
						catch(IOException ioe)
						{
							ioe.printStackTrace();
						}
						done= false;
						break;
						/*try{
							FileWriter writer = new FileWriter("history.txt");
							String ii = sc.nextLine();
							writer.write(ii);
							writer.close();
						}
						catch(IOException e)
						{System.out.println(e);}
						try{
							FileReader reader = new FileReader("history.txt");
							int fileCharacters;
							System.out.println("student details: ");
							while((fileCharacters = reader.read()) != -1)
							{

								System.out.print((char)fileCharacters);
							}
							reader.close();
						}
						catch(IOException e)
						{System.out.println(e);}
						System.out.println(" ");
						done = false;
						break;*/
						case 3:
									System.out.println("");
									cls();

									System.out.println("");

									System.out.println("******************************************************");
									System.out.println("*            Thanks for Using The Program            *");
									System.out.println("******************************************************");

									System.out.println("");

									System.exit(0);

									break;
				        default:
						        
								System.out.println("");
								System.out.println("Invalid Input");
								System.out.println("");
								
				
				}
			}
		}
		else
		System.out.println("OOPS!Invalid id or passwod!");
	}	
	public static void cls()
		{
			try
			{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
