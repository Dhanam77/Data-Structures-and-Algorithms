package Searching;

public class FacingTheSun {
	/*
	 * 
	 * 
	 * Count number of buildings getting sunrise
	 * 
	 * TC - O(n);
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {7, 4 ,8, 2, 9};
		
		
		System.out.println(countNumberOfbuildings(arr));
		
		
	}
	
	public static int countNumberOfbuildings(int[] arr)
	
	{
		
		int min = arr[0];
		int count = 1;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > min)
			{
				count++;
				min = arr[i];
			}
		}
		
		return count;
		
	}
	
	
	
	

}
