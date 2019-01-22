package LevelTwo.Garage;

public class Car extends Vehicle {
	
	private int numberOfDoors = 0;

	public Car(int numberOfDoors, String ownerName, int plateNumber, String colour) {
		super(ownerName, plateNumber, colour);
		
		this.numberOfDoors = numberOfDoors;
	}

}
