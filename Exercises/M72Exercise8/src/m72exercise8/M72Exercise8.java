package m72exercise8;

import java.util.ArrayList;
import java.util.Scanner;

public class M72Exercise8 {

	public static void main(String[] args) {
		/*
		 *  L’usuari/ària introdueix un nombre per teclat i el 
		 *  programa crida a un mètode que ha de mostrar la successió de Fibonacci.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a number");
		int num = keyboard.nextInt();
		
		System.out.println("The Fibonacci is: " + doFibonacci(num));
	}

	public static ArrayList doFibonacci(int num) {
		ArrayList <Integer> fiboArray = new ArrayList<Integer>();
		
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				fiboArray.add(i);
			} else if (i == 1){
				fiboArray.add(i);
			} else {
			
			fiboArray.add(fiboArray.get(i-1) + fiboArray.get(i-2) );
			}
				
		}
		return fiboArray;
	}
}
