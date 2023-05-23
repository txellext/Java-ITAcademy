package m8exercise6;

import java.util.ArrayList;

import inheritance.Worker;

public class Squad {
	private final String name;
	private final int budget;
	private final String country;
	private ArrayList<Car> cars;
	private ArrayList<Worker> workers;
	
	public Squad(String name, int budget, String country) {
		this.name = name;
		this.budget = budget;
		this.country = country;
		this.cars = new ArrayList<Car>();
		this.workers = new ArrayList<Worker>();
	}


	public ArrayList<Car> getCars() {
		return cars;
	}


	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}


	public ArrayList<Worker> getWorkers() {
		return workers;
	}


	public void setWorkers(ArrayList<Worker> workers) {
		this.workers = workers;
	}


	public String getName() {
		return name;
	}


	public int getBudget() {
		return budget;
	}

	public String getCountry() {
		return country;
	}


	@Override
	public String toString() {
		return "Squad -> name=" + name + ", budget=" + budget + ", country=" + country + ";";
	}
	
	
	
	
	
	

}
