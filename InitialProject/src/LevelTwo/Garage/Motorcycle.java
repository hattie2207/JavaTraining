package LevelTwo.Garage;

public class Motorcycle extends Vehicle {	
	
	private int horsePower = 0; 

	public Motorcycle(int horsePower, String ownerName, int plateNumber, String colour) {
		super(ownerName, plateNumber, colour);
		
		this.horsePower = horsePower;
		
	}

}
