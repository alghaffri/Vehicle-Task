
public class mainOfVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = new Vehicle();

		vehicle1.make = "BMW";
		vehicle1.model = "sedan";
		vehicle1.color = "blue";

		Car car1 = new Car();
		car1.numberOfDoors = 4;
		System.out.println("This car has " + car1.numberOfDoors + " Doors ");

		Truck truck1 = new Truck();
		truck1.numberOfAxles = 10;
		truck1.capacityInTons = 6000;
		System.out.println("This Truck has " + truck1.numberOfAxles + " Axles " + " and " + truck1.capacityInTons
				+ " capacityInTons ");

	}

}
