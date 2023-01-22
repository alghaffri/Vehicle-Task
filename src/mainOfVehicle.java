
public class mainOfVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle1 = new Vehicle();

		vehicle1.setMake("BMW"); 
		vehicle1.setModel("sedan"); 
		vehicle1.setColor("blue"); 

		Car car1 = new Car();
		car1.setNumberOfDoors(4);
		System.out.println("This car has " + car1.getNumberOfDoors() + " Doors ");

		Truck truck1 = new Truck();
		truck1.setNumberOfAxles(10); 
		truck1.setCapacityInTons(6000);
		System.out.println("This Truck has " + truck1.getNumberOfAxles() + " Axles " + " and " + truck1.getCapacityInTons()
				+ " capacity In  Tons ");

	}

}
