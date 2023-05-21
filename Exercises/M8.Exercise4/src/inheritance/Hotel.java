package inheritance;

public class Hotel extends BcnBuilding {
	
	public static final int PLUSDANGER = 500;
	private int roomsNumber;
	
	public Hotel(String name, int numFloors, int surface, int roomsNumber) {
		super(name, numFloors, surface);
		this.roomsNumber = roomsNumber;
	}
	
	public int getRoomSNumber() {
		return roomsNumber;
	}

	public void setRoomSNumber(int roomsNumber) {
		this.roomsNumber = roomsNumber;
	}

	public void calculateRoomServiceWorkers() {
		final int totalRoomsPerWorker = 20;
		final int roomServiceSalary = 1000;
		int totalWorkers = (int) Math.ceil(this.roomsNumber /  totalRoomsPerWorker);
		
		float roomServiceExpenses = totalWorkers * roomServiceSalary;

		System.out.println("Total room service workers are " + totalWorkers + " and a total expenses of " + roomServiceExpenses);
	}
	
	public void vigilanceCost() {
		final float maximumsurfacePerWorker = 1000;
		int watchmanSalary = 1300;
		
		int numWatchman = (int)Math.ceil(super.surface/maximumsurfacePerWorker);
		float totalExpenses = (float) ((watchmanSalary+Hotel.PLUSDANGER) * numWatchman );
		
		System.out.println("The total expenses for watchmans is " + totalExpenses + " with a total of "+ numWatchman + " watchmans");
	}

	@Override
	public String toString() {
		return "Hotel -> roomsNumber = " + roomsNumber + ";";
	}
	
	
}
