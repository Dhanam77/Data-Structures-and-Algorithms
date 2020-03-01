package Greedy;

import java.util.Arrays;

public class MaxChores {
	
	public static void main(String[] args)
	{
		
		
		int mins = 6;
		int[] choreMins = {3,6,3};
		
		
		System.out.println(findMaxChores(mins, choreMins));
		
		
	}
	
	
	static int findMaxChores(int mins, int[] choreMins)
	{
		
		int maxChoreCount = 0;
		
		int total = 0;
		Arrays.sort(choreMins);
		
		int i = 0;
		while(total <= mins && i < choreMins.length)
		{
			if(total + choreMins[i] <= mins)
			{
				maxChoreCount++;
				total += choreMins[i];
				i++;
				
			}
			
			else
			{
				break;
			}
			
			
			
			
		}
		
		
		return maxChoreCount;
		
		
	}

}
