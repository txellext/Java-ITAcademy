package m5exercise3;

import java.util.Scanner;

public class M5Exercise3 {

	public static void main(String[] args) {
		/*
		 * Aquesta línia de codi:

			Math.ceil((Math.random() * 10)); 
		Retorna un número entre el 1 i el 10 de 
		forma aleatòria.

		L’exercici consisteix a què l’usuari/ària ha 
		d'endevinar el número escollit aleatòriament pel 
		programa.

		El programa, demana números a l’usuari/ària 
		fins que aquest encerti el número aleatori 
		generat pel programa.

		Un cop l’usuari/ària ha endevinat el número, 
		es mostrarà per pantalla el següent missatge: 
		“Enhorabona, el número era X”
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		byte randomNum;
		byte guessNum;
		byte tries = 0;
		
		randomNum = (byte) Math.ceil((Math.random() * 10));
		
		do {
			System.out.println("Guess the number typing a number");
			guessNum = keyboard.nextByte();
				tries += 1;
		}
		while(randomNum != guessNum);
		
		System.out.println("Congrats! the guessing number was " + randomNum + " and you needed "+ tries + "tries");
	}

}
