package m71exercise1;

import java.util.Scanner;

public class M71Exercise1 {

	public static void main(String[] args) {
		/* Crea un programa on l’usuari/ària introdueix tres notes i el 
		 * programa calcula la mitja. Si la mitja és inferior a 5 ha de mostrar 
		 * el següent missatge per pantalla: “No has superat el curs. 
		 * Has de recuperar”. Si la mitja està entre 5 i 7 ha de mostrar: 
		 * “Enhorabona! Has aprovat, però hauries de continuar practicant”.
		 * Si la mitja és superior a 7 ha de mostrar: "Enhorabona! Has superat el curs! Passa ja al següent nivell!"
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		
		System.out.println("Give me the first mark");
		int mark1 = keyboard.nextInt();
		
		System.out.println("Give me the second mark");
		int mark2 = keyboard.nextInt();
		
		System.out.println("Give me the third mark");
		int mark3 = keyboard.nextInt();
		
		markmean(mark1, mark2, mark3);
	}
	
	public static void markmean(int mark1, int mark2, int mark3) {
		
				
		float mean;
		
		mean = (mark1+mark2+mark3)/3;
			
		
		if(mean < 5) {
			System.out.println("No has superat el curs. Has de recuperar");
		} else if (mean >= 5 && mean<=7) {
			System.out.println("Enhorabona! Has aprovat, pero hauries de continuar practicant");
		} else {
			System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
		}
		
	}

}
