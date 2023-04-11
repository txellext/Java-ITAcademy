package m4ejercicio6;

import java.util.Scanner;

public class M4Ejercicio6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		byte day;
		byte month;
		String zodiacSign = null;
		
		System.out.println("Day of birth");
		day = keyboard.nextByte();
		
		System.out.println("Number of Month of birth");
		month = keyboard.nextByte();
		
		switch(month) {
		case 1:
			if (day >= 1 && day <= 19) {
				zodiacSign = "Capricornio";
			} else if (day > 19 && day <= 31 ) {
				zodiacSign = "Acuario";
			} else zodiacSign = "The day is incorrect";
			break;
		case 2:
			if (day >= 1 && day <= 18) {
				zodiacSign = "Acuario";
			} else if (day > 18 && day <= 31 ) {
				zodiacSign = "Piscis";
			} else zodiacSign = "The day is incorrect";
			break;
		case 3:
			if (day >= 1 && day <= 20) {
				zodiacSign = "Piscis";
			} else if (day > 20 && day <= 31 ) {
				zodiacSign = "Aries";
			} else zodiacSign = "The day is incorrect";
			break;
		case 4:
			if (day >= 1 && day <= 19) {
				zodiacSign = "Aries";
			} else if (day > 19 && day <= 31 ) {
				zodiacSign = "Tauro";
			} else zodiacSign = "The day is incorrect";
			break;
		case 5:
			if (day >= 1 && day <= 20) {
				zodiacSign = "Tauro";
			} else if (day > 20 && day <= 31 ) {
				zodiacSign = "Géminis";
			} else zodiacSign = "The day is incorrect";
			break;
		case 6:
			if (day >= 1 && day <= 21) {
				zodiacSign = "Géminis";
			} else if (day > 21 && day <= 31 ) {
				zodiacSign = "Cáncer";
			} else zodiacSign = "The day is incorrect";
			break;
		case 7:
			if (day >= 1 && day <= 22) {
				zodiacSign = "Cáncer";
			} else if (day > 22 && day <= 31 ) {
				zodiacSign = "Leo";
			} else zodiacSign = "The day is incorrect";
			break;
		case 8:
			if (day >= 1 && day <= 22) {
				zodiacSign = "Leo";
			} else if (day > 22 && day <= 31 ) {
				zodiacSign = "Virgo";
			} else zodiacSign = "The day is incorrect";
			break;
		case 9:
			if (day >= 1 && day <= 22) {
				zodiacSign = "Virgo";
			} else if (day > 22 && day <= 31 ) {
				zodiacSign = "Libra";
			} else zodiacSign = "The day is incorrect";
			break;
		case 10:
			if (day >= 1 && day <= 22) {
				zodiacSign = "Libra";
			} else if (day > 22 && day <= 31 ) {
				zodiacSign = "Escorpión";
			} else zodiacSign = "The day is incorrect";
			break;
		case 11:
			if (day >= 1 && day <= 21) {
				zodiacSign = "Escorpión";
			} else if (day > 21 && day <= 31 ) {
				zodiacSign = "Sagitario";
			} else zodiacSign = "The day is incorrect";
			break;
		case 12:
			if (day >= 1 && day <= 21) {
				zodiacSign = "Sagitario";
			} else if (day > 21 && day <= 31 ) {
				zodiacSign = "Capricornio";
			} else zodiacSign = "The day is incorrect";
			break;
		}
	
		
		System.out.println("Your zodiac sign is: " + zodiacSign);

	}

}
