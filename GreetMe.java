import java.util.Scanner;

 public class GreetMe 
 {

	public static void main(String[] args) 
	{	
	    Scanner stdin = new Scanner( System.in );
                int kayode = 1;
                int segun = 2;
                char name = 0;
		String usersName; 
		String upperCaseName;

	    System.out.print("Please enter your name: " + name);
	    usersName = stdin.nextLine();
	    upperCaseName = usersName.toUpperCase();
	    if (name ==1 );
	        { 
	       System.out.println("Hi, "+ upperCaseName + ", its nice to meet you on this beautiful day." );
	        } 
	    else if (name == 2);
	        {
	       System.out.println("Hi, "+ upperCaseName + ",its nice to meet you on this beautiful day." );
		}
             else 
                { 
	       System.out.println("Hi,its nice to meet you on this beautiful day." );
                }
	       
    } 
 }
