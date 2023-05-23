package inheritance;

public class Pilot extends Worker {
	private int height;
	private int wheight;
	public static final int DANGERPLUS = 50000;
	
	
	public Pilot(String name, String surname, int age, int antiquity, int height, int wheight) {
		super(name, surname, age, antiquity);
		this.height = height;
		this.wheight = wheight;
	}


	@Override
	public void calculateSalary() {
		int plusAntiquity = super.antiquity * 10000;
		super.salary = Worker.BASICSALARY + Pilot.DANGERPLUS + plusAntiquity; 
		System.out.println("The pilot salary is " + super.salary );
	}
	
	
	

	
}
