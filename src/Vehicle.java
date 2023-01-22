
public class Vehicle {

	public String make;
	public String model;
	public String color;
	public int numberOfWheels;
	public int weight;
	public int year;
	

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
	
}