package Array;

import java.util.HashMap;

public class SubArraySum {
	
	public static void main(String[] args)
	{
		
		
		int[] arr = {10,2,-2,-20,5};
		
		int sum = -10;
	
		
		//Inefficient method using brute force with TC - O(n^2);
		findSubArray(arr, sum);
		
		findSubArrayUsingHashmap(arr, sum);
		
		
		
		
	}
	
	
	private static void findSubArrayUsingHashmap(int[] arr, int sum) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = -1;
		int curSum = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i < arr.length; i++)
		{
			
			
			
		}
		
		
		
	}


	static void findSubArray(int[] arr, int sum)
	{
	
		int end = -1;
		int start = 0;
		
		for(int i = 0;i < arr.length; i++)
		{
			int currSum = 0;
			start = i;
			for(int j = i;j < arr.length; j++)
			{
				
				currSum += arr[j];
				
				if(currSum == sum)
				{
					end = j;
					break;
				}
				
				
			}
			
			if(currSum == sum)
			{
				break;
			}
			
		}
		
		if(end == -1)
		{
			System.out.println("No subarray with given sum");
		}
		else
		{
			System.out.println("subarray found from " + start + " to " + end);

		}
		
		
		
		
	}

}
