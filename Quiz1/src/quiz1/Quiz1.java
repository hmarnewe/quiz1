package quiz1;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);	//Create scanner object to read input from user
	
	//Ask user for input on the quarterback's statistics
	System.out.println("Enter the number of touchdowns: ");
	double TD = in.nextDouble();
	
	System.out.println("Enter the total yards: ");
	double YDS = in.nextDouble();
	
	System.out.println("Enter the number of interceptions: ");
	double INT = in.nextDouble();
	
	System.out.println("Enter the number of completions: ");
	double COMP = in.nextDouble();
	
	System.out.println("Enter the number of passes attempted: ");
	double ATT = in.nextDouble();
	
	//Calculate the quarterback rating 
	double a = 5*((COMP/ATT)-.3);
	double b = .25*((YDS/ATT)-3);
	double c = 20*(TD/ATT);
	double d = 2.375-((INT/ATT)*25);
	double qbRating = (((a+b+c+d)/6)*100);
	
	System.out.printf("The quarterback's passing rate is: %4.1f", qbRating);
	in.close();
}
}