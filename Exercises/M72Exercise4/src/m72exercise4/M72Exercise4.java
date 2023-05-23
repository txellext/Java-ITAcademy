package m72exercise4;

import java.util.Scanner;

public class M72Exercise4 {

	public static void main(String[] args) {
		/*
		 * Realitzar un programa on l’usuari/ària introdueix un número i el programa crida a un 
		 * mètode que retorna el factorial del número introduït.

			El factorial d'un nombre n (enter, no negatiu) és el producte de tots els nombres enters 
			positius inferiors o iguals a n. 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		do {
			System.out.println("Give me a number bigger or equal to 0");
			number = keyboard.nextInt();
			
		} while(number <0);
		
		if(number==0 || number==1) {
			System.out.println("The result is 1");
		} else {
			System.out.println("The result is " + factorial(number));
		}
	}
	
	public static int factorial(int number) {
		int result = 1;
		for(int i=2; i<=number; i++) {
			result *= i;
		}
		
		return result;
	}

}
