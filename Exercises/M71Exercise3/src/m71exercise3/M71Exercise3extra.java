package m71exercise3;

import java.util.Scanner;

public class M71Exercise3 {

	public static void main(String[] args) {
		// L’usuari/ària ha d'introduir un número i el programa ha de mostrar 
		//per pantalla si el número és parell o imparell.

		
		Scanner keyboard = new Scanner(System.in);
		
		byte number;
		
		do {
			System.out.println("Gime a number");
			number = keyboard.nextByte();
		} while (!evenCalcul(number));
		
		
		System.out.println("The number "+number+" you gave me is even");
		
	}
	
	public static boolean evenCalcul(byte number) {
		return number % 2 == 0;
	}

}
