package m5exercisee4;

import java.util.Scanner;

public class M5Exercisee4 {

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
		
		
		do {
			System.out.println("Guess the number typing a number");
			guessNum = keyboard.nextByte();
			tries += 1;
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

/*for (int i = 1; i <= 5; i++) {
System.out.println("Guess the number typing a number");
guessNum = keyboard.nextByte();

if (randomNum == guessNum) {
	System.out.println("Congrats! the guessing number was " + randomNum + " and you needed "+ i + " tries");
	break;
}

if (i == 5) {
	System.out.println("Tries exceeded! The number was "+randomNum);
}*/