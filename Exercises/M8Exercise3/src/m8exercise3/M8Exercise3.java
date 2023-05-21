package m8exercise3;

import java.util.ArrayList;
import java.util.Scanner;


public class M8Exercise3 {

	public static void main(String[] args) {
		/*
		 * Donat el diagrama de classes de la imatge.

			Programa una aplicació que tingui programades totes les opcions del següent menú:

			0.- Sortir de l'aplicació.
			1.- Crear client/a.
			2.- Eliminar client/a.
			3.- Crear compta d'un client/a.
			4.- Ingressar euros en un compte d'un client/a.
			5.- Retirar euros en un compte d'un client/a.
			
			A tenir en compte:
			- El saldo inicial de totes les comptes, ha de ser 0 €.
			- En crear un client/a, no haurà de tenir cap compte “associada”.
			- El diagrama UML mostrà les propietats i mètodes mínims que han de tenir les classes, però pots crear-ne més si és necessari.
		 */
		
		ArrayList<Client> clients = new ArrayList<Client>();
		
		Client client1 = new Client("Dafne", "Schilling");
		Client client2 = new Client("Gaya", "Wood");
		clients.add(client1);
		clients.add(client2);
		
		int option=0;
		
		do {
			option = menu();
			switch(option) {
			case 0: System.out.println("Bye Bye!");
				break;
			case 1: newClient(clients);
					break;
			case 2: removeClient(clients);
					break;
			case 3: openAccount(clients);
					break;
			case 4: enterAmount(clients);
					break;
			case 5: withdrawAmount(clients);
				break;
			}
		} while(option != 0);
		
	}
	
	public static int menu() {
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		
		System.out.println("### YOUR BANK APP ###");
		System.out.println("1 - Create Client");
		System.out.println("2 - Eliminate Client");
		System.out.println("3 - Create Client Account");
		System.out.println("4 - Enter Balance Account");
		System.out.println("5 - Withdraw Balance Account");
		System.out.println("0 - Sign out");
		
		option = keyboard.nextInt();
		keyboard.nextLine();
		
		return option;
	}

	public static void newClient(ArrayList<Client> clients) {
		ArrayList<String> clientData = new ArrayList<String>();
		
		clientData = clientData();
		
		String name = clientData.get(0);
		String surname = clientData.get(1);
		
		int position = searchClient(name, surname, clients);
		
		if (position != -1) {
			System.out.println("The client" + name + surname + " already exists in our database");	
		} else {
			Client client = new Client(name.toUpperCase(), surname.toUpperCase());
			clients.add(client);
			
			System.out.println("New client: " + client.getName() + " " + client.getSurname());
		}
		
		
	}
	
	public static ArrayList<String> clientData() {
		Scanner keyboard =  new Scanner(System.in);
		
		ArrayList<String> clientData = new ArrayList<String>();
		
		System.out.println("Give me the client name");
		String name = keyboard.nextLine();
		
		System.out.println("Give me the client surname");
		String surname = keyboard.nextLine();
		
		clientData.add(name);
		clientData.add(surname);
		
		return clientData;
		
	}
	
	public static int searchClient(String name, String surname, ArrayList<Client> clients) {
		
		int i = 0, position = -1;
		int size = clients.size();
		
		while(position == -1 && i < size) {
			if(clients.get(i).getName().equalsIgnoreCase(name) && clients.get(i).getSurname().equalsIgnoreCase(surname)) {
				position = i;
			}
			i++;
		}
		return position;
	}
	
	public static void removeClient(ArrayList<Client> clients) {
		ArrayList<String> clientData = new ArrayList<String>();
		
		clientData = clientData();
		
		String name = clientData.get(0);
		String surname = clientData.get(1);
		
		
		
		int position = searchClient(name, surname, clients);
		
		if (position != -1) {
			clients.remove(position);
			System.out.println("This client is removed correctly from our database");
		} else {
			System.out.println("This client you wanna remove is not in our database");
		}
	}
	
	public static void openAccount(ArrayList<Client> clients) {
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> clientData = new ArrayList<String>();
		
		clientData = clientData();
		
		String name = clientData.get(0);
		String surname = clientData.get(1);
		
		int position = searchClient(name, surname, clients);
		
		if (position == -1) {
			System.out.println("This client doesn't exist in our database");
		} else {
			System.out.println("Give me the number account");
			int numberAccount = keyboard.nextInt();
			
			Account account = searchClientAccount(numberAccount, clients.get(position).getAccount());
			
			if(account == null) {
				Account newAccount = new Account(numberAccount, 0);
				clients.get(position).getAccount().add(newAccount);
				System.out.println("Number Account: " + numberAccount + " created");
			} else {
				System.out.println("This number account " + account.getNumAccount() + "already exists in client " + clients.get(position).getName());
			}
		}
	}
	
	private static Account searchClientAccount(int numberAccount, ArrayList<Account> accounts) {
		Account account = null;
		
		int i = 0;
		
		while (i < accounts.size() && account == null) {
			if(accounts.get(i).getNumAccount() == numberAccount) {
				account = accounts.get(i);
				System.out.println("This account already exists");
			}
			i++;
		}
		
		return account;
	}
	
	private static void enterAmount(ArrayList<Client> clients) {
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> clientData = new ArrayList<String>();
		
		clientData = clientData();
		
		String name = clientData.get(0);
		String surname = clientData.get(1);
		
		int position = searchClient(name, surname, clients);
		
		if (position == -1) {
			System.out.println("This client doesn't exist in our database");
		} else {
			System.out.println("Give me the number account");
			int numberAccount = keyboard.nextInt();
			
			Account account = searchClientAccount(numberAccount, clients.get(position).getAccount());
			
			if(account != null) {
				System.out.println("Give me the amount to enter");
				int amount = keyboard.nextInt();
				
				int balance = account.enterBalance(amount);
				
				System.out.println("Balance " + balance + " added to " + account);
			} else {
				System.out.println("This number account " + numberAccount + " doesn't exists in client " + clients.get(position).getName());
			}
		}	
	}
	
	private static void withdrawAmount(ArrayList<Client> clients) {
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> clientData = new ArrayList<String>();
		
		clientData = clientData();
		
		String name = clientData.get(0);
		String surname = clientData.get(1);
		
		int position = searchClient(name, surname, clients);
		
		if (position == -1) {
			System.out.println("This client doesn't exist in our database");
		} else {
			System.out.println("Give me the number account");
			int numberAccount = keyboard.nextInt();
			
			Account account = searchClientAccount(numberAccount, clients.get(position).getAccount());
			
			if(account != null)	{			
				System.out.println("Give me the amount to withdraw");
				int amountWithdraw = keyboard.nextInt();
				
				account.withdrawBalance(amountWithdraw);
			} else {
				System.out.println("This number account " + numberAccount + " doesn't exists in client " + clients.get(position).getName());
			}
		}
	}
	
	
}
