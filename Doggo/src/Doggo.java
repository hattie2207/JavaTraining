import java.util.Scanner;

public class Doggo {

	private String[] places = new String[100]; 
	
	private Scanner inputReader = new Scanner(System.in);	
	
	Doggo() {
		populatePlaces();
	}

	private void populatePlaces() {

		for (int i = 0; i < places.length; i++) {

			int placement = i + 1;

			if (placement == 11 || placement == 12 || placement == 13) {
				places[i] = placement + "th";
			}
			else if (placement % 10 == 1) {
				places[i] = placement + "st";
			}
			else if (placement % 10 == 2) {
				places[i] = placement + "nd";

			}
			else if (placement % 10 == 3) {
				places[i] = placement + "rd";

			}
			else {

				places[i] = placement + "th";
			}	

		}
	}

	private void excludingPlacement(int dogPlacement) {

		for (int i = 0; i < places.length; i++ ) {

			if (dogPlacement != i + 1) {

				String outputMessage = places[i];

				if (i != places.length-1) {
					outputMessage += ", ";
				}	

				System.out.print(outputMessage); 
			}			
		}

	}

	private void excludingPlacement(String dogPlacement) {

		for (int i = 0; i < places.length; i++ ) {

			if (!dogPlacement.equals(places[i])) {			

				String outputMessage = places[i];

				if (i != places.length-1) {
					outputMessage += ", ";
				}	

				System.out.print(outputMessage); 

			}			
		}

	}  
	
	private boolean isValidInput(String inputMessage) {
		
		return isValidEndChar(inputMessage); 
	}	
	
	private boolean isValidEndChar(String inputMessage) {
		
		return (inputMessage.contains("th") || inputMessage.contains("st") || inputMessage.contains("nd") || inputMessage.contains("rd"));
	}
	
	
	public void inputController() {
		
		System.out.println("Enter Wining Dog's Placement: ");
		
		if (inputReader.hasNext()) {
			if (inputReader.hasNextInt()) {
				int dogPlacement = inputReader.nextInt();
				excludingPlacement(dogPlacement);
			}
			else if (inputReader.hasNextLine()) {
				String dogPlacement = inputReader.nextLine();
				if (isValidInput(dogPlacement)) {
					excludingPlacement(dogPlacement);
				}
				else {
					System.out.println("Invalid Character, please try again");
					inputController();
				}		
				
			}		
		}
	}

}
