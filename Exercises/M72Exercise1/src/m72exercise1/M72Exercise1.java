package m72exercise1;

import java.util.Scanner;

public class M72Exercise1 {

	public static void main(String[] args) {
		/*
		 *  Fes un programa que mostri el següent per pantalla:

*

* *

* * *

* * * *

* * * * *

* * * * * *

El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola.

Condició: En tot el codi del programa només hi pot haver un *


També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String.
		 */

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a number");
		int number = keyboard.nextInt();
		String text = "";
		
		for(int i = 1; i <=number; i++) {
			for(int j=1; j<=i; j++) {
				text += "*";
			}
			text += "\n";
		}
		System.out.println(text);
	}

}
