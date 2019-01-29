package LevelTwo.Garage;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle){
		
		vehicleList.add(vehicle);

	}
	
	public void removeVehicleByID(int vehicleID){
		
		vehicleList.removeIf(obj -> obj.getVehicleID() == vehicleID);

	}
	
	public void removeVehicleByType(String vehicleType) {
		
		vehicleList.removeIf(obj -> obj.getVehicleType() == vehicleType);
	}
	
	public String  fixVehicle(Vehicle vehicle) {
		
		int bill = 0;
		
		if (vehicle instanceof Car) {
			bill = 500; 
		}
		else if (vehicle instanceof Motorcycle) {
			bill = 300;
		}
		else {
			bill = 20; 
		}
		
		return "The bill for " + vehicle + " is £" + bill;
		
	}
	
	public void emptyGarage() {
		
		vehicleList.clear();
	}
	
	public void printVehicleList() {
		
		for (Vehicle i : vehicleList) {
			System.out.println(i);
		}		
		
	}

}
