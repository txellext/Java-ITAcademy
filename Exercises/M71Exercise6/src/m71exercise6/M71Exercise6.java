package m71exercise6;

import java.util.Scanner;

public class M71Exercise6 {

	public static void main(String[] args) {
		/*
		 * Taula de multiplicar.

			L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant un bucle, 
			el programa li mostrarà la taula de multiplicar d’aquell número.
		 */
		Scanner keyboard = new Scanner(System.in);
		
		final int MAX = 10;
		final int MIN = 1;
		byte number;
		
		do {
			System.out.println("Give me a number between 1 and 10");
			number = keyboard.nextByte();
			
		}while(number < MIN || number>MAX);
		
		for(int i=MIN; i<=MAX; i++) {
			System.out.println(number + " x " + i + " = " + i*number);
		}
	}

}
