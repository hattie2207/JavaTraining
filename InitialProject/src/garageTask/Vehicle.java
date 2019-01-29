package garageTask;

public class Vehicle {

	private int vehicleID = 0;
	private String vehicleType = "";

	public Vehicle(int vehicleID, String vehicleType) {
		this.vehicleID = vehicleID;
		this.vehicleType = vehicleType;

	}
	
	public String toString() {				
		return "Vehicle ID: " + vehicleID + " Vehicle Type: " + vehicleType;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public String getVehicleType() {
		return vehicleType;
	}	
	
}
