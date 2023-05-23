package m8exercise6;

public class Car {
	private int power;
	private int maxVelocity;
	private String colour;
	private int marketPrice;
	
	public Car(int power, int maxVelocity, String colour, int marketPrice) {
		this.power = power;
		this.maxVelocity = maxVelocity;
		this.colour = colour;
		this.marketPrice = marketPrice;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getMaxVelocity() {
		return maxVelocity;
	}
	
	public void setMaxVelocity(int maxVelocity) {
		this.maxVelocity = maxVelocity;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getMarketPrice() {
		return marketPrice;
	}
	
	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}

	@Override
	public String toString() {
		return "Car -> power=" + power + ", maxVelocity=" + maxVelocity + ", colour=" + colour + ", marketPrice="
				+ marketPrice + ";";
	}
	
	
}
