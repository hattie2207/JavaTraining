
public class UniqueSum {

	public static String uniqueSum(int firstNumber, int secondNumber, int thirdNumber) {

		int total = 0;

		String outputMessage = "";

		if (firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != firstNumber) {
			total = firstNumber + secondNumber + thirdNumber;

		}
		else if (firstNumber == secondNumber && secondNumber != thirdNumber) {
			total = firstNumber + thirdNumber;

		}
		else if (firstNumber == thirdNumber && firstNumber != secondNumber) {
			total = firstNumber + secondNumber; 
			
		}
		else if (secondNumber == thirdNumber && firstNumber != thirdNumber) {
			total = firstNumber + secondNumber; 
		}

		else {
			total = firstNumber; 
		}
		
		outputMessage = "The unique sum is: " + total;

		return outputMessage;
	}

}
