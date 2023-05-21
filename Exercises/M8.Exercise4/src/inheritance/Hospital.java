package inheritance;

public class Hospital extends BcnBuilding {
	
	public static final int DELIVERYTIMINGS = 3;
	private int pacientNumber;
	
	public Hospital(String name, int numFloors, int surface, int pacientNumber) {
		super(name, numFloors, surface);
		this.pacientNumber = pacientNumber;
	}

	public int getPacientNumber() {
		return pacientNumber;
	}


	public void setPacientNumber(int pacientNumber) {
		this.pacientNumber = pacientNumber;
	}

	
	public void foodDelivery() {
		int portions;
		portions = this.pacientNumber * Hospital.DELIVERYTIMINGS;
		
		System.out.println("Deliverying " + portions + " portions");
	}

	public void vigilanceCost() {
		final float maximumsurfacePerWorker = 1000;
		int watchmanSalary = 1300;
		
		int numWatchman = (int)Math.ceil(super.surface/maximumsurfacePerWorker);
		float totalExpenses = (float) (watchmanSalary * numWatchman );
		
		System.out.println("The total expenses for watchmans is " + totalExpenses + " with a total of "+ numWatchman + " of watchmans");
	}

	@Override
	public String toString() {
		return "Hospital -> pacientNumber = " + pacientNumber + ";";
	}


	

}
