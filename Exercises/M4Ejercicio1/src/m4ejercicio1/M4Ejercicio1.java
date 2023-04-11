package m4ejercicio1;

import java.util.Scanner;

public class M4Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		String nombre;
		String apellido;
		byte edad;
		final int mayorEdad = 18;
			
			
		System.out.println("Introduzca su nombre");
		nombre = teclado.nextLine();
			
		System.out.println("Introduzca su apellido");
		apellido = teclado.nextLine();
			
		System.out.println("Introduzca su edad");
		edad = teclado.nextByte();
			
		// teclado.close();
			
		//System.out.println("Su nombre es: " + nombre + " su apellido es: " + apellido + ", y tiene " + edad);
		if (edad >= mayorEdad) {
			System.out.println(nombre +" " + apellido + ", ets MAJOR d'edat");
		} else {
			System.out.println(nombre + " " + apellido + ", ets MENOR d'edat");
		}
	}

}
