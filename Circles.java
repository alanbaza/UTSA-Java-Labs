package lab5;

import java.util.*;
import java.awt.*;

public class Circles {

	public static final Scanner CONSOLE = new Scanner(System.in);
	
	//This method compares the sizes of the circles
	
	public static int radius(int c1r, int c2r){
	
		return c1r - c2r;
		
	}
	
	//This method determines if the circles intersect
	
	public static double intersect(int c1x, int c1y, int c1r, int c2x, int c2y, int c2r){
		
		return Math.sqrt(Math.pow(c1x - c2x, 2) + Math.pow(c1y - c2y, 2));
		
	}
	
	//This method draws the circles
	
	public static void circle(int x, int y, int r, Graphics g, Color c){
		
		g.setColor(c);
		g.fillOval(x-r, y-r, 2*r, 2*r);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Lab 5 written by Alan Baza");
		
		System.out.println("");
		
		//User input for Circle 1
		
		System.out.println("Circle 1");
		System.out.print("Please enter the circle's radius: ");
		int r1 = CONSOLE.nextInt();
		
		System.out.print("Please enter the x-coordinate of the circle's center: ");
		int x1 = CONSOLE.nextInt();
		
		System.out.print("Please enter the y-coordinate of the circle's center: ");
		int y1 = CONSOLE.nextInt();
		
		
		System.out.println("");
		
		//User input for Circle 2
		
		System.out.println("Circle 2");
		System.out.print("Please enter the circle's radius: ");
		int r2 = CONSOLE.nextInt();
		
		System.out.print("Please enter the x-coordinate of the circle's center: ");
		int x2 = CONSOLE.nextInt();
		
		System.out.print("Please enter the y-coordinate of the circle's center: ");
		int y2 = CONSOLE.nextInt();
		
		System.out.println("");
		
		//User input for Circle 3
		
		System.out.println("Circle 3");
		System.out.print("Please enter the circle's radius: ");
		int r3 = CONSOLE.nextInt();
		
		System.out.print("Please enter the x-coordinate of the circle's center: ");
		int x3 = CONSOLE.nextInt();
		
		System.out.print("Please enter the y-coordinate of the circle's center: ");
		int y3 = CONSOLE.nextInt();
		
		DrawingPanel panel = new DrawingPanel(400, 300);
		Graphics g = panel.getGraphics();
		
		//Methods to draw each circle
		
		circle(x1,y1,r1,g,Color.BLUE);
		circle(x2,y2,r2,g,Color.GREEN);
		circle(x3,y3,r3,g,Color.RED);
	
		System.out.println("");
		
		//if statements to return appropriate values with the method being called three times
		
		if(radius(r1,r2) < 0){
			
			System.out.print("The blue circle is smaller than the green circle.");
			
		}
		
			else if(radius(r1,r2) == 0){
				
				System.out.print("The blue circle is the same size as the green circle.");
		
	}
			else if(radius(r1,r2) > 0){
				
				System.out.print("The blue circle is larger than the green circle.");		
	
			}
		
		System.out.println("");
		
		if(radius(r1,r3) < 0){
			
			System.out.print("The blue circle is smaller than the red circle.");
			
		}
		
			else if(radius(r1,r3) == 0){
				
				System.out.print("The blue circle is the same size as the red circle.");
		
	}
			else if(radius(r1,r3) > 0){
				
				System.out.print("The blue circle is larger than the red circle.");		
	
			}
		
		System.out.println("");
		
		if(radius(r2,r3) < 0){
			
			System.out.println("The green circle is smaller than the red circle.");
			
		}
		
			else if(radius(r2,r3) == 0){
				
				System.out.println("The green circle is the same size as the red circle.");
		
	}
			else if(radius(r2,r3) > 0){
				
				System.out.println("The green circle is larger than the red circle.");		
	
			}
		
			System.out.println("");
			
		//if statements used to return the appropriate value with the method being called three times
			
		if(intersect(x1, y1, r1, x2, y2, r2) <= r1 + r2){
				
				System.out.print("The blue circle intersects the green circle.");
			}
			
			else{
				
				System.out.print("The blue circle does not intersect the green circle.");
				
			}
			
			System.out.println("");
			
			if(intersect(x1, y1, r1, x3, y3, r3) <= r1 + r3){
				
				System.out.print("The blue circle intersects the red circle.");
			}
			
			else{
				
				System.out.print("The blue circle does not intersect the red circle.");
				
			}
			
			System.out.println("");
			
			if(intersect(x2, y2, r2, x3, y3, r3) <= r2 + r3){
				
				System.out.print("The green circle intersects the red circle.");
			}
			
			else{
				
				System.out.print("The green circle does not intersect the red circle.");
				
			}
			
	}
	
}
		
		
	
