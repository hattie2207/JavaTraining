package LevelTwo.Garage;

import java.util.ArrayList;

public class Garage {
	
	public static int calculateBill(ArrayList<Vehicle> vehicleList) {
		
		int bill = 0;
		
		for (Vehicle i : vehicleList) {
			if (i instanceof Car) {
				bill = 500; 
			}
			else if (i instanceof Motorcycle) {
				bill = 300;
			}
			else {
				bill = 20; 
			}
		}
		
		return bill;
	}

	public static void main(String[] args) {

		Car carOne = new Car(0, "Car", 4);
		Motorcycle motorOne = new Motorcycle(1, "Motorcycle", 100);
		Bicycle bikeOne = new Bicycle(2, "Bicycle", 6);

		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(carOne);
		vehicleList.add(motorOne);
		vehicleList.add(bikeOne);

	}

}
