package m4ejercicio2;

import java.util.Scanner;

public class M4Ejercicio2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte years;
		
		System.out.println("How old are you?");
		years = keyboard.nextByte();
		
		if (years <= 5) {
			System.out.println("preescolar");
		} else if ((years >=6) && (years <=11)) {
			System.out.println("primària");
		} else if ((years >= 12) && (years <= 15)) {
			System.out.println("ESO");
		} else if ((years >= 16) && (years <=17)) {
			System.out.println("Batxillerat");
		} else {
			System.out.println("FP o Universitat");
		}

	}

}
