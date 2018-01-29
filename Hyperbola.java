import java.awt.*;
import java.util.Scanner;

/*This program uses the Graphics object in a DrawingPanel to draw a hyperbola
 * by utilizing a loop. 
 */

public class Hyperbola {

	public static final Scanner CONSOLE = new Scanner(System.in);;
	
	public static final int panelsize = 512;
	
	public static void main(String[] args){
		
		
			DrawingPanel panel = new DrawingPanel(panelsize, panelsize);
			Graphics g = panel.getGraphics();
			
			for(int i = 0; i <= panelsize; i+=32){
				
				g.drawLine(0, i, i, panelsize);
				
			}
			
			for(int i = panelsize; i >= 0; i-=8){
				
				g.drawLine(panelsize, i, i, 0);
				
			}
			
		
	}
	
}

