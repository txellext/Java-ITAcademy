package inheritance;


public abstract class Worker {
	protected final String name;
	protected final String surname;
	protected int age;
	protected int antiquity;
	protected float salary;
	protected static final float BASICSALARY = 50000;
	
	public Worker(String name, String surname, int age, int antiquity) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.antiquity = antiquity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAntiquity() {
		return antiquity;
	}

	public void setAntiquity(int antiquity) {
		this.antiquity = antiquity;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public static float getBasicsalary() {
		return BASICSALARY;
	}

	
	public abstract void calculateSalary();

	@Override
	public String toString() {
		return "Worker -> name=" + name + ", surname=" + surname + ", age=" + age + ", antiquity=" + antiquity
				+ ", salary=" + salary + ";";
	}
	
	
	
}
