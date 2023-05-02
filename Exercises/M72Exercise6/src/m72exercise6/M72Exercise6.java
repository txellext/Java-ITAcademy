package m72exercise6;

import java.util.Scanner;

public class M72Exercise6 {

	public static void main(String[] args) {
		/*
		 * L’usuari/ària ha d’introduir números fins que introdueixi un nombre primer. 

		En el moment que l’usuari/ària introdueixi un nombre primer, el programa ha de treure per 
		pantalla el següent missatge: "Exacte, el número “x” és primer!"
		 */
		
		primeNumber();
		
	}

	public static void primeNumber() {
		Scanner keyboard = new Scanner(System.in);
		
		byte num;
		boolean primeResult;
			
		do {
			int i = 2;
			primeResult = true;
			System.out.println("Give me a number");
			num = keyboard.nextByte();
			
			while(primeResult && i < num) {
				if (num%i == 0) {
					primeResult = false;
				} 
				i++;
			}
			
			
		} while (primeResult == false);
		
		System.out.println("Congrats! The number " + num + " is prime!");
		
		
			
	}
}
