package Searching;

public class MaxFloor {
	
	/*
	 * 
	 * Find max element less than or equal to given val
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
		int arr[] = {7,1,2,5,8,10};
		int val = 0;
		System.out.print(findFloor(arr, val));
	}
	
	public static int findFloor(int[] arr, int val)
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i < arr.length; i++)
		{
			if(arr[i] > max && arr[i] <= val)
			{
				max = arr[i];
			}
		}
		
		if(max == Integer.MIN_VALUE)
		{
			return -1;
		}
		
		return max;
	}

}
