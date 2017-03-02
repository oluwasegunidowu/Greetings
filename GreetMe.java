import java.util.Scanner;

 public class GreetMe 
 {

	public static void main(String[] args) 
	{
		
		Scanner stdin = new Scanner( System.in );
		
		 String usersName; 
		  String upperCaseName;
	        
		   System.out.print("Please enter your name: ");
	        usersName = stdin.nextLine();
		
		     upperCaseName = usersName.toUpperCase();
		
		      System.out.println("Hi " + upperCaseName +","
		       + " its nice to meet you on this beautiful day." );

	}

}
