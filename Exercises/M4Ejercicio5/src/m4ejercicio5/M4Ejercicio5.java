package m4ejercicio5;

import java.util.Scanner;

public class M4Ejercicio5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		float number1, number2;
		String operator;
		float result = 0;
		char charOperator;
		
		System.out.println("Give me the first number");
		number1 = keyboard.nextFloat();
		
		System.out.println("Give me the second number");
		number2 = keyboard.nextFloat();
		keyboard.nextLine();  // clean scanner
		
		System.out.println("Give me an operator (+,-,*,/");
		operator = keyboard.nextLine();
		charOperator = operator.charAt(0);
		
		
		switch (charOperator) {
		case '+':
			result = number1 + number2;
			break;
		case '-':
			result = number1 - number2;
			break;
		case '*':
			result = number1 * number2;
			break;
		case '/':
			if(number2 != 0) {
				result = number1 / number2;
			} else {
				System.out.println("The divisor cannot be 0");
			}
			break;
		default:
			System.out.println("Error: operation not available ");
		}
		
		System.out.println("This is the result of this operation: " + result);
	}

}
