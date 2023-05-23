package m72exercise3;

import java.util.Scanner;

public class M72Exercise3 {

	public static void main(String[] args) {
		/*
		 * Fes un programa que mostri el següent per pantalla:

*

* *

* * *

* * * *

* * * * *

* * * * * *

* * * * *

* * * *

* * *

* *

*

La línia amb més “*” vindrà donada per un número que l’usuari/ària introduirà per consola.
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
		
		
		for(int i = 1; i<number; i++) {
			for(int j=i; j<number; j++) {
				text += "*";
			}
			text += "\n";
		}
		
		
		System.out.println(text);

	}

}
