package LevelTwo.Garage;

import java.util.ArrayList;

public class Garage {

	public static void main(String[] args) {

		Car carOne = new Car(4, "Hattie", 5000, "Black");
		Motorcycle motorOne = new Motorcycle(100, "Tom", 3000, "Red");
		Bicycle bikeOne = new Bicycle(4, "Patrick", 200, "White");

		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(carOne);
		vehicleList.add(motorOne);
		vehicleList.add(bikeOne);

	}

}
