
public class Main {

	public static void main(String[] args) {
		
		int firstNumber = 12;
		int secondNumber = 10;
		boolean condition = true; 
		int loopNumber = 3; 
		int arrayNumbers[] = {0, 1, 2, 3, 0, 5, 6, 7, 0, 9};
		int arrayOfInts[] = new int[10];			
		
		String outputMessage = "";
		
		System.out.println("Conditionals One:");
		outputMessage = Calculator.conditionalsOne(firstNumber, secondNumber, condition);
		System.out.println(outputMessage + "\n");
		
		System.out.println("Conditionals Two:");
		outputMessage = Calculator.conditionalsTwo(firstNumber, secondNumber);
		System.out.println(outputMessage + "\n");
		
		System.out.println("Iteration:");
		Calculator.iteration(firstNumber, secondNumber, loopNumber);	
		System.out.println();
		
		System.out.println("Arrays:");
		Calculator.arrays(arrayNumbers);	
		System.out.println();
		
		System.out.println("Print Array:");
		Calculator.printArrays(arrayNumbers);
		System.out.println();
		
		System.out.println("Iteration Two:");
		Calculator.iterationTwo(arrayOfInts);	
		
		/*Calculator calc = new Calculator();				
		total = calc.subtract(firstNumber, secondNumber);		
		outputMessage = "The subtraction of " + firstNumber + " and " + secondNumber + " is: " + total;	
		System.out.println(outputMessage);*/
	
	}

}
