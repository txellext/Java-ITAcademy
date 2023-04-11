package m3ejercicio1extra;

import java.util.Scanner;

public class M3Ejercicio1Extra {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte number1;
		byte doble1;
		byte triple1;
		
		System.out.println("Add a first number");
		number1 = keyboard.nextByte();
		
		doble1 = (byte) (number1 * 2);
		triple1 = (byte) (number1 * 3);
		
		System.out.println("The doble of this number is: "+doble1+" and the triple is: "+triple1);
	}

}
