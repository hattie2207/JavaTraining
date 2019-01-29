package garageTask;

public class GarageMain {

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
		
		garageOne.fixVehicle(carOne);
		garageOne.printVehicleList();

		garageOne.emptyGarage();
		garageOne.printVehicleList();
		

	}

}
