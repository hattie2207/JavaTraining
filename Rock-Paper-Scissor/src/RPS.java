import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RPS 
{
	private Scanner userInput = new Scanner(System.in);
	private Random aiChoice = new Random();
	private int numberofPlayerWins, numberofAiWins, numberOfDraws, rockCount, paperCount, scissorsCount, lizardCount, spockCount;
	private String mostPickedOption;
	private int gameLimit = 5;
	private float numberOfGames;
	
	public void rpsGameController()
	{
		boolean keepPlaying = true;
		
		do
		{
			if(numberOfGames < gameLimit)
			{
				rpsGame();
				if(numberOfGames != gameLimit) keepPlaying = playAgain();
			}
			else
			{
				keepPlaying = false;
			}
		}
		while(keepPlaying);
		
		endGameStats();
	}
	
	private float mostPickedPlayerOptionBetter()
	{
		Map<String, Integer> optionsMap = new HashMap<String, Integer>();
		optionsMap.put("Rock", rockCount);
		optionsMap.put("Paper", paperCount);
		optionsMap.put("Scissors", scissorsCount);
		optionsMap.put("Spock", spockCount);
		optionsMap.put("Lizard", lizardCount);
		
		Object[] arrayModeOptions = optionsMap.entrySet().toArray();
		
		Arrays.sort(arrayModeOptions, new Comparator() 
		{
		    public int compare(Object o1, Object o2) 
		    {
		        return ((Map.Entry<String, Integer>) o2).getValue()
		                   .compareTo(((Map.Entry<String, Integer>) o1).getValue());
		    }
		});
		
		if(arrayModeOptions[0].equals(0))
		{
			
		}
		
		return 0;
	}
	
	private float mostPickedPlayerOption()
	{
		float percentage = 0;
		
		if((lizardCount > paperCount) && (lizardCount > scissorsCount) && (lizardCount > rockCount) && (lizardCount > spockCount))
		{
			mostPickedOption = "Lizard";
			percentage = (lizardCount / numberOfGames) * 100;
		}
		else if((spockCount > paperCount) && (spockCount > scissorsCount) && (spockCount > rockCount) && (spockCount > lizardCount))
		{
			mostPickedOption = "Spock";
			percentage = (spockCount / numberOfGames) * 100;
		}
		else if((rockCount > paperCount) && (rockCount > scissorsCount) && (rockCount > lizardCount) && (rockCount > spockCount))
		{
			mostPickedOption = "Rock";
			percentage = (rockCount / numberOfGames) * 100;
		}
		else if((paperCount > rockCount) && (paperCount > scissorsCount) && (paperCount > lizardCount) && (paperCount > spockCount))
		{
			mostPickedOption = "Paper";
			percentage = (paperCount / numberOfGames) * 100;
		}
		else if ((rockCount == paperCount) && (rockCount == scissorsCount) && (rockCount == lizardCount) && (rockCount == spockCount))
		{
			mostPickedOption = "You Picked All Five Options Equally";
			percentage = 100;
		}
		else if((rockCount == paperCount) && (rockCount == scissorsCount) && (rockCount == lizardCount))
		{
			mostPickedOption = "You Picked Four Options Equally";
			percentage = 100;
		}
		else if((rockCount == paperCount) && (rockCount == scissorsCount))
		{
			mostPickedOption = "You Picked Three Options Equally";
			percentage = 100;
		}
		else if(rockCount == paperCount)
		{
			mostPickedOption = "Both Paper and Rock Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(rockCount == lizardCount)
		{
			mostPickedOption = "Both Lizard and Rock Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(rockCount == spockCount)
		{
			mostPickedOption = "Both Spock and Rock Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(rockCount == scissorsCount)
		{
			mostPickedOption = "Both Scissors and Rock Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((rockCount / numberOfGames) * 100)*2;
		}
		else if(paperCount == scissorsCount)
		{
			mostPickedOption = "Both Scissors and Paper Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(paperCount == lizardCount)
		{
			mostPickedOption = "Both Lizard and Paper Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(paperCount == spockCount)
		{
			mostPickedOption = "Both Spock and Paper Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(lizardCount == spockCount)
		{
			mostPickedOption = "Both Spock and Lizard Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(scissorsCount == spockCount)
		{
			mostPickedOption = "Both Spock and Scissors Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else if(lizardCount == scissorsCount)
		{
			mostPickedOption = "Both Lizard and Scissors Were Chosen Equally And Are Used More Than The Other Options";
			percentage = ((paperCount / numberOfGames) * 100)*2;
		}
		else
		{
			mostPickedOption = "Scissors";
			percentage = (scissorsCount / numberOfGames) * 100;
		}
		
		return percentage;
	}
	
	private void endGameStats()
	{
		String percentage = mostPickedPlayerOption() + "%";
		
		System.out.println("You Played A Total Of: " + numberOfGames + "!");
		System.out.println("The Computer Won: " + numberofAiWins + " Times!");
		System.out.println("You Won: " + numberofPlayerWins + " Times!");
		System.out.println("You Drew: " + numberOfDraws + " Times!");
		System.out.println("Your Most Commonly Picked Move Was: " + mostPickedOption + " By " + percentage);
		
		System.out.println("Thank You For Playing, Have A Good Day!");
	}
	
	private void rpsGame()
	{
		String playerChoice = playersMove();
		System.out.println("The Player Has Picked: " + playerChoice);
		
		String aiChoice = randResponse();
		System.out.println("The Computer Has Picked: " + aiChoice);
		
		String gameResult = roundResult(playerChoice, aiChoice);
		System.out.println(gameResult);	
	}
	
	private String playersPickedOption(String playerChoice)
	{
		switch(playerChoice)
		{
		case "Rock":
			rockCount++;
			break;
		case "Paper":
			paperCount++;
			break;
		case "Scissors":
			scissorsCount++;
			break;
		case "Lizard":
			lizardCount++;
			break;
		case "Spock":
			spockCount++;
			break;
		default:
			System.out.println("Invalid Player Choice");
			return playersMove();
		}
		return playerChoice;
	}
	
	private String playersMove()
	{
		System.out.println("Please Enter A Move, Either: Rock, Paper, Scissors, Lizard or Spock");			
		return playersPickedOption(playerInput());
	}
	
	private boolean playAgain()
	{
		String playerAnswer = "";
		System.out.println("If You Would Like To Play Again, Please Press Y, Any Other Key Will Exit");
		
		playerAnswer = playerInput();
		return playerAnswer.equals("Y") ? true: false;
	}
	
	private String playerInput()
	{	
		if(userInput.hasNext())
		{
			if(userInput.hasNextLine())
			{
				String playerChoice = userInput.nextLine();
				return playerChoice;
			}
		}

		return "Invalid Token";
	}
	
	private String roundResult(String playerChoice, String aiMove)
	{
		String result;
		numberOfGames++;
		
		if(playerChoice.equals(aiMove)) 
		{
			result = "The Player Choose: " + playerChoice + " Which Is The Same As What The Computer Picked: " + aiMove + "\n";
			result += "Draw, you can do better!";
			numberOfDraws++;
		}
		else if((playerChoice.equals("Rock") && aiMove.equals("Scissors")) || (playerChoice.equals("Paper") && aiMove.equals("Rock")) || (playerChoice.equals("Scissors") 
				&& aiMove.equals("Paper")) || (playerChoice.equals("Rock") && aiMove.equals("Lizard")) || (playerChoice.equals("Scissors") && aiMove.equals("Lizard")) 
				|| (playerChoice.equals("Paper") && aiMove.equals("Spock")) || (playerChoice.equals("Lizard") && aiMove.equals("Spock")) 
				|| (playerChoice.equals("Lizard") && aiMove.equals("Paper")) || (playerChoice.equals("Spock") && aiMove.equals("Scissors")) 
				|| (playerChoice.equals("Spock") && aiMove.equals("Rock")))
		{
			result = "The Player Choose: " + playerChoice + " Which Covers The Computers Choice of " + aiMove + "\n";
			result += "Victory, you win!";
			numberofPlayerWins++;
		}
		else
		{
			result = "The Computer Choose: " + aiMove + " Which Covers The Players Choice of " + playerChoice + "\n";
			result += "Defeat, the AI wins!";
			numberofAiWins++;
		}
		
		result+= "\n";
		return result;			
	}

	private String randResponse()
	{
		String aiMove = "";

		switch(aiChoice.nextInt(4))
		{
		case 0:
			aiMove = "Rock";
			break;
		case 1:
			aiMove = "Paper";
			break;
		case 2:
			aiMove = "Scissors";
			break;
		case 3:
			aiMove = "Lizard";
			break;
		case 4:
			aiMove = "Spock";
			break;
		default:
			aiMove = "invalid move";
			break;
		}
		
		return aiMove;
	}
}
