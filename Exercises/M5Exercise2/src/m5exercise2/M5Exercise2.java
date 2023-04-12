package m5exercise2;

import java.util.Scanner;

public class M5Exercise2 {

	public static void main(String[] args) {
		/*
		 * El programa demana dos números enters i llavors calcula la suma dels valors 
		 * compresos entre els dos números, inclosos. 

			Exemple: 4 i 10  --> resultat = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
		*/
		Scanner keyboard = new Scanner(System.in);
		 
		byte number1;
		byte number2;
		int sum = 0;
		
		
		System.out.println("Give me one integer number");
		number1 = keyboard.nextByte();
		
		System.out.println("Give me a second integer number");
		number2 = keyboard.nextByte();
		
		//If number 1 > number 2, change them
		if(number1>number2) {
			byte auxiliar = number1;
			number1 = number2;
			number2 = auxiliar;
		}
		
		for (int i = number1; i <= number2; i++) {
			sum += i;
		}
		
		System.out.println("The sum is : " + sum);
		
		
	}

}
