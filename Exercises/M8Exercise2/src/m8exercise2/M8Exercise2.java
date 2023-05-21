package m8exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class M8Exercise2 {

	public static void main(String[] args) {
		/*
		 * Ens demanen crear una aplicació per donar d’alta, modificar, veure i eliminar hotels.

		La classe hotel haurà de tenir els següents atributs: nom, nombre d’habitacions, 
		nombre de plantes i superfície total de l’hotel. Com a mètodes només haurà de tenir els 
		getters i setters propis de la classe i un mètode anomenat calcularManteniment(). 
		Aquest mètode ha de tenir en compte que cada persona del servei pot atendre 20 
		habitacions i haurà de mostrar quantes persones són necessàries per atendre el 
		servei d’habitacions de l’hotel i quin és el cost total destinat al servei sabent 
		que aquestes persones cobren 1.500 € al mes. 

		El mètode crearHotel() haurà de demanar a l’usuari/ària que introdueixi 
		per pantalla les dades de nom, nombre d’habitacions, nombre de plantes i 
		superfície total de l’hotel (o haurà de rebre aquestes dades per paràmetre). 
		Un cop hagi demanat totes aquestes dades, s’ha d’instanciar l’objecte de la 
		classe i afegir-lo a un array d’hotels.
		Si el hotel ya está subido en la aplicación, no subirlo de nuevo (comprobar antes de 
		darse de alta, corroborarlo con el nombre). 

		El mètode donarDeBaixaHotel() haurà de rebre el nom de l'hotel que es vol 
		donar de baixa. L’usuari/ària introduirà el nom de l’hotel i si l’hotel
		 està dintre de l’array, l’eliminarem i mostrarem un missatge per pantalla 
		 informant l’usuari/ària que hem eliminat l’hotel. Si no hem trobat l’hotel 
		 dintre de l’array, avisarem l’usuari/ària dient que l’hotel no estava dintre 
		 de la nostra aplicació.

		El mètode veureHotel() haurà de rebre el nom de l'hotel que vol que 
		mostrem per pantalla, si l’hotel està a la nostra aplicació, li mostrarem
		 l’hotel, si no hi és, informarem l’usuari/ària dient que l’hotel que ens 
		 ha demanat no està dintre de la nostra aplicació.

		Quan mostrem l’hotel, a més, de mostrar el nombre d’habitacions, 
		nombre de plantes i superfície total de l’hotel també es cridarà al 
		mètode calcularManteniment().

		El mètode modificarHotel() haurà de rebre el nom de l'hotel que volem 
		modificar. L’usuari/ària introduirà el nom de l’hotel. Si el tenim a 
		l’aplicació, li demanarem si vol modificar el nombre d’habitacions, 
		el nombre de plantes o la superfície total de l’hotel. Farem la 
		modificació pertinent i avisarem a l’usuari/ària que la modificació 
		s’ha realitzat.
		 */
		
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		Hotel hotel1 = new Hotel("Hilton", 250, 13, 300);
		hotels.add(hotel1);
		Hotel hotel2 = new Hotel("Ritz", 300, 10, 250);
		hotels.add(hotel2);
		
		int position;
		int option = 0;
		
		do {
			option = menu();
			
			switch(option) {
			case 1: position = searchHotel(hotels);
					createNewHotel(hotels, position);
					break;
			case 2: position = searchHotel(hotels);
					removeHotel(hotels, position);
					break;
			case 3: position = searchHotel(hotels);
					showHotel(hotels, position);
					break;
			case 4: position = searchHotel(hotels);
					modifyHotel(hotels, position);
					break;
			case 5: seeHotels(hotels);
					break;
			case 0: System.out.println("Bye Bye!");
			
			}
			
		} while(option !=0);	 
		
	}
	
	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		System.out.println("### YOUR HOTEL APP ###");
		System.out.println("1 - Create Hotel");
		System.out.println("2 - Eliminate Hotel");
		System.out.println("3 - Show Hotel");
		System.out.println("4 - Modify Hotel");
		System.out.println("5 - See Hotels List");
		System.out.println("0 - Sign out");
		
		option = keyboard.nextInt();
		keyboard.nextLine();
		return option;
	}
	
	public static void createNewHotel(ArrayList<Hotel> hotels, int position) {
		Scanner keyboard = new Scanner(System.in);
		
		if (position == -1) {
			System.out.println("Hotel name:");
			String name = keyboard.nextLine();
			System.out.println("How many rooms in total:");
			int roomNumber = keyboard.nextInt();
			System.out.println("How many floors in total:");
			int floorNumber = keyboard.nextInt();
			System.out.println("Total area of the hotel:");
			int area2 = keyboard.nextInt();
			
			Hotel hotel = new Hotel(name, roomNumber, floorNumber, area2);
			
			hotels.add(hotel);
			System.out.println(hotel.manteinanceCalcul());
		} else {
			System.out.println("This hotel is already in the app");
		}		
	}
	
	public static int searchHotel(ArrayList<Hotel> hotels) {
		Scanner keyboard = new Scanner(System.in);
		int i = 0, position = -1;
		boolean isCreated = false;
		
		
		System.out.println("Hotel name:");
		String name = keyboard.nextLine();
		
		while(!isCreated && i < hotels.size()) {
			if(hotels.get(i).getName().equalsIgnoreCase(name)) {
				position = i;
				isCreated = true;
			}
			i++;
		}
		return position;
	}
	
	public static void removeHotel(ArrayList<Hotel> hotels, int position) {
		
		if(position != -1) {
			hotels.remove(position);
			System.out.println("The hotel has been removed");
		} else {
			System.out.println("This hotel you wanna remove is not in our app");
		}
	}
	
	public static void showHotel(ArrayList<Hotel> hotels, int position) {
		if (position != -1) {
			System.out.println(hotels.get(position).toString());
			System.out.println(hotels.get(position).manteinanceCalcul());
		} else {
			System.out.println("This hotel you wanna see is not in our app");
		}
	}
	
	public static void modifyHotel(ArrayList<Hotel> hotels, int position) {
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		int modifiedValue = 0;
		
		if(position != -1) {
			System.out.println("1-Modify room number");
			System.out.println("2-Modify floor number");
			System.out.println("3-Modify total area");
			option = keyboard.nextInt();
			System.out.println("Give me the new value");
			modifiedValue = keyboard.nextInt();
			
		} else {
			System.out.println("This hotel you wanna modify is not in our app");
		}
		
		
		if (option == 1) {
			hotels.get(position).setRoomNumber(modifiedValue);
			int newValue = hotels.get(position).getRoomNumber();
			System.out.println("Modification done correctly: " + newValue );
		} else if (option == 2) {
			hotels.get(position).setFloorNumber(modifiedValue);
			int newValue = hotels.get(position).getFloorNumber();
			System.out.println("Modification done correctly: " + newValue );
		} else if( option == 3) {
			hotels.get(position).setArea2(modifiedValue);
			int newValue = hotels.get(position).getArea2();
			System.out.println("Modification done correctly: " + newValue );
		}
	}
	
	
	public static void seeHotels(ArrayList<Hotel> hotels) {
		for (int i = 0; i < hotels.size(); i++) {
			System.out.println(hotels.get(i).toString());
			
		}
	}

}
