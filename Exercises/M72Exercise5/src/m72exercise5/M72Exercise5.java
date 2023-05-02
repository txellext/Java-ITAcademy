package m72exercise5;

import java.util.Scanner;

public class M72Exercise5 {

	public static void main(String[] args) {
		// L'usuari/ària introdueix un nombre per teclat i el programa
		// crida a un mètode que indiqui si el número és primer o no. 

		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a number");
		byte num = keyboard.nextByte();
		
		boolean primeResult = primeNumber(num);
		
		if (primeResult) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

	public static boolean primeNumber(int num) {
		boolean primeResult = true;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				primeResult = false;
			}
		}
		return primeResult;
			
	}
}
