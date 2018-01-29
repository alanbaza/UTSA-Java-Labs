package project1;

import java.util.*;


/*This program has two tasks:
 * 
 * 1) Creates a text box with a number of rows and columns given by the user
 * 
 * 2) Creates a triangle pattern with a width given by the user
 * 
 */

public class Patterns {

	public static final Scanner CONSOLE = new Scanner (System.in);
	
	//This method creates the text box
	
	public static void box(){
		
		//Prompts the user to enter desired dimensions
		
		System.out.print("Please enter the number of rows: ");
		final int rows = CONSOLE.nextInt();
		System.out.print("Please enter the number of columns ");
		final int col = CONSOLE.nextInt();
		System.out.println();
		
		//The first row of the text box
		
		System.out.print("+");
		
		for (int i = 2; i <= col - 1; i++){
			
			System.out.print("-");						
		}
		
		System.out.print("+\n");
		
		//The left side of the text box
		
		for (int j = 2; j <= rows - 1; j++){
			
		System.out.print("|");
			
			//Ensures the correct amount of $ characters inside the text box
			
			for (int k = 0; k < col-2; k++){
			System.out.print("$");
			}
			
		//The right side of the text box
			
		System.out.print("|\n");
		
		}
		
		//The last row of the text box
		
		System.out.print("+");
		
		for (int i = 2; i <= col - 1; i++){
			
			System.out.print("-");
		}
		
		System.out.print("+\n");
		System.out.println();
	}
	
	
	//This method creates the triangle pattern
	
	public static void triangle(){
		
		//Prompts the user to enter desired width
		
		System.out.print("Please enter the width: ");
		final int width = CONSOLE.nextInt();
		final int height = width / 2;
		System.out.println();
		
		//Controls the height and spacing
		
		for(int k = 1; k <= height; k++){
			
			for(int x = 2; x <= k; x++){
			
			System.out.print(" ");
			
			} 	
			
			//Left side of the triangle
			
			System.out.print("\\");
			
				//Zeroes 
			
				for(int y = k; y <= (width - 2)-(k-1); y++){
					
					System.out.print("0");
				}
			
			//Right side of the triangle
				
			System.out.print("/\n");
					
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Project 1 written by Alan Baza\n");
		box();
		triangle();
	}
}
