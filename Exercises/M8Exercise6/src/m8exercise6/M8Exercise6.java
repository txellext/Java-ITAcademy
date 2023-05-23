package m8exercise6;

import java.util.ArrayList;
import java.util.Scanner;

import inheritance.Mechanic;
import inheritance.Pilot;


public class M8Exercise6 {

	public static void main(String[] args) {
		/*
		 * L'organització d’un campionat de cotxes vol tenir un programa per gestionar part 
		 * de la informació que fins ara no tenien informatitzada. Volen saber de cada escuderia 
		 * que participa en el campionat, el nom, el pressupost que tenen i el país d’origen. 
		 * Cada escuderia pot tenir més d’un cotxe i de cadascun volen saber la potència, la 
		 * velocitat màxima, el color i el preu de mercat. 

			De les persones treballadores de les diferents escuderies volen saber el nom, el 
			primer cognom, l’edat, el temps que porten a l’escuderia i el sou. El sou base és 
			de 50.000 €. A més, dels/les pilots volen saber la seva alçada, el pes. El sou dels
			/les pilots és el sou base de les persones treballadores més 10.000 € per cada any 
			 * d’antiguitat a l’escuderia, més 50.000 € de perillositat. 

			Dels/les mecànics volen saber si tenen estudis superiors de mecànica o no. I el seu 
			sou es calcula sumant 10.000 € per cada any d’antiguitat a l’escuderia més el sou base.
			

			Es demana que l’aplicació sigui capaç de donar d’alta, de baixa i de veure pilots i 
			mecànics, i de veure escuderies i bòlids. Les escuderies i els bòlids poden estar 
			introduïts directament en el codi.
		 */
		
		
		ArrayList<Squad> squads = new ArrayList<Squad>();
		ArrayList<Car> cars = new ArrayList<Car>();
		
		Squad squad1 = new Squad("McLaren", 100000, "UK");
		Squad squad2 = new Squad("Ferrari", 200000, "Italy");
		
		Car car1 = new Car(250, 200, "blue", 100000);
		Car car2 =  new Car(300, 350, "yellow", 150000);
		
		
		squads.add(squad1);
		squads.add(squad2);
		
		
		int option = 0;
		
		do {
			option = menu();
			
			switch(option) {
			case 1: registerWorker(squads);
					break;
			case 2: removeWorker(squads);
					break;
			case 0: System.out.println("Bye Bye!");;

			}
			
		} while(option != 0);
	}

	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		System.out.println("0 - Bye!");
		System.out.println("1 - Register a new Worker");
		System.out.println("2 - Delete a Worker");
		

		
		option = keyboard.nextInt();
		return option;
	}
	
	public static void registerWorker(ArrayList<Squad> squads) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me the name of the squad");
		String squadName = keyboard.nextLine();
		
		Squad squad = searchSquad(squads, squadName);
		
		if(squad == null) {
			System.out.println("Squad " + squadName + "does not exist in our app");
		} else {
			System.out.println("Give me the name of the new worker");
			String name = keyboard.next();
			
			System.out.println("Give me the surname of the new worker");
			String surname = keyboard.next();
			
			System.out.println("Give me if it is: \n 1. Pilot or 2. Mechanic");
			int workerType = keyboard.nextInt();
			
			switch(workerType){
			case 1: registerPilot(squad, name, surname);
					break;
			case 2: registerMechanic(squad, name, surname);
					break;
			default:
				System.out.println("the option is not correct");
			}
		}
		
		
	}
	
	public static Squad searchSquad(ArrayList<Squad> squads, String squadName) {
		Squad squad = null;
		int i = 0;
		
		while(squad == null && i < squads.size()) {
			if(squads.get(i).getName().equalsIgnoreCase(squadName)) {
				squad = squads.get(i);
			}
			i++;
		}
		return squad;
	}
	
	// Search Pilot and register or not
	public static void registerPilot(Squad squad, String name, String surname) {
		Scanner keyboard = new Scanner(System.in);
		
		Pilot pilot = null;
		int i = 0;
		
		//Search
		while(pilot == null && i < squad.getWorkers().size()) {
			if(squad.getWorkers().get(i).getName().equalsIgnoreCase(name) 
					&& squad.getWorkers().get(i).getSurname().equalsIgnoreCase(surname)
					&& squad.getWorkers().get(i) instanceof Pilot) {
				pilot = (Pilot)squad.getWorkers().get(i);
			}
			i++;
		}
		
		// Register
		if(pilot == null) {
			pilot = createPilot();
			squad.getWorkers().add(pilot);
		} else {
			System.out.println("The worker " + name + " " + surname + "is already registered in our app");
		}
	}
	
	public static Pilot createPilot() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give pilot name:");
		String name = keyboard.nextLine();
		System.out.println("Give pilot surname:");
		String surname = keyboard.nextLine();
		System.out.println("Give pilot age:");
		int age = keyboard.nextInt();
		System.out.println("Give pilot antiquity:");
		int antiquity = keyboard.nextInt();
		System.out.println("Give pilot height:");
		int height = keyboard.nextInt();
		System.out.println("Give pilot weight:");
		int weight = keyboard.nextInt();
		
		Pilot pilot = new Pilot(name, surname, age, antiquity, height, weight);
		
		return pilot;
	}
	
	// Search Mechanic and register or not
		public static void registerMechanic(Squad squad, String name, String surname) {
			Scanner keyboard = new Scanner(System.in);
			
			Mechanic mechanic = null;
			int i = 0;
			
			//Search
			while(mechanic == null && i < squad.getWorkers().size()) {
				if(squad.getWorkers().get(i).getName().equalsIgnoreCase(name) 
						&& squad.getWorkers().get(i).getSurname().equalsIgnoreCase(surname)
						&& squad.getWorkers().get(i) instanceof Mechanic) {
					mechanic = (Mechanic)squad.getWorkers().get(i);
				}
				i++;
			}
			
			// Register
			if(mechanic == null) {
				mechanic = createMechanic();
				squad.getWorkers().add(mechanic);
			} else {
				System.out.println("The worker " + name + " " + surname + "is already registered in our app");
			}
		}
	
	public static Mechanic createMechanic() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give mechanic name:");
		String name = keyboard.nextLine();
		System.out.println("Give mechanic surname:");
		String surname = keyboard.nextLine();
		System.out.println("Give mechanic age:");
		int age = keyboard.nextInt();
		System.out.println("Give mechanic antiquity:");
		int antiquity = keyboard.nextInt();
		System.out.println("Say if mechanic has higher studies:");
		boolean higherStudies = keyboard.nextBoolean();
		
		
		Mechanic mechanic = new Mechanic(name, surname, age, antiquity, higherStudies);
		
		return mechanic;
	}
	
	public static void removeWorker(ArrayList<Squad> squads) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me the name of the squad");
		String squadName = keyboard.nextLine();
		
		Squad squad = searchSquad(squads, squadName);
		
		if(squad == null) {
			System.out.println("Squad " + squadName + "does not exist in our app");
		} else {
			System.out.println("Give me the name of the new worker");
			String name = keyboard.next();
			
			System.out.println("Give me the surname of the new worker");
			String surname = keyboard.next();
			
			System.out.println("Give me if it is: \n 1. Pilot or 2. Mechanic");
			int workerType = keyboard.nextInt();
			
			switch(workerType){
			case 1: removePilot(squad, name, surname);
					break;
			case 2: removeMechanic(squad, name, surname);
					break;
			default:
				System.out.println("the option is not correct");
			}
		}
	}
	
	public static void removePilot(Squad squad, String name, String surname) {
		Scanner keyboard = new Scanner(System.in);
		
		Pilot pilot = null;
		int i = 0;
		
		//Search
		while(pilot == null && i < squad.getWorkers().size()) {
			if(squad.getWorkers().get(i).getName().equalsIgnoreCase(name) 
					&& squad.getWorkers().get(i).getSurname().equalsIgnoreCase(surname)
					&& squad.getWorkers().get(i) instanceof Pilot) {
				pilot = (Pilot)squad.getWorkers().get(i);
			}
			i++;
		}
		
		// Register
		if(pilot != null) {
			squad.getWorkers().remove(pilot);
		} else {
			System.out.println("The worker " + name + " " + surname + "is not registered in our app");
		}
	}
	
	public static void removeMechanic(Squad squad, String name, String surname) {
		Scanner keyboard = new Scanner(System.in);
		
		Mechanic mechanic = null;
		int i = 0;
		
		//Search
		while(mechanic == null && i < squad.getWorkers().size()) {
			if(squad.getWorkers().get(i).getName().equalsIgnoreCase(name) 
					&& squad.getWorkers().get(i).getSurname().equalsIgnoreCase(surname)
					&& squad.getWorkers().get(i) instanceof Mechanic) {
				mechanic = (Mechanic)squad.getWorkers().get(i);
			}
			i++;
		}
		
		// Register
		if(mechanic != null) {
			squad.getWorkers().remove(mechanic);
		} else {
			System.out.println("The worker " + name + " " + surname + "is not registered in our app");
		}
	}
}
