package m71exercise3;

import java.util.Scanner;
public class M71Exercise3extra2 {

	public static void main(String[] args) {
		// L’usuari/ària ha d'introduir un número i el programa ha de mostrar 
		//per pantalla si el número és parell o imparell.

		
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		int counter = 0;
		int[] numbersList = null;
		int[] odd = null;
		int [] even = null;
		
		do {
			System.out.println("Gime a number");
			number = keyboard.nextInt();
			numbersList.add(number);
			counter ++;
		} while (!evenCalcul(number));
		
		for (int i = 0; i <= counter; i++) {
			if(numbersList[i] % 2 == 0) {
				even.add(numbersList[i]);
			} else {
				odd.add(numbersList[i]);
			}
		}
		
		System.out.println("The number "+numbersList[(numbersList.length - 1)]+" you gave me is even, and"
				+ "before you add these "+(even.length)+"even numbers "+even+ "and these "+(odd.length)+" odd numbers"+odd);
		
	}
	
	public static boolean evenCalcul(int number) {
		return number % 2 == 0;
	}

}
