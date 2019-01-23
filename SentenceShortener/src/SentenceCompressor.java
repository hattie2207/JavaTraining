import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceCompressor {
	public void run() {
		stringCompressor("Deep episodes of Deep Space Nine came on the television only after the news.");
		System.out.print("\n");
		stringCompressor("Digital alarm clocks scare area children.");
	}

	public String stringCompressor(String sentence) {

		sentence = sentence.replaceAll("\\s", "%");
		String[] ary = sentence.split("");
		List<String> list = new ArrayList<String>(Arrays.asList(ary));
		int firstIndex = 0;
		int secondIndex = 0;
		int thirdIndex = 0;
		int  fourthIndex = 0;
		int modulusLocation = -1;
		
		for (int i = 0; i < list.size(); i++) 
		{
			if(i < list.size() - 3) 
			{	
				firstIndex = i;
				secondIndex = i + 1;
				thirdIndex = i + 2;
				fourthIndex = i + 3;
						
				if(list.get(firstIndex).equals("%"))
				{
					modulusLocation = firstIndex;
					firstIndex++;
					secondIndex++;
					thirdIndex++;
					fourthIndex++;
				}
				
				if (list.get(secondIndex).equals("%"))
				{
					modulusLocation = secondIndex;
					secondIndex++;
					thirdIndex++;
					fourthIndex++;
				}		
				
				if(list.get(thirdIndex).equals("%"))
				{
					modulusLocation = thirdIndex;
					thirdIndex++;
					fourthIndex++;
				}
					
				if(list.get(fourthIndex).equals("%"))
				{
					modulusLocation = fourthIndex;
					fourthIndex++;
				}
		
				
				if ((list.get(firstIndex) + list.get(secondIndex)).equals(list.get(thirdIndex) + list.get(fourthIndex)))
				{
					list.remove(modulusLocation);
					list.remove(i + 3);
					list.remove(i + 2);
				}
			}
		}
		
		String outputMessage = "";
		for(int i = 0; i < list.size(); i++)
		{
			outputMessage += list.get(i);
		}
		
		outputMessage = outputMessage.replaceAll("%", " ");
		System.out.print(outputMessage);

		return null;
	}

}
