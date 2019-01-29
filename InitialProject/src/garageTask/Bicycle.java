package garageTask;

public class Bicycle extends Vehicle {
	
	private int gear = 0;

	public Bicycle(int vehicleID, String vehicleType, int gear) {
		super(vehicleID, vehicleType);
		
		this.gear = gear;
		
	}

}
