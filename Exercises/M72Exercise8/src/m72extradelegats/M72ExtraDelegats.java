package m72extradelegats;

import java.util.ArrayList;
import java.util.Scanner;

public class M72ExtraDelegats {

	public static void main(String[] args) {
		/*
		 *  L’usuari/ària introdueix un nombre per teclat i el 
		 *  programa crida a un mètode que ha de mostrar la successió de Fibonacci.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a number of Mates");
		int numMates = keyboard.nextInt();
		keyboard.nextLine(); // clearing buffer
		
		System.out.println("Give me the first candidate name");
		String name1 = keyboard.nextLine();
		
		System.out.println("Give me the second candidate name");
		String name2 = keyboard.nextLine();
		
		ArrayList<String> candidateName = new ArrayList<String>(candidateName(name1, name2, numMates));
		
		System.out.println("The candidate is : " + candidateName.get(0) + " with a " + candidateName.get(1) + " of vote");
	}

	
	public static ArrayList candidateName(String name1, String name2, int numMates) {
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList <String> votesList = new ArrayList<String>();
		ArrayList <String> candidateName = new ArrayList<String>();
		String name;
		String finalCandidate;
		int votesName1 = 0;
		int votesName2 = 0;
		
		for (int i = 0; i < numMates; i++) {
			System.out.println("Give me your vote Mate number " + (i+1));
			name = keyboard.nextLine();
			votesList.add(name);
		}
		for (int i = 0; i < votesList.size(); i++) {
			//String position1 = votesList.get(i)
			if (name1.equals(votesList.get(i))) {
				votesName1 ++;
			} else if (name2.equals(votesList.get(i))) {
				votesName2 ++;
			}
		}
		
		if (votesName1 > votesName2) {
			finalCandidate = name1;
			candidateName.add(finalCandidate);
			candidateName.add(Integer.toString(votesName2));
		} else {
			finalCandidate = name2;
			candidateName.add(finalCandidate);
			candidateName.add(Integer.toString(votesName2));
		}
		
				
		return candidateName;
	}
}
