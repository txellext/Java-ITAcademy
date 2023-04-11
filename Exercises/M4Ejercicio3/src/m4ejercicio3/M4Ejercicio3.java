package m4ejercicio3;

import java.util.Scanner;

public class M4Ejercicio3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte years;
		String certificate;
		String unemployed;
		char charCertificate, charUnemployed;
		final char AFIRMATION = 'y';
		final byte OLDER = 18;
		
		
		System.out.println("How old are you?");
		years = keyboard.nextByte();
		keyboard.nextLine(); // Limpiar el buffer del teclado
		
		System.out.println("Do you own a university certification? yes or no");
		certificate = keyboard.nextLine();
		certificate = certificate.toLowerCase();
		charCertificate = certificate.charAt(0);
		
		System.out.println("Are you unemployed? yes or no");
		unemployed = keyboard.nextLine();
		unemployed = unemployed.toLowerCase();
		charUnemployed = unemployed.charAt(0);
		
		if ((years >= OLDER && charCertificate == AFIRMATION) || charUnemployed == AFIRMATION) {
			System.out.println("You will get a fellowship");
		} 
		else {
			System.out.println(" You will not get a fellowship");
		}
	}

}
