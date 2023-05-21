package m8exercise3;

import java.util.ArrayList;

public class Client {
	private String name;
	private String surname;
	private ArrayList<Account> accounts;
	
	public Client(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.accounts = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public ArrayList<Account> getAccount(){
		return accounts;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", surname=" + surname + ", accounts=" + accounts + "]";
	}
	
	
	
}
