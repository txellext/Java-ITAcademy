package m3ejercicio3;

import java.util.Scanner;

public class M3Ejercicio3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte score1;
		byte score2;
		byte score3;
		final int SCORES = 3;
		
		
		System.out.println("Add a first score");
		score1 = keyboard.nextByte();
		
		System.out.println("Add a second score");
		score2 = keyboard.nextByte();
		
		System.out.println("Add a third score");
		score3 = keyboard.nextByte();
		
		float average = (float)(score1+score2+score3)/SCORES;
				
		System.out.println("This is the average of " + SCORES + ": " + average);
	}

}
