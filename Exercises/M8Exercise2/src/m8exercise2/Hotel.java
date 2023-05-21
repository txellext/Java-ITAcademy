package m8exercise2;

public class Hotel {
	private String name;
	private int roomNumber;
	private int floorNumber;
	private int area2;
	
	public Hotel(String name, int roomNumber, int floorNumber, int area2) {
		this.name = name;
		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.area2 = area2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getArea2() {
		return area2;
	}

	public void setArea2(int area2) {
		this.area2 = area2;
	}
	
	public String manteinanceCalcul() {
		int salary = 1500;
		int rooms = 20;
				
		float personalNumber = (float)this.roomNumber/rooms;
		personalNumber = (float) Math.ceil(personalNumber);
		
		int personalCost = (int)personalNumber * salary;
		
		
		
		return " We need " + (int)personalNumber + " workers for this hotel and a total cost of " + personalCost + " Euros/month for these workers" ;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", roomNumber=" + roomNumber + ", floorNumber=" + floorNumber + ", area2="
				+ area2 + "]";
	}
	
	
}
