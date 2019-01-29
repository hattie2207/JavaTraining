package garageTask;

public class Car extends Vehicle {
	
	private int numberOfDoors = 0;

	public Car(int vehicleID, String vehicleType, int numberOfDoors) {
		super(vehicleID, vehicleType);
		
		this.numberOfDoors = numberOfDoors;
	}
	

}
