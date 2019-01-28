package LevelTwo.Garage;

import java.util.ArrayList;

public class Garage {
	
	private static ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	private int bill = 0;
	
	public void addVehicle(Vehicle vehicle){
		
		vehicleList.add(vehicle);

	}
	
	public void removeVehicleByID(int vehicleID){
		
		vehicleList.removeIf(obj -> obj.getVehicleID() == vehicleID);

	}
	
	public void removeVehicleByType(String vehicleType) {
		
		vehicleList.removeIf(obj -> obj.getVehicleType() == vehicleType);
	}
	
	public int fixVehicle(Vehicle vehicle) {
		
		if (vehicle instanceof Car) {
			bill = 500; 
		}
		else if (vehicle instanceof Motorcycle) {
			bill = 300;
		}
		else {
			bill = 20; 
		}
		
		return bill;
		
	}

	public static void main(String[] args) {
		
		Garage garageOne = new Garage();

		Car carOne = new Car(0, "Car", 4);
		Motorcycle motorOne = new Motorcycle(1, "Motorcycle", 100);
		Bicycle bikeOne = new Bicycle(2, "Bicycle", 6);
		
		garageOne.addVehicle(carOne);
		garageOne.addVehicle(motorOne);
		garageOne.addVehicle(bikeOne);
		
		garageOne.removeVehicleByID(0);
		garageOne.removeVehicleByType("Bicycle");
		
		for (Vehicle i : vehicleList) {
			System.out.println(i);
		}		

	}

}
