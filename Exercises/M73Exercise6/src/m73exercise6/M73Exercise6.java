package m73exercise6;

import java.util.ArrayList;


public class M73Exercise6 {

	public static void main(String[] args) {
		/*
		 * Donat un array de números, el programa ha 
		 * de mostrar la suma de tots els nombres parells
		 *  i la suma de tots els números imparells.
		 */
		
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		
		newArray.add(4);
		newArray.add(6);
		newArray.add(8);
		newArray.add(3);
		newArray.add(5);
		
		oddEvenNumbers(newArray);
		

	}
	
	public static void oddEvenNumbers(ArrayList<Integer> userArray) {
		float oddSum = 0;
		float evenSum = 0;
		
		
		for (int i = 0; i < userArray.size(); i++) {
			if(userArray.get(i) % 2 == 0) {
				evenSum += userArray.get(i);
				
			} else {
				oddSum += userArray.get(i);
			}
		}
		
		System.out.println("The sum of odd numbers is " + oddSum + " and the even numbers is: " + evenSum);
		
	}

}
