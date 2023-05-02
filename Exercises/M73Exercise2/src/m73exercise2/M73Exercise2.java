package m73exercise2;

import java.util.Scanner;

public class M73Exercise2 {

	public static void main(String[] args) {
		/*
		 * En aquest programa l’usuari/ària ha d’introduir un string i el 
		 * programa ha de mostrar l’string al revés.
		 * No usar funció reverse()
		 */

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a string");
		String userString = keyboard.nextLine();
		String reverseString = calculReverseString(userString);
		
		System.out.println("Your string reverse is: " + reverseString);
		
	}
	
	public static String calculReverseString(String userString) {
		String resultString = "";
		
		
		for (int i = 0; i < userString.length(); i++) {
			char character = userString.charAt(i);
			resultString = character + resultString;
		}
		
		
		
		return resultString;
	}

}
