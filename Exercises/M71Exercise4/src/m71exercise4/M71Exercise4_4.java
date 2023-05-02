package m71exercise4;

import java.util.Scanner;

public class M71Exercise4_4 {

	public static void main(String[] args) {
		/*L’usuari/ària ha d’introduir dos números, 
		 * el programa retornarà “Un dels dos números és negatiu”, 
		 * només si un dels dos números és negatiu.
		 */
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Give me the first number");
		String first = keyboard.nextLine();
		
		System.out.println("Give me the second number");
		String second = keyboard.nextLine();
		
		
		
		
		if (first.length() != second.length()) {
			System.out.println("There is a negative number");
		} 
		
	}
	
	
	

}
