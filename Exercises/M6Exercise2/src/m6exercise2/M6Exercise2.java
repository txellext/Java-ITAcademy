package m6exercise2;

import java.util.Scanner;

public class M6Exercise2 {

	public static void main(String[] args) {
		/*
		 * Aquest programa calcula l'edat mitjana d'un número de persones. 
		 * Aquest número s'haurà de preguntar a l'usuari/ària.

			S'ha de crear una funció que s'encarregui de demanar les edats a 
			l'usuari/ària i de calcular l'edat mitjana.

			La funció rebrà per paràmetre el núm. de persones a qui ha de demanar 
			l'edat.
			L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
			La mitjana de les edats introduïdes s'ha de retornar per la funció (return).
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tell me the number of people you want to calculate the years mean");
		int peopleNum = keyboard.nextInt();
		
		
		System.out.println("The years mean is: " + yearsmean(peopleNum));
		
	}
	
	public static float yearsmean(int peopleNum) {
		Scanner keyboard = new Scanner(System.in);
		float mean;
		int yearsContainer = 0, i = 0, years;
		
		while (i < peopleNum) {
			System.out.println("Tell me years person"+(i+1)+": ");
			years = keyboard.nextInt();
			
	
			if(years >= 0 && years <= 120) {
				yearsContainer += years;	
				i++;
			} else {
				System.out.println("The number is incorrect");
			}
		}
		mean = (float) (yearsContainer/peopleNum);
		
		return mean;
		
	}

}
