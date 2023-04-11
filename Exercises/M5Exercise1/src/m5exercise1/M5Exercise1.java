package m5exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class M5Exercise1 {

	public static void main(String[] args) {
		/*
		 El programa demana quantes paraules vol introduir 
		  l'usuari/ària. Aquest, introdueix el número i llavors 
		  apareix el següent missatge: "Introdueix la paraula".

			Aquest missatge es mostra tantes vegades com número 
			de paraules ha dit l'usuari/ària que volia introduir. 
			Les paraules es guarden en un arrayList i un cop han 
			sigut totes introduïdes, es mostren per pantalla.
		 */

		Scanner keyboard = new Scanner(System.in);
		
		int number;
		String word;
		
		ArrayList<String> words = new ArrayList<String>();
		
		
		System.out.println("Number of words");
		number = keyboard.nextInt();
		keyboard.nextLine(); // limpiar buffer
		
		for (int i = 1; i <= number; i++) {
			System.out.println("Give me the word " + i);
			word = keyboard.nextLine();
			words.add(word);
		}
		System.out.println("Print array");
		int size = words.size();
		for(int i=0; i < size; i++)
		System.out.println(words.get(i));
	}

}
