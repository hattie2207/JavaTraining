package LevelTwo;

public class BlackJack {

	public static String blackJack(int firstNumber, int secondNumber) {		
		
		String outputMessage = "";

		if (firstNumber > 0 && secondNumber > 0) {
			if (firstNumber <= 21 && secondNumber <= 21) {
				if (firstNumber > secondNumber) {
					outputMessage = "First player win with the value of: " + firstNumber; 
					
				}
				else if  (secondNumber > firstNumber){
					outputMessage = "Second player win with the value of: " + secondNumber; 			
					
				}
				else {
					outputMessage = "It's a draw with the value of: " + secondNumber; 			
				}
			}
			else if (firstNumber > 21 && secondNumber <= 21) {
				outputMessage = "Second player win with the value of: " + secondNumber; 

			}
			else if (secondNumber > 21 && firstNumber <= 21) {
				outputMessage = "First player win with the value of: " + firstNumber; 
				
			}
			else {
				outputMessage = "Both integer values are over 21"; 

			}
		}
		else {
			outputMessage = "Both integer values must be greater than 0";
			
		}

		return outputMessage;

	}	
	
	public static void main(String[] args) {
		
		int firstNumber = 12;
		int secondNumber = 10;
		
		String outputMessage = blackJack(firstNumber, secondNumber);		
		
		System.out.println(outputMessage);
		
	}

}
