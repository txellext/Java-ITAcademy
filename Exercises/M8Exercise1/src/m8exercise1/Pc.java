package m8exercise1;

public class Pc {
	
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private int hardDisk;
	
	public Pc(String brand, String model, String processor, int ram, int hardDisk) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.hardDisk = hardDisk;
	}
	
	public Pc(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	
	public String toExecute(String software) {
		return "We are executing: " + software;
	}

	@Override
	public String toString() {
		return "Pc [brand=" + brand + ", model=" + model + ", processor=" + processor + ", ram=" + ram + ", hardDisk="
				+ hardDisk + "]";
	}
	

}
