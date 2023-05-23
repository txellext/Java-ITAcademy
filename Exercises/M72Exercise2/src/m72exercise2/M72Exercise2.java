package m72exercise2;

import java.util.Scanner;

public class M72Exercise2 {

	public static void main(String[] args) {
		/*
		 * Fes un programa que mostri el següent per pantalla:

* * * * * *

* * * * *

* * * *

* * *

* *

*

			El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		String text = "";
		
		System.out.println("Give me a number");
		int number = keyboard.nextInt();
		
		
		for (int i = 0; i<number; i++) {
			for(int j=i; j<number; j++) {
				text += "*";
			}
			text += "\n";
		}
		System.out.println(text);

	}

}
