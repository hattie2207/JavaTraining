package LevelTwo.Garage;

public class Bicycle extends Vehicle {
	
	private int gear = 0;

	public Bicycle(int gear, String ownerName, int price, String colour) {
		super(ownerName, price, colour);
		
		this.gear = gear;
		
	}

}
