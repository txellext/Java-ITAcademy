package m8exercise4;

import java.util.ArrayList;
import java.util.Scanner;

import inheritance.BcnBuilding;
import inheritance.Cinema;
import inheritance.Hospital;
import inheritance.Hotel;

public class M8Exercise4 {
	
	/*
	 * La ciutat de Barcelona, com qualsevol ciutat, està formada per un nombre molt gran d’edificis. Hi ha moltes classes d’edificis: 
	 * edificis d’habitatges, hospitals, escoles, blocs d’apartaments, blocs d’oficines, hotels, cinemes, etc.

	L’exercici proposat consistirà a crear una aplicació que contindrà una classe Edifici i diverses classes derivades. 
	No s’instanciarà cap objecte de la classe Edifici, sinó que s’instanciaran objectes de les classes derivades d’aquesta.  
	Les classes derivades són: Hotel, Hospital i Cinema.

	Tots els edificis tindran certes dades comunes (nom, nombre de plantes, superficie (m²)) que es donaran en crear l’edifici i 
	no es modificaran, però sí que s’haurà de poder accedir a elles per llegir-les.

	Es crearà un mètode netejar() en la classe adient, la qual mostrarà per pantalla el temps que s’ha trigat a netejar l’edifici, 
	tenint en compte que es tarda a netejar un minut per cada 5 m². A més, si un edifici té més d’una planta, es tarda a pujar mig 
	minut d’una planta a una altra. Per tant, afegirem mig minut per cada planta addicional. Per cada minut de feina es pagarà un 
	euro diari. A més, com que es neteja cada dia, per obtenir el cost mensual, haurem de multiplicar per 30 (aquest cost mensual 
	també es mostrarà per pantalla) 

	A més, s’implementarà un mètode anomenat calcularCostVigilancia() que mostrarà el que costa al mes contractar vigilants a cada 
	edifici. Es considera que cada vigilant d’hotel o hospital pot vigilar 1000 m². Per tant, si un edifici té una superfície de 5500 m², 
	necessitarem 6 vigilants. En canvi, els vigilants dels cinemes poden vigilar 3000 m². Contractar cada vigilant costa als propietaris 
	de l’edifici 1.300 euros mensuals, però els vigilants d’hotels cobren un plus de perillositat de 500 euros mensuals. 

	A l’hospital es reparteix dinar pels malalts tres vegades al dia. Hi haurà un mètode repartirDinar() en el lloc adient que mostrarà, 
	quan sigui cridat, el missatge “S’estan repartint xxx racions”. Per aconseguir el nombre de racions, s'ha de multiplicar el nombre de 
	malalts/es per 3. El nombre de malalts/es ingressats/des a l'hospital pot variar al llarg del temps, per tant, s’haurà de permetre 
	accedir a l’atribut corresponent, tant per llegir-lo com per modificar-lo, encara que no es faci directament. 

	Al cinema es crearà la funció projectarSessio(), que mostrarà el missatge “S’han recaptat xxx euros”, tenint en compte que, per 
	calcular la recaptació, s’ha de multiplicar el preu d’una entrada pel nombre d’assistents a la sessió, que no podrà superar l’aforament 
	màxim. Per tant, la funció projectarSessió() haurà de rebre com a paràmetres el nombre d’assistents i el preu de l’entrada per aquella 
	sessió. El nombre d’assistents a la sessió no pot ser més gran que l’aforament total de la sala. 

	En els hotels cada dia passa el servei d’habitacions. Es calcula que cada membre del servei pot atendre 20 habitacions. Es crearà un 
	mètode que calculi, i mostri per pantalla: a) Quantes persones són necessàries per atendre el servei d’habitacions l’hotel. b) Quin és
	 el total necessari per als sous d’aquestes persones, tenint en compte que cada persona cobra 1.000 euros al mes.
	 
	 L'aplicació ha de ser capaç de donar d'alta, mostrar i eliminar edificis. En cridar el mètode mostrar, cridarem a tots els mètodes de 
	 l'edifici en qüestió per veure totes les seves dades per pantalla.
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<BcnBuilding> buildings = new ArrayList<BcnBuilding>();
		
		Hotel hotel1 = new Hotel("Hilton", 10, 120, 50);
		Hotel hotel2 = new Hotel("Palace", 15, 100, 20);
		Cinema cinema1 = new Cinema("Pompeu", 2, 100, 95);
		Hospital hospital1 = new Hospital("Tecla", 7, 80, 420);
		
		buildings.add(hotel1);
		buildings.add(hotel2);
		buildings.add(cinema1);
		buildings.add(hospital1);
		
		
		int option = -1;
		
		do {
			option = menu();
			
			switch(option) {
			case 0: System.out.println("Bye bye!");
					break;
			case 1: createNewBuilding(buildings);
					break;
			case 2: showBuilding(buildings);
					break;
			case 3: removeBuilding(buildings);
					break;
			}
			
		} while(option !=-1);	

	}
	
	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		System.out.println("0 - Bye!");
		System.out.println("1 - Create building");
		System.out.println("2 - Show building");
		System.out.println("3 - Eliminate building");

		
		option = keyboard.nextInt();
		return option;
	}
	
	public static void createNewBuilding(ArrayList<BcnBuilding> buildings) {
		Scanner keyboard = new Scanner(System.in);

		ArrayList<Integer> buildingData = new ArrayList<Integer>();
		
		System.out.println("Building name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Building type: \n1. Hotel, 2. Hospital, 3.Cinema\n");
		int type = keyboard.nextInt();
		
		buildingData = getDataBuilding();
		
		switch(type) {
		case 1:
			Hotel objectHotel = searchHotel(buildings, name);
			
			if(objectHotel == null) {				
				Hotel hotel = new Hotel(name, buildingData.get(0), buildingData.get(2), buildingData.get(1));
				buildings.add(hotel);

			} else {
				System.out.println("We cannot create a Hotel " + name + " because is already in our app.");
			}
			break;
			
		case 2: 
			Hospital objectHospital = searchHospital(buildings, name);
			
			if(objectHospital == null) {
				System.out.println("Set number of pacients");
				int pacientNumber = keyboard.nextInt();
				
				Hospital hospital = new Hospital(name, buildingData.get(0), buildingData.get(2), pacientNumber);
				buildings.add(hospital);
			} else {
				System.out.println("We cannot create a Hospital " + name + " because is already in our app.");
			}
			break;
			
		case 3:
			Cinema objectCinema = searchCinema(buildings, name);
			
			if(objectCinema == null) {		
				System.out.println("Set maximum capacity");
				int maximumCapacity = keyboard.nextInt();
				
				Cinema cinema = new Cinema(name, buildingData.get(0),buildingData.get(2), maximumCapacity);				
				buildings.add(cinema);
			} else {
				System.out.println("We cannot create a Cinema " + name + " because is already in our app.");
			}
			break;
			
		default:
			System.out.println("Incorrect option");	
		}
	}
	
	public static ArrayList<Integer> getDataBuilding() {
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Integer> buildingData = new ArrayList<Integer>();
		
		System.out.println("Set number of floors");
		int floorsNum = keyboard.nextInt();
		System.out.println("Set number of rooms");
		int roomNum = keyboard.nextInt();
		System.out.println("Set surface(m2)");
		int surface = keyboard.nextInt();
		
		buildingData.add(floorsNum);
		buildingData.add(roomNum);
		buildingData.add(surface);
		
		return buildingData;
	}
	
	public static Hotel searchHotel(ArrayList<BcnBuilding> buildings, String name) {
		Hotel hotel = null;
		int i=0;
		
		while(hotel == null && i<buildings.size()) {
			if(buildings.get(i) instanceof Hotel && buildings.get(i).getName().equalsIgnoreCase(name)) {
				hotel = (Hotel)buildings.get(i);	
			}
			i++;
		}
		return hotel;
	}
	
	
	public static Hospital searchHospital(ArrayList<BcnBuilding> buildings, String name) {
		Hospital hospital = null;
		int i=0;
		
		while(hospital == null && i<buildings.size()) {
			if(buildings.get(i) instanceof Hospital && buildings.get(i).getName().equalsIgnoreCase(name)) {
				hospital = (Hospital)buildings.get(i);
				
			}
			i++;
		}
		return hospital;
	}
	
	public static Cinema searchCinema(ArrayList<BcnBuilding> buildings, String name) {
		Cinema cinema = null;
		int i=0;
		
		while(cinema == null && i<buildings.size()) {
			if(buildings.get(i) instanceof Cinema && buildings.get(i).getName().equalsIgnoreCase(name)) {
				cinema = (Cinema)buildings.get(i);
				
			}
			i++;
		}
		return cinema;
	}
	
	public static void showBuilding(ArrayList<BcnBuilding> buildings) {
		Scanner keyboard = new Scanner(System.in);
		boolean isCreated = false;
		ArrayList<Integer> data;
		
		
		System.out.println("Building name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Building type: \n1. Hotel, 2. Hospital, 3.Cinema\n");
		int type = keyboard.nextInt();
		
		switch(type) {
		case 1:
			Hotel hotel = searchHotel(buildings, name);
			if(hotel != null){
				System.out.println("Hotel: " + hotel.toString() + "\n");
				hotel.calculateRoomServiceWorkers();
				hotel.vigilanceCost();
				hotel.cleanBuilding();
			} else {
				System.out.println("Hotel " + name + " is not in our app.");
			}
			break;
		case 2:
			Hospital hospital = searchHospital(buildings, name);
			
			if(hospital != null){
				System.out.println("Hospital: " + hospital.toString());
				hospital.foodDelivery();
				hospital.vigilanceCost();
				hospital.cleanBuilding();
			} else {
				System.out.println("Hospital" + name + " is not in our app.");
			}
			break;
			
		case 3:
			Cinema cinema = searchCinema(buildings, name);
			
			System.out.println("Give me number of assistance");
			int assistanceNumber = keyboard.nextInt();
			
			System.out.println("Give me number the ticket price");
			int ticketPrice = keyboard.nextInt();
			
			
			if(cinema != null){
				System.out.println("Cinema: " + cinema.toString());
				cinema.projectSession(ticketPrice, assistanceNumber);
				cinema.vigilanceCost();
				cinema.cleanBuilding();
			} else {
				System.out.println("Cinema" + name + " is not in our app.");
			}
			break;
		}	
	}
	
	public static void removeBuilding(ArrayList<BcnBuilding> buildings) {
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Building name: ");
		String name = keyboard.nextLine();
		
		System.out.println("Building type: \n1. Hotel, 2. Hospital, 3.Cinema\n");
		int type = keyboard.nextInt();
		
		switch(type) {
		case 1:
			Hotel hotel = searchHotel(buildings, name);
			if(hotel != null){
				buildings.remove(hotel);
				System.out.println("The Hotel " + name + " has been removed from our app");
			} else {
				System.out.println("Hotel " + name + " is not in our app.");
			}
			break;
		case 2:
			Hospital hospital = searchHospital(buildings, name);
			
			if(hospital != null){
				buildings.remove(hospital);
				System.out.println("The hospital " + name + " has been removed from our app");
			} else {
				System.out.println("Hospital " + name + " is not in our app.");
			}
			break;
			
		case 3:
			Cinema cinema = searchCinema(buildings, name);			
			
			if(cinema != null){
				buildings.remove(cinema);
				System.out.println("The cinema " + name + " has been removed from our app");
			} else {
				System.out.println("Cinema " + name + " is not in our app.");
			}
			break;
		}
	}

}
