
public class Truck  extends Vehicle {
	
	
	private int numberOfAxles;
	private int  capacityInTons;
	
	
	
	public void load(int Loaded) {
		System.out.println("Loaded " + Loaded + " tons");
	}



	public int getNumberOfAxles() {
		return numberOfAxles;
	}



	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}



	public int getCapacityInTons() {
		return capacityInTons;
	}



	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}

}