import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/*This program has two methods: 
 * 
 * 1) User inputs number of quarters, dimes and nickels and the program outputs
 * the total number of coins along with the total dollar amount.
 * 
 * 2) User inputs number of cents and the program outputs the least amount of
 * coins needed to form the inputed amount.
 */

public class Coins {

	public static final Scanner CONSOLE = new Scanner(System.in);
	
	
	public static void main(String[] args){
		
		System.out.println("Lab 2 written by Alan Baza");
		System.out.println("");
		Dollars();
		Cents();
		
	}
	
	//This method takes user input for coins and converts it into a dollar amount
	
	public static void Dollars(){
		
		System.out.print("Enter the number of quarters: ");
		int quarters = CONSOLE.nextInt();
		System.out.print("Enter the number of dimes: ");
		int dimes = CONSOLE.nextInt();
		System.out.print("Enter the number of nickels: ");
		int nickels = CONSOLE.nextInt();
		System.out.print("Enter the number of pennies: ");
		int pennies = CONSOLE.nextInt();
	
		int coinsum = quarters+dimes+nickels+pennies;
		
		double q_amount = quarters*0.25;
		double d_amount = dimes*0.10;
		double n_amount = nickels*0.05;
		double p_amount = pennies*0.01;
		
		//This will ensure two decimal places 
		DecimalFormat df = new DecimalFormat("0.00");
		double dollaramount = q_amount+d_amount+n_amount+p_amount;
		
		
		
		System.out.println("");
		System.out.println("Total number of coins: " + coinsum);
		System.out.println("Total dollar amount: " + "$" + df.format(dollaramount));
		
	}
	
	//This method takes user input for cents and displays the least amount of coins needed to make
	
	public static void Cents(){
		
		System.out.println("");
		System.out.print("Enter the number of cents: ");
		int cents = CONSOLE.nextInt();
		
		int qnumber = cents/25;
		int remainq = cents % 25;
		
		int dnumber = remainq/10;
		int remaind = remainq % 10;
		
		int nnumber = remaind/5;
		int remainn = remaind % 5;
		
		int pnumber = remainn;
		
		System.out.println("");
		System.out.println("Number of quarters: " + qnumber);
		System.out.println("Number of dimes: " + dnumber);
		System.out.println("Number of nickels: " + nnumber);
		System.out.println("Number of pennies: " + pnumber);
		
	}
	
}
