import java.util.HashSet;
import java.util.Scanner;

public class Calc 
{
	HashSet<String> combinations = new HashSet<String>();
	Scanner userInput = new Scanner(System.in);
	
	public void run()
	{
		input();
		
		if(combinations.size() == 0) combinations.add("No Valid Combinations Were Found");
		
		for(String s : combinations)
		{
			System.out.println(s);
		}
	}
	
	private boolean input()
	{
		System.out.println("Please Enter Numbers At Least Three Numbers In The Format: Number, Number, Number");
		
		if(userInput.hasNext())
		{
			if(userInput.hasNextLine())
			{
				String line = userInput.nextLine();
				
				String[] numberString = line.split(",");
				int inputSize = numberString.length;
				
				if(inputSize < 3)
				{
					System.out.println("Sorry Not Enough Numbers Where Entered, Please Try Again \n");
					return input();
				}
				
				int[] numbers = new int[inputSize];
				
				for(int i =0; i < inputSize; i++)
				{
					numbers[i] = Integer.parseInt(numberString[i]);
				}
				
				System.out.println("For A Specfic Operation, Enter Either: add, subtract, multiply or divide, Or Simply Enter Anything else For All");
				
				String operatorChosen = userInput.nextLine();
	
				calcLargeSet(numbers, operatorChosen);
			}
		}
		
		return true;
	}
	
	private void calcLargeSet(int[] listNumbers, String operatorChosen)
	{
		int first = 0;
		int second = 0; 
		int third = 0;
		
		for(int i = 0; i < listNumbers.length; i++)
		{
			first = listNumbers[i];
			
			if(i+1 >= listNumbers.length) break;
				
			for(int u = i+1; u < listNumbers.length; u++)
			{
				second = listNumbers[u];
				
				if(u+1 >= listNumbers.length) break;
				
				for(int j = u+1; j < listNumbers.length; j++)
				{
					third = listNumbers[j];
					
					if(operatorChosen.equals("add"))
					{
						add(first, second, third);
					}
					else if(operatorChosen.equals("subtract"))
					{
						subtract(first, second, third);
					}
					else if(operatorChosen.equals("multiply"))
					{
						multiply(first, second, third);
					}
					else if(operatorChosen.equals("divide"))
					{
						divide(first, second, third);
					}
					else
					{
						add(first, second, third);
						subtract(first, second, third);
						multiply(first, second, third);
						divide(first, second, third);
					}
				}
			}
		}
	}
	
	private void add(int firstNumber, int secondNumber, int thirdNumber)
	{		
		 if (firstNumber + secondNumber == thirdNumber) 
		 {		 
			 combinations.add(firstNumber + " + " + secondNumber + " = " + thirdNumber);
		 }
		 
		 if (firstNumber + thirdNumber == secondNumber) 
		 {		 
			 combinations.add(firstNumber + " + " + thirdNumber + " = " + secondNumber);
		 }

		 if (secondNumber + thirdNumber == firstNumber) 
		 {		 
			 combinations.add(thirdNumber + " + " + secondNumber + " = " + firstNumber);
		 }
	}
	
	private void subtract(int firstNumber, int secondNumber, int thirdNumber)
	{		
		 if (firstNumber - secondNumber == thirdNumber) 
		 {		 
			 combinations.add(firstNumber + " - " + secondNumber + " = " + thirdNumber);
		 }	 
		 if (secondNumber - firstNumber == thirdNumber) 
		 {		 
			 combinations.add(secondNumber + " - " + firstNumber + " = " + thirdNumber);
		 }	 
		 if (firstNumber - thirdNumber == secondNumber) 
		 {		 
			 combinations.add(firstNumber + " - " + thirdNumber + " = " + secondNumber);
		 }
		 if (thirdNumber - firstNumber == secondNumber) 
		 {		 
			 combinations.add(thirdNumber + " - " + firstNumber + " = " + secondNumber);
		 }
		 if (secondNumber - thirdNumber == firstNumber) 
		 {		 
			 combinations.add(secondNumber + " - " + thirdNumber + " = " + firstNumber);
		 }
		 if (thirdNumber - secondNumber == firstNumber) 
		 {		 
			 combinations.add(thirdNumber + " - " + secondNumber + " = " + firstNumber);
		 }
	}
	
	private void divide(int firstNumber, int secondNumber, int thirdNumber)
	{			
		 if (firstNumber / (float)secondNumber == thirdNumber) 
		 {		 
			 combinations.add(firstNumber + " / " + secondNumber + " = " + thirdNumber);
		 }
		  
		 if (secondNumber / (float)firstNumber == thirdNumber)
		 {
			 combinations.add(secondNumber + " / " + firstNumber + " = " + thirdNumber);
		 }

		 if (firstNumber / (float)thirdNumber == secondNumber) 
		 {		 
			 combinations.add(firstNumber + " / " + thirdNumber + " = " + secondNumber);
		 }
		  
		 if (thirdNumber /  (float)firstNumber == secondNumber) 
		 {		 
			 combinations.add(thirdNumber + " / " + firstNumber + " = " + secondNumber);
		 }
		  
		 if (secondNumber / (float)thirdNumber == firstNumber) 
		 {		 
			 combinations.add(secondNumber + " / " + thirdNumber + " = " + firstNumber);
		 }
		  
		 if (thirdNumber / (float)secondNumber == firstNumber) 
		 {		 
			 combinations.add(thirdNumber + " / " + secondNumber + " = " + firstNumber);
		 }
	}
	
	private void multiply(int firstNumber, int secondNumber, int thirdNumber)
	{	
		 if (firstNumber * secondNumber == thirdNumber) 
		 {		 
			 combinations.add(firstNumber + " * " + secondNumber + " = " + thirdNumber);
		 }
		 if (firstNumber * thirdNumber == secondNumber) 
		 {		 
			 combinations.add(firstNumber + " * " + thirdNumber + " = " + secondNumber);
		 }
		 if (secondNumber * thirdNumber == firstNumber) 
		 {		 
			 combinations.add(thirdNumber + " * " + secondNumber + " = " + firstNumber);
		 }
	}
}
