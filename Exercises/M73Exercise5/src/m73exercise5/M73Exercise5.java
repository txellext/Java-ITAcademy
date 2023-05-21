package m73exercise5;

import java.util.Scanner;

public class M73Exercise5 {

	public static void main(String[] args) {
		/*
		 * Comprovar si una frase introduïda per l’usuari/ària està formada només 
		 * per minúscules, només per majúscules o per minúscules i majúscules.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a sentence");
		String userString = keyboard.nextLine();
		
		upperLowerCaseString(userString);
		

	}
	
	public static void upperLowerCaseString (String userString) {
		
		boolean upperCase = false;
		boolean lowerCase = false;
		
		for (int i = 0; i < userString.length(); i++) {
			char letter = userString.charAt(i);
			if (Character.isUpperCase(letter)) {
				upperCase = true;
			} else if (Character.isLowerCase(letter)) {
				lowerCase = true;
			} 
		}
		
		if (upperCase && lowerCase) {
			System.out.println("Your sentece has uppercase and lowercase");
		} else if (upperCase) {
			System.out.println("Your sentece has only uppercases");
		} else if (lowerCase){
			System.out.println("Your sentence has only lowercases");
		} else {
			System.out.println("Your sentece does not has letters");
		}
	}

}
