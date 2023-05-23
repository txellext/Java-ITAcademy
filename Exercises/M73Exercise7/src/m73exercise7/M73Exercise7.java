package m73exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class M73Exercise7 {

	public static void main(String[] args) {
		/*
		 * Un grup d’amics ha quedat per fer una fideuà.

		Els ingredients principals seran: fideus, gambes, i calamars.

		Saben que per cada quatre persones han d’utilitzar mig quilo de fideus, 
		400 grams de calamars i 200 grams de gambes.

		S’ha de fer un programa que demani per pantalla el preu per quilo de cada ingredient 
		i el nombre d’amics que seran per dinar. El programa ha de calcular les quantitats 
		necessàries de cada ingredient, el preu per persona i el preu final de la fideuà.
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me euros/kg of 'fideus'");
		float fideusPrice = keyboard.nextFloat();
		
		System.out.println("Give me euros/kg of 'gambes'");
		float gambesPrice = keyboard.nextFloat();

		System.out.println("Give me euros/kg of 'calamars'");
		float calamarsPrice = keyboard.nextFloat();
		
		System.out.println("How many friends are going to come to get lunch?");
		int friendsNum = keyboard.nextInt();

		
		ArrayList<Float> kgPerIngredients = new ArrayList<Float>();
		
		kgPerIngredients = kgPerIngredient(friendsNum);
		
		float personPrice =  pricePerFriend(kgPerIngredients, friendsNum, fideusPrice, gambesPrice, calamarsPrice);
		float finalPrice = personPrice * friendsNum;
		
		System.out.println("We will need " + kgPerIngredients.get(0) + "of fideus, " + kgPerIngredients.get(1) + " of gambes and " + kgPerIngredients.get(0) + " of calamrs ");
		System.out.println("Person price is " + personPrice + " and total price is " + finalPrice  );

	}
	
	public static ArrayList kgPerIngredient(int friendsNum) {
		ArrayList<Float> arrayKg = new ArrayList<Float>();
		float fideusPer4 = 0.5f;
		float calamarsPer4 = 0.4f;
		float gambesPer4 = 0.2f;
		
		arrayKg.add((fideusPer4/4)*friendsNum);
		arrayKg.add((gambesPer4/4)*friendsNum);
		arrayKg.add((calamarsPer4/4)*friendsNum);
		
		
		return arrayKg;
	}
	
	public static float pricePerFriend(ArrayList<Float>kgPerIngredients, int friendsNum, float fideusPrice, float gambesPrice, float calamarsPrice) {
		float priceFriend;
		float fideusPricePerson = 0;
		float gambesPricePerson = 0;
		float calamarsPricePerson = 0;
		
		
		for (int i = 0; i < kgPerIngredients.size(); i++) {
			if (i == 0) {
				fideusPricePerson = (kgPerIngredients.get(i) / friendsNum) * fideusPrice;
			} else if (i == 1) {
				gambesPricePerson = (kgPerIngredients.get(i) / friendsNum) * gambesPrice;
			} else if (i == 2) {
				calamarsPricePerson = (kgPerIngredients.get(i) / friendsNum) * calamarsPrice;
			}
		}
		priceFriend = fideusPricePerson + gambesPricePerson + calamarsPricePerson;
		return priceFriend;
	}
	

}
