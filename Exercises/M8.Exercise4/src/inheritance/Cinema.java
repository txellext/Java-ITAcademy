package inheritance;

public class Cinema extends BcnBuilding {
	
	private int maximumCapacity;

	public Cinema(String name, int numFloors, int surface, int maximumCapacity) {
		super(name, numFloors, surface);
		this.maximumCapacity = maximumCapacity;
	}

	public int getMaximumCapacity() {
		return maximumCapacity;
	}
	
	public int setMaximumCapacity() {
		return maximumCapacity;
	}
	
	
	public void projectSession(int ticketPrice, int assistanceNumber) {
		float eurosCollected = 0;
		
		if(assistanceNumber<= this.maximumCapacity) {
			eurosCollected = assistanceNumber * ticketPrice;
			System.out.println(eurosCollected + " euros are collected");
		} else {
			eurosCollected = this.maximumCapacity * ticketPrice;
			System.out.println("Assistance are greater than the maximum capacity being " + eurosCollected + " the collected amount");			
		}		
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
		return "Cinema -> maximumCapacity = " + maximumCapacity + ";";
	}
	
	

}
