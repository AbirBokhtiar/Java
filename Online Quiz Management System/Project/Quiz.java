import java.util.*;
import java.lang.*;
public class Quiz
{
	public void begin()
	{
	
		Random r=new Random(); 
	  
		int randomN= r.nextInt(3) + 1;  
	   
        if(randomN == 1)
		{
		System.out.println("                                                   SET A   ");
		System.out.println();
		
			
		Question[] questions = new Question[5];

        questions[0] = new Question("Which of the following is not an OOPS concept?","Encapsulation","Polymorphism","Exception","Abstraction", new Answer("Exception"));
        questions[1] = new Question("Which feature of OOPS described the reusability of code?","Abstraction","Encapsulation","Polymorphism","Inheritance", new Answer("Inheritance"));
        questions[2] = new Question("Which class cannot create its instance?","Parent class","Nested class","Anonymous class","Abstract class", new Answer("Abstract class"));
        questions[3] = new Question("Which class cannot be inherited?","Parent class","Nested class","Final class","Abstract class", new Answer("Final class"));
        questions[4] = new Question("Association means which relationship?","is a","has a","had a","none", new Answer("has a"));

        int countTotal = 0;
        int countRight = 0;
        int countWrong = 0;

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
            System.out.println("C : " +q.getOption3());
            System.out.println("D : " +q.getOption4());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);
			

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                default:
				    answer="is Invalid";
				    break;
            }
            System.out.println("Your answer: " + answer);
			System.out.println("Correct answer: " +q.getAnswer().getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Correct Answer                      ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Wrong Answer                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
		
       }
	
	
	  else if(randomN == 2)
	  {
		System.out.println("                                                   SET B   ");
		System.out.println();
		
		Question[] questions = new Question[5];

        questions[0] = new Question("Modulus operator (%) can be applied to which of these?","Integers","Floating point numbers","Both A and B","None", new Answer("Both A and B"));
        questions[1] = new Question("Division operator has ____ precedence over multiplication operator","Heighest","Least","Equal","None of These", new Answer("Equal"));
        questions[2] = new Question("Which one is a template for creating different objects ?","An Array","A class","Interface","Method", new Answer("A class"));
        questions[3] = new Question("Which class cannot be inherited?","Parent class","Nested class","Final class","Abstract class", new Answer("Final class"));
        questions[4] = new Question("Which of these operators is used to allocate memory to array variable in Java?","alloc","malloc","new malloc","new", new Answer("new"));

        int countTotal = 0;
        int countRight = 0;
        int countWrong = 0;

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
            System.out.println("C : " +q.getOption3());
            System.out.println("D : " +q.getOption4());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                default:
				    answer="is Invalid";
				    break;
            }
            System.out.println("Your answer: " + answer);
			System.out.println("Correct answer: " +q.getAnswer().getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Correct Answer                      ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Wrong Answer                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
		
       }
	
	else if(randomN==3)
	{
		System.out.println("                                                   SET C   ");
		System.out.println();
		Question[] questions = new Question[5];

        questions[0] = new Question("Which is an abstract data type?","Double","String","Enum","Class", new Answer("Class"));
        questions[1] = new Question("Which keyword is used to inherit a class in Java?","inherit"," implement","extend","extends", new Answer("Extends"));
        questions[2] = new Question("Which doesn’t have a body?","Interface","Class","Abstract Method","Method", new Answer("Abstract Method"));
        questions[3] = new Question("Which of the following is common class for exception handling?","Try","Object","Exceptions","Errors", new Answer("Exceptions"));
        questions[4] = new Question("Which of these have highest precedence?","()","++","*","n>>", new Answer("()"));

        int countTotal = 0;
        int countRight = 0;
        int countWrong = 0;

        for(Question q: questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("A : " +q.getOption1());
            System.out.println("B : " +q.getOption2());
            System.out.println("C : " +q.getOption3());
            System.out.println("D : " +q.getOption4());

            String answer = "";

            char ans;
            System.out.println("Enter your answer");
            Scanner scan = new Scanner(System.in);
            ans = scan.next().charAt(0);

            switch(ans)
            {
                case 'A':
                    answer = q.getOption1();
                    break;
                case 'B':
                    answer = q.getOption2();
                    break;
                case 'C':
                    answer = q.getOption3();
                    break;
                case 'D':
                    answer = q.getOption4();
                    break;
                default:
				    answer="is Invalid";
				    break;
            }
            System.out.println("Your answer: " + answer);
			System.out.println("Correct answer: " +q.getAnswer().getAnswer());
            if(answer.equals(q.getAnswer().getAnswer()))
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Correct Answer                      ");
                System.out.println("------------------------------------------------------");
                countRight++;
            }
            else
            {
                System.out.println("------------------------------------------------------");
                System.out.println("                  Wrong Answer                      ");
                System.out.println("------------------------------------------------------");
                countWrong++;
            }
            System.out.println("============================================================================================");
            countTotal++;
        }

        Result result = new Result(countTotal,countRight,countWrong);
        result.showResult();
		
       }
	   
	}
   
}
