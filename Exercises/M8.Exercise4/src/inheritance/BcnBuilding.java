package inheritance;

public abstract class BcnBuilding {

	protected String name;
	protected int numFloors;
	protected int surface;
	
	public BcnBuilding(String name, int numFloors, int surface) {
		this.name = name;
		this.numFloors = numFloors;
		this.surface = surface;
		//this.watchmanSalary = 1300;
	}
	
	public String getName() {
		return name;
	}

	public int getNumFloors() {
		return numFloors;
	}

	public int getSurface() {
		return surface;
	}

	public void cleanBuilding() {
		int totalDays = 30;
		
		float cleaningTime =  (float) Math.ceil(this.surface/5);
		float floorsTime = (float) Math.ceil((this.numFloors -1)*0.5);
		int cleaningCost = (int)(Math.ceil(cleaningTime + floorsTime));
		int cleaningExpenses = cleaningCost * totalDays;
		
		System.out.println("It is needed " + cleaningCost + " minutes to clean and " + cleaningExpenses +" euros/month" );
	}
	
	public abstract void vigilanceCost();

	@Override
	public String toString() {
		return "BcnBuilding --> name=" + name + ", numFloors=" + numFloors + ", surface=" + surface + " ";
	}
	
	
	
	
		





	
}
