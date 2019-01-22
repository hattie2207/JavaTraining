package LevelTwo.Garage;

public class Car extends Vehicle {
	
	private int numberOfDoors = 0;

	public Car(int numberOfDoors, String ownerName, int price, String colour) {
		super(ownerName, price, colour);
		
		this.numberOfDoors = numberOfDoors;
	}

}
