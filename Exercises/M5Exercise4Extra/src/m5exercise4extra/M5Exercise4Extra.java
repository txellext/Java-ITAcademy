package m5exercise4extra;

import java.util.Scanner;

public class M5Exercise4Extra {

	public static void main(String[] args) {
		/*
		 * Has de modificar el programa anterior (M5Exercise3) per afegir una 
		 * nova funcionalitat: establir un número màxim de 5 intents.

		Si l’usuari/ària encerta el número escollit pel programa abans 
		d'aquests 5 intents, el programa mostra el següent missatge per 
		pantalla: “Enhorabona, el número és X i has necessitat Y intents per 
		encertar-lo”.

		Si no encerta el número abans de 5 intents, el programa mostra per 
		pantalla: "Has utilitzat massa intents! El número és X ".
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		byte randomNum = (byte) Math.ceil((Math.random() * 10));
		byte guessNum;
		byte tries = 0;
		final byte MAXTRIES = 5;
		final byte MAXNUM = 10;
		final byte MINNUM = 0;
		
		
		do {
			System.out.println("Guess the number typing a number");
			guessNum = keyboard.nextByte();
			
			if (guessNum > randomNum) {
				System.out.println("The number typed is greater than random number");			
			} else if (guessNum < randomNum) {
				System.out.println("The number typed is lower than random number");
			} 
			
		}
		while(randomNum != guessNum && tries < MAXTRIES);
		
		
		
		if (randomNum == guessNum) {
			System.out.println("Congrats! the guessing number was " + randomNum + 
					" and you needed "+ tries + " tries");
		} else {
			System.out.println("You used " +MAXTRIES+ " tries. The number was "+randomNum);
		}
		
		
	}
}
