package m71exercise4;

import java.util.Scanner;

public class M71Exercise4 {

	public static void main(String[] args) {
		/*L’usuari/ària ha d’introduir dos números, 
		 * el programa retornarà “Un dels dos números és negatiu”, 
		 * només si un dels dos números és negatiu.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me the first number");
		byte first = keyboard.nextByte();
		
		System.out.println("Give me the second number");
		byte second = keyboard.nextByte();
		
		if ((first < 0 && second < 0) || (first < 0 ) || (second < 0)) {
			System.out.println("There is a negative number");
		}
		
	}
	
	

}
