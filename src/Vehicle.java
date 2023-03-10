
public class Vehicle extends Engine implements Honkable
{

	private String make;
	private String model;
	private String color;
	private int numberOfWheels;
	private int weight;
	private int year;
	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void startVehicle(){
		System.out.println("Vehicle started");
	}
	
	public void stopVehicle(){
		System.out.println("Vehicle stopped");
	}
	
	public void driveVehicle(int milesDriven){
		System.out.println("Vehicle driven " + milesDriven + " miles.");
	}
	
	public void honkVehicle(){
		System.out.println("Honk Honk!");
	}



	@Override
	public void honk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}
	
}