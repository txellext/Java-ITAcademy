package m71exercise3;

import java.util.Scanner;

public class M71Exercise3 {

	public static void main(String[] args) {
		// L’usuari/ària ha d'introduir un número i el programa ha de mostrar 
		//per pantalla si el número és parell o imparell.

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Gime a number");
		int number = keyboard.nextInt();
		
		System.out.println("The number you gave me is " + oddEvenCalcul(number));
		
	}
	
	public static String oddEvenCalcul(int number) {
		String answer;
		
		
		if (number % 2 == 0) {
			answer = "even";
		} else {
			answer = "odd";
		}
		
		return answer;
	}

}
