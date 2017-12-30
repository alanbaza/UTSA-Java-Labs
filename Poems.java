/*This program prints the first verse of Mary Had a Little Lamb
 * and the first three verses of This Old Man by calling methods
 * for different lines*/
 
public class Poems {

	
	public static void main(String args[]){
		
		System.out.println("Lab 1 written by Alan Baza");
		System.out.println();
		MHALL();
		TOM();
		
	}
	
	//Method for the first and third line of the first verse of Mary Had a Little Lamb
	
	public static void MHALL13(){
		
		System.out.println("Mary had a little lamb");
		
	}
	
	//Method for the second line of the first verse of Mary Had a Little Lamb
	
	public static void MHALL2(){
		
		System.out.println("Little lamb, little lamb");
		
	}
	
	//Method for the fourth line of the first verse of Mary Had a Little Lamb
	
	public static void MHALL4(){
		
		System.out.println("Its fleece was white as snow");
		System.out.println();
	}
	
	//Method for the refrain of This Old Man
	
	public static void TOMr(){
		
		System.out.println("With a knick-knack patty-whack, give a dog a bone");
		System.out.println("This old man came rolling home");
		System.out.println();
	}

	//Method for the first verse of This Old Man
	
	public static void TOM1(){
		
		System.out.println("This old man, he played one");
		System.out.println("He played knick-knack on my drum");
		TOMr();
		
	}
	
	//Method for the second verse of This Old Man
	
	public static void TOM2(){
		
		System.out.println("This old man, he played two");
		System.out.println("He played knick-knack on my shoe");
		TOMr();
		
	}
	
	//Method for the third verse of This Old Man
	
	public static void TOM3(){
		
		System.out.println("This old man, he played three");
		System.out.println("He played knick-knack on my knee");
		TOMr();
		
	}
	
	//Method for This Old Man
	
	public static void TOM(){
		
		System.out.println("This Old Man");
		System.out.println();
		TOM1();
		TOM2();
		TOM3();
		
	}
	
	//Method for Mary Had a Little Lamb
	
	public static void MHALL(){
		
		System.out.println("Mary Had a Little Lamb");
		System.out.println();
		MHALL13();
		MHALL2();
		MHALL13();
		MHALL4();
		
	}
	
}
