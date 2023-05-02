package extrafibonacci;

import java.util.Scanner;

public class ExtraFibonacci {

	public static void main(String[] args) {
		/*
		 * Demana un número a l'usuari i digali si pertany dins de la sucessió de Fibonacci
		 */
		
		Scanner keyboard = new Scanner(System.in);
		boolean isFibonacci = false;
		
		do {
		System.out.println("Give me a number");
		int num = keyboard.nextInt();
		
		
		if(fiboCalcul(int num)) {
			isFibonacci = true;
		} 
		
		} while (!isFibonacci);
		
		System.out.println("Congrats!" + num + "It is a fibonacci number!"); 
	}
	
	public static boolean fiboCalcul(int num) {
		ListArray<Floats> fiboArray = new ListArray<Floats>();
		boolean isFibo = false;
		
		/*Más facil!!! ir construyendo el array y comparar valor última posicion
		 * con fiboArray.size() -1  con el número, si es menor el número, seguir construyendo
		 * el fiboArray, hasta que se pase por ser igual o por no serlo... y fin!
		 */
		
		fiboArray = ;
		
		for(int i = 0; i < fiboArray.size(); i++) {
			if (num == fiboArray(i)) {
				isFibo = true;
			}
		}
		
		
		return isFibo;
	}
		
		
	
		
	
	
}
	
		

