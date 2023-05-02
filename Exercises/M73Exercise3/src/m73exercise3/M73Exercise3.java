package m73exercise3;

import java.util.Scanner;

public class M73Exercise3 {

	public static void main(String[] args) {
		/*
		 * L’usuari/ària ha d’introduir una frase i el programa ha de 
		 * dir si la frase és un palíndrom.
		 */
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a string");
		String userString = keyboard.nextLine();
		
		Boolean palindromString = calculPalindrom(userString);
		
		if (palindromString) {
			System.out.println("Your string is a palindrom");
		} else {
		System.out.println("Your string is not a : ");
		
		}
	

	}
	
	public static boolean calculPalindrom (String userString) {
		boolean isPalindrom = false;
		String palindromString = userString;
		String reverseString = "";
		
		//Delete spaces
		for (int i = 0; i< userString.length(); i++) {
			char character = userString.charAt(i);
			
			if(character == ' ') {
				palindromString = userString.replace(" ", "");
			} 
			
		}
		
		for (int i = 0; i < palindromString.length(); i++) {
			
			char character = palindromString.charAt(i);
			reverseString = character + reverseString;
			
		}
		
		if (palindromString.equals(reverseString)) {
			isPalindrom = true;
		}
			
		
		
		return isPalindrom;
	}

	
	
}
