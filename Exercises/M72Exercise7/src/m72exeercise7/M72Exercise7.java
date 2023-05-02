package m72exeercise7;

import java.util.Scanner;

public class M72Exercise7 {

	public static void main(String[] args) {
		/*
		 * L’usuari/ària introdueix un any a per teclat
			i el programa crida a un mètode que indiqui si l’any 
			és de traspàs o no.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Give me an year");
		int year = keyboard.nextInt();
		
		
		if (leapYear(year)) {
			System.out.println("The year" + year + "is leap year");
		} else {
			System.out.println("The year is not a leap year");
		}
	}
	
	public static boolean leapYear(int year) {
		boolean leap = true;
		
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			leap = true; 
		} else {
			leap = false;
		}
		return  leap;
	}

}
