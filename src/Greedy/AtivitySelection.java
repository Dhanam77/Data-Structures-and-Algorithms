package Greedy;

import java.util.*;

public class AtivitySelection {
	
	
	/*
	 * 
	 * Select the maximum no of activities possible 
	 * 
	 * We use greedy as we have to get optimal soln 
	 */
	
	public static void main(String[] args)
	{
		int[] startTime = {1,3,2,5,8,5};
		int[] endTime = {2,4,6,7,9,9};
		
		System.out.print(getMaxActivities(startTime, endTime));
		
		
	}
	
	public static int getMaxActivities(int[] startTime, int[] endTime)
	{
		Arrays.sort(endTime);
		
		int count = 1;
		int j = 0;
		for(int i = 1; i < startTime.length; i++)
		{
			if(startTime[i] > endTime[j])
			{
				count++;
				j=i;
			}
		}
		
		
		return count;
	}

}
