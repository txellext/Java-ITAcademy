package m3ejercicio3extra;

import java.util.Scanner;

public class M3Ejercicio3Extra {

	public static void main(String[] args) {
		// How many liters do I need to paint a wall?
		
		
		final int coberturaLitro = 12; // 1L paint 12m^2 with one hand
		
		Scanner keyboard = new Scanner(System.in);
		
		byte heightWall;
		byte widthWall;
		int area;
		byte handsNum;
		int liters;
		
		System.out.println("How many meters does the wall height has?");
		heightWall = keyboard.nextByte();
		
		System.out.println("How many meters does the wall width has?");
		widthWall = keyboard.nextByte();
		
		area = heightWall * widthWall;
		
		System.out.println("How many hands can we apply?");
		handsNum = keyboard.nextByte();
		
		//liters =
		
		// System.out.println("So, in total we need " + liters + "liters.");
		

	}

}
