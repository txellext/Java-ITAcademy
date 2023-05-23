package inheritance;

public class Mechanic extends Worker {
	private boolean higherStudies;

	public Mechanic(String name, String surname, int age, int antiquity, boolean higherStudies) {
		super(name, surname, age, antiquity);
		this.higherStudies = higherStudies;
	}

	public boolean isHigherStudies() {
		return higherStudies;
	}

	public void setHigherStudies(boolean higherStudies) {
		this.higherStudies = higherStudies;
	}

	@Override
	public void calculateSalary() {
		int plusAntiquity = super.antiquity * 10000;
		super.salary = Worker.BASICSALARY + plusAntiquity;
		System.out.println("The mechanic salary is " + super.salary);
	}

	@Override
	public String toString() {
		return "Mechanic -> higherStudies=" + higherStudies + ";";
	}
	
	

}
