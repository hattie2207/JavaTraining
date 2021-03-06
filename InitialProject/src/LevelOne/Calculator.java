package levelOne;

public class Calculator {
	
	static String outputMessage = ""; 

	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber; 	
	}

	public static int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber; 	
	}	

	public static int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber; 

	}

	public static String conditionalsOne(int firstNumber, int secondNumber, boolean condition) {		

		if (condition == true) {
			outputMessage = "The sum of " + firstNumber + " and " + secondNumber + " is: " + add(firstNumber, secondNumber);			

		}
		else {
			outputMessage = "The multiplication of " + firstNumber + " and " + secondNumber + " is: " + multiply(firstNumber, secondNumber);

		}

		return outputMessage;

	}

	public static String conditionalsTwo(int firstNumber, int secondNumber) {	

		if (firstNumber == 0 && secondNumber != 0) {
			outputMessage = "The non-0 number is: " + secondNumber;				

		}
		else if (secondNumber == 0 && firstNumber != 0) {
			outputMessage = "The non-0 number is: " + firstNumber;				

		}
		else {
			outputMessage = "No non-0 number and the sum is: " + add(firstNumber, secondNumber);	

		}

		return outputMessage;


	}

	public static void iteration(int firstNumber, int secondNumber, int loopNumber) {	

		for (int i = 0; i < loopNumber; i++) { 
			outputMessage = conditionalsTwo(firstNumber, secondNumber);
			System.out.println(outputMessage);
		}
		
	}

	public static void arrays(int[] arrayNumbers) {	

		for (int i = 0; i < arrayNumbers.length; i++) {
			outputMessage = conditionalsTwo(arrayNumbers[i], arrayNumbers[++i]);
			System.out.println(outputMessage);
		}
	}

	public static void printArrays(int[] arrayNumbers) {	

		System.out.print("The array numbers are: ");

		for (int i : arrayNumbers) {
			System.out.print(i + " ");
		}

		System.out.println();

	}

	public static void iterationTwo(int[] arrayOfInts) {	


		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = i; 
		}
		
		printArrays(arrayOfInts);
		
		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfInts[i] = i * 10; 
		}
		
		printArrays(arrayOfInts);

	}

}
