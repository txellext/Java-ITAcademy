package m5exerciseextraarray;

import java.util.ArrayList;
import java.util.Scanner;

public class M5ExerciseExtraArray {

	public static void main(String[] args) {
		// Recorrer array de personas para encontrar si la persona está en el array
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> peopleList = new ArrayList<String>();
		
		
		peopleList.add("Pepe");
		peopleList.add("Miguel");
		peopleList.add("María");
		peopleList.add("Sandra");
		
		System.out.println("Add person name to search");
		String name = sc.nextLine();
		String person = null;
		//int turns = 0;
		boolean found = false;
		
	
		int i = 0;
		
		while( i < peopleList.size() && !found) {
			if(peopleList.get(i).equals(name)) {
				found = true;
				//peopleList.remove(i); More efficient is out of the bucle
				i++;
			}
		}
		
		if(found) {
			System.out.println("This person is in the list!");
			peopleList.remove(i); // Here is the best way to remove items from an array, out of the bucle
			System.out.println(peopleList);
		} else {
			System.out.println("This person is out the list!");
		}
			
	}
		
		
		/*do {
			person = peopleList.get(turns);
			if (person.equals(name)) {
			 found = true;

			} else {
				turns ++;
			}
			
		} while(turns < peopleList.size() && found == false);
		if (name.equals(person)) {
			System.out.println("This person is in the list!");
		} else {
			System.out.println("This person is out the list!");
		}*/
		
		
		
		/*boolean getit = false;
		String person;
		
		
		for (int i=0; i < peopleList.size(); i++) {
			person = peopleList.get(i);
			if (name.equals(person)) {
				getit = true;
			}
		}
		
		if (getit) {
			System.out.println("This person is in the list!");
		} else {
			System.out.println("This person is out the list!");
		}*/
		
	}



