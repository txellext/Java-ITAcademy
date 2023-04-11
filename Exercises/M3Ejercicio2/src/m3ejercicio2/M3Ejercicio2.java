package m3ejercicio2;

import java.util.Scanner;

public class M3Ejercicio2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		byte number1;
		byte number2;
		int sum;
		int subtract;
		int multiply;
		float division;
		
		System.out.println("Give me a first integer input");
		number1 = keyboard.nextByte();
		
		System.out.println("Give me a second integer input");
		number2 = keyboard.nextByte();
		
		sum = number1 + number2;
		subtract = number1 - number2;
		multiply = number1 * number2;
		division = (float)number1 / number2;
		
		System.out.println("Sum result is: " + sum );
		System.out.println("Remainder result is: " + subtract);
		System.out.println("Multiplication result is: " + multiply);
		System.out.println("Division result is: " + division);
	}

}
