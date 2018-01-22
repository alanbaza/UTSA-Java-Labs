import java.text.DecimalFormat;
import java.util.*;

/*This program has two methods:
 * 
 * 1) Calculate future value of an account using compound interest formula and user input
 * 
 * 2) Calculate future value of an annuity using annuity formula and user input
 */
public class FutureValues {

	public static final Scanner CONSOLE = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Lab 3 written by Alan Baza");
		System.out.println("");
		System.out.println("Calculating Future Value Using Compound Interest");
		System.out.println("");
		
		System.out.print("Enter the present value: ");
		double p = CONSOLE.nextDouble();
		
		System.out.print("Enter the interest rate: ");
		double r = CONSOLE.nextDouble();
		
		System.out.print("Enter the number of years: ");
		double y = CONSOLE.nextDouble();
		
		System.out.println("");
		System.out.println("Future value is: " + moneyString(account(p,r,y))); //Calling first method
		System.out.println("");
		
		System.out.println("Calculating Future Value of an Annuity");
		System.out.println("");
		
		System.out.print("Enter the yearly payment: ");
		double p2 = CONSOLE.nextDouble();
		
		System.out.print("Enter the interest rate: ");
		double r2 = CONSOLE.nextDouble();
		
		System.out.print("Enter the number of years: ");
		double y2 = CONSOLE.nextDouble();
		
		System.out.println("");
		System.out.println("Future value is: " + moneyString(annuity(p2,r2,y2))); //Calling second method
		
	}
	
	//Future Value of an Account 
	
	public static double account(double p, double r, double y){
		
		double FV = p*Math.pow(1+r/100, y);
		return FV;
	}
	
	//Future Value of an Annuity
	
	public static double annuity(double p, double r, double y){
		
		double FV = p*((Math.pow(1+r/100, y)-1)/(r/100));
		return FV;
		
	}
	
	//Prints money as a string and ensures two decimal places
	
	public static String moneyString(double amount){
		
		DecimalFormat df = new DecimalFormat("$#0.00");
		return df.format(amount);
		
	}

}
