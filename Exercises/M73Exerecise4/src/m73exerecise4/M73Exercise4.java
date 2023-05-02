package m73exerecise4;

import java.util.Scanner;

public class M73Exercise4 {

	public static void main(String[] args) {
		/*
		 * L’usuari/ària ha d’introduir un DNI i el programa ha de dir 
		 * si la lletra és correcte o no amb el nombre de DNI. Si la lletra no
		 *  és correcta, ha de dir quina lletra és la correcta.

			Per calcular la lletra DNI has de prendre el número de DNI a verificar i 
			dividir-lo entre 23. El residu es reemplaça per una lletra que ja està assignada 
			a aquest nombre mitjançant la taula adjunta: 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		
		System.out.println("Give me your ID with your letter");
		String id = keyboard.nextLine();
		
		
		if((id.length() != 9 ) || (Character.isLetter(id.charAt(8)) == false)) {
			System.out.println("ID added is not valid");
		} else {
			
			int numid = Integer.parseInt(id.substring(0,8));
			
			String idLetter = id.substring(8);
			idLetter = idLetter.toUpperCase();
			char charLetterId = idLetter.charAt(0);
			
			int number = numid%23;
			char calculatedLetter = letters.charAt(number);
			
			if(calculatedLetter != charLetterId) {
				System.out.println("The letter or number ID are not correct");
				System.out.println("The corrtect letter for your ID is: "+ calculatedLetter);
			} else {
				System.out.println("The ID number and letter are corect");
			}
			
		}
		
		
	}	

}
