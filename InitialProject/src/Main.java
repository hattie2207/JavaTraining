
public class Main {

	public static void main(String[] args) {
		
		int firstNumber = 11;
		int secondNumber = 10;
		boolean condition = true; 
		int loopNumber = 3; 
		int arrayNumbers[] = {0, 1, 2, 3, 0, 5, 6, 7, 0, 9};
		int arrayOfInts[] = new int[10];		
		String outputMessage = "";
		
		//Level 1
		
//		outputMessage = Calculator.conditionalsOne(firstNumber, secondNumber, condition);
//		outputMessage = Calculator.conditionalsTwo(firstNumber, secondNumber);				
//		Calculator.iteration(firstNumber, secondNumber, loopNumber);	
//		Calculator.arrays(arrayNumbers);	
//		Calculator.printArrays(arrayNumbers);
//		Calculator.iterationTwo(arrayOfInts);	
		
		//Level 2
		
		outputMessage = LevelTwo.blackJack(firstNumber, secondNumber);		
		
		
		/*Calculator calc = new Calculator();				
		total = calc.subtract(firstNumber, secondNumber);		
		outputMessage = "The subtraction of " + firstNumber + " and " + secondNumber + " is: " + total;	
		System.out.println(outputMessage);*/
		
		System.out.println(outputMessage);
	
	}

}
