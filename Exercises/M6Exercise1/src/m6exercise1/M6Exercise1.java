package m6exercise1;

import java.util.Scanner;

public class M6Exercise1 {

	public static void main(String[] args) {
		/*
		 * Modificar la calculadora arcaica (M4 Exercici 5). 
		 * El programa demana a l’usuari/ària que introdueixi dos números 
		 * i l’operació que desitja realitzar. 

			Cada operació (suma, resta, multiplicació, divisió i mòdul) 
			estarà programada en un mètode diferent.
		 */
		

		Scanner keyboard = new Scanner(System.in);
		
		int result = 0;
		
		System.out.println("Give me the first number");
		int number1 = keyboard.nextInt();
		
		
		System.out.println("Give me the second number");
		int number2 = keyboard.nextInt();
		keyboard.nextLine();  // clean scanner
		
		System.out.println("Give me an operator (+,-,*,/, %)");
		String operator = keyboard.nextLine();
		char charOperator = operator.charAt(0);
		
				
		
		switch (charOperator) {
		case '+':
			result = sum(number1, number2);
			break;
		case '-':
			result = substract(number1, number2);
			break;
		case '*':
			result = multiply(number1, number2);
			break;
		case '/':
			division(number1,number2);
			break;
		case '%':
			result = module(number1,number2);
			break;
		default:
			System.out.println("Error: operation not available ");
		}
		System.out.println("The operation result is " + result);
	}
		
	
	
	public static int sum(int number1, int number2) {
		int result;
		
		result = number1 + number2;
		
		return result;
		
	}
	
	public static int substract(int number1, int number2) {
		int result;
		
		result = number1 - number2;
		
		return result;
		
	}
	
	public static int multiply(int number1, int number2) {
		int result;
		
		result = number1 * number2;
		
		return result;
		
	}
	
	public static void division(int number1, int number2) {
		float result;
		
		if(number2 == 0) {
			System.out.println("It cannot be divided by 0");
		} else {
			
		}
		result = number1 / number2;
		
		System.out.println("The division result is" + result);
	}
	
	public static int module(int number1, int number2) {
		int result;
		
		result = number1 % number2;
		
		return result;
		
	}
	

}
