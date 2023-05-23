package m71exercise5;

import java.util.Scanner;

public class M71Exercise5 {

	public static void main(String[] args) {
		// Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en ordre descendent.
		
		Scanner keyboard= new Scanner(System.in);
		 int i;
		 
		 for(i=100; i>=0; i--) {
			 if(i % 2 == 0) {
				 System.out.println(i);
			 }
		 }
		 
		 
	}

}
