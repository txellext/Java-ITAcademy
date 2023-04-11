package m3ejercicio2extra;

import java.util.Scanner;

public class M3Ejercicio2Extra {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte number1;
		int varInt;
		
			
		System.out.println("Add an integer number");
		number1 = keyboard.nextByte();
			
		 int conditionalResult = (number1 < 10) ? (varInt = (int) number1) : (varInt = 1);
		 
		
		System.out.println("Print multiplication table of " + number1 + " :");
	}

}
