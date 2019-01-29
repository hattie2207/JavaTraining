package garageTask;

public class Motorcycle extends Vehicle {	
	
	private int horsepower = 0; 

	public Motorcycle(int vehicleID, String vehicleType, int horsepower) {
		super(vehicleID, vehicleType);
		
		this.horsepower = horsepower;
		
	}

}
