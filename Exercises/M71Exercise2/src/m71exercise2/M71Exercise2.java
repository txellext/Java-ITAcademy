package m71exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class M71Exercise2 {

	public static void main(String[] args) {
		/*
		 * Un/a professor/a vol calcular les mitges de les notes de tota la 
		 * classe. Crea una aplicació on l'usuari/ària introduirà un número 
		 * per pantalla (el número correspon al nombre de notes que vol 
		 * introduir) i el programa li demanarà que introdueixi les notes 
		 * de tots els/les alumnes.

			Un cop les notes han sigut introduïdes, el programa retorna el 
			següent:

			Si la nota mitjana és menor que 5: "La nota mitjana de la classe 
			està suspesa. Els/les alumnes haurien de preguntar els seus dubtes 
			i treballar més".

			Si la nota és inferior a 7: "La nota mitjana de la classe és 
			bona, però els/les alumnes haurien de millorar el treball personal".

			Per la resta de casos, el missatge ha de ser: "Enhorabona! La 
			nota mitjana de la classe es correspon amb l'esforç realitzat".
			NOTA: Les notes han d'estar compreses entre 0 i 10.
		 */
		
		int marksNum = getmarksnum();
		
		ArrayList<Float> marksList = new ArrayList<Float>();
		marksList = getMarksList(marksNum);
		
		float marksMean = getMarksMean(marksNum, marksList);
		
		System.out.println("The mean marks is: " + (getMarksMensage(marksMean)));
		System.out.println(" and the maximum mark is: "+maxMark(marksList)+" and the minimum mark is: "
		+ minMark(marksList));
		 
				
		

	}
	
	public static int getmarksnum() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me the number of total marks");
		int marksNum = keyboard.nextInt();
		return marksNum;
	}

	public static ArrayList<Float> getMarksList(int marksNum) {
		Scanner keyboard = new Scanner(System.in);
		int i = 1;
		float mark, sumMarks=0;
		ArrayList<Float> array = new ArrayList<Float>();
		
		while(i <= marksNum) {
		
		System.out.println("Give me the "+(i)+" mark:");
		mark = keyboard.nextFloat();
			
			if(mark >=0 && mark <=10) {
				array.add(mark);
			} else {
				System.out.println("Incorrect mark");
			}
			i++;
		}
		return array;
	}

	public static float getMarksMean(int marksNum, ArrayList<Float> marksArray) {
		float mean;
		float sumMarks = 0;
		
		for(int i=0; i < marksArray.size(); i++) {
			sumMarks += i;
		}
		
		mean = sumMarks/marksArray.size();
		
		return mean;
		
	}
	
	public static void getMarksMensage(float marksMean) {
				
		if(marksMean < 5) {
			System.out.println("La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més");
		} else if (marksMean >= 5 && marksMean<7) {
			System.out.println("La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal");
		} else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
		}
		
	}
	
	public static float maxMark(ArrayList<Float> marksArray ) {
		float max = marksArray.get(0);
		for (int i = 1; i < marksArray.size(); i++) {
			max = Math.max(max, marksArray.get(i));
		}
		return max;
	}
	
	public static float minMark(ArrayList<Float> marksArray ) {
		
		float min = marksArray.get(0);
		for (int i = 1; i < marksArray.size(); i++) {
			min = Math.min(min, marksArray.get(i));
		}
		return min;
	}
		
}
