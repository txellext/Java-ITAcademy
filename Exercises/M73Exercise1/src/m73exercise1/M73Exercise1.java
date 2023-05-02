package m73exercise1;

import java.util.Scanner;

public class M73Exercise1 {

	public static void main(String[] args) {
		/*
		 * Realitzar un programa que tingui un menú on se li mostraran 4 opcions a 
		 * l’usuari/ària per pantalla:

			1.- Quadrat

			2.- Triangle

			3.- Rectangle

			4.- Cercle

			0.- Sortir del programa

			Segons l’opció escollida haurà d’introduir unes dades o altres perquè el 
			programa mostri per pantalla l’àrea (el valor) del polígon escollit.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		boolean noOption = false;
		
		do {
		System.out.println("1.- Square" + "\n" + "2.- Triangle" + "\n" + "3.- Rectangle" + "\n" + "4.- Circle" + "\n" + "0.- Exit program");
		
		String option = keyboard.nextLine();
		String square = "Square";
		String triangle = "triangle";
		String rectangle = "rectangle";
		String circle = "circle";
		String exit = "exit program";
		
		if(option.equals(square)) {
			System.out.println("The area is : " + squareCalcul()); 
		} else if(option.equals(triangle)) {
			System.out.println("The area is : " + triangleCalcul());
		} else if(option.equals(rectangle)) {
			System.out.println("The area is : " + squareCalcul());
		} else if (option.equals(circle)) {
			System.out.println("The area is : " + circleCalcul());
		} else if (option.equals(exit)) {
			System.out.println("Good bye");
		} else {
			noOption = true;
		}
		
		} while (noOption);
	}
	
	public static float squareCalcul() {
		Scanner keyboard = new Scanner(System.in);
		float result;
		
		System.out.println("Give me the width");
		int width = keyboard.nextInt();
		
		System.out.println("Give me the height");
		int height = keyboard.nextInt();
		
		result = (float)width * height;
			
		return result;
	}
		
		
	public static float triangleCalcul() {
		Scanner keyboard = new Scanner(System.in);
		float result;
		
		System.out.println("Give me the width");
		int width = keyboard.nextInt();
			
		System.out.println("Give me the height");
		int height = keyboard.nextInt();
			
		result = (float)(width * height)/2;
		
		return result;
	}
		
	public static float circleCalcul() {
		Scanner keyboard = new Scanner(System.in);
		float result;
		final double PI = Math.PI;
		
		System.out.println("Give me the radius");
		float radius = keyboard.nextFloat();
			
		
			
		result = (float)(PI * radius*radius);
		
		return result;
	}
	
}
	
		

