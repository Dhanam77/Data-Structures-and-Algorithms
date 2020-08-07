package Array;

public class MaxDifference {
	
	
	/*
	 * 
	 * 
	 * Find max difference between i and j such that arr[i] <= arr[j]
	 */
	
	
	public static void main(String[] args)
	{
		int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		
		
		System.out.println(findMaxDiff(arr));
		
	}
	
	
	static int findMaxDiff(int[] arr)
	{
		
		int maxCount = 0;

		
		
		int count,j;
		for(int i = 0;i < arr.length; i++)
			
		{
			j = i+1;
			while(j < arr.length && arr[j] > arr[i])
			{
				j++;
			}
			count = j-i;
			
			maxCount = Math.max(maxCount, count);

		}
		
		
		
		return maxCount;
		
		
		
		
		
	}
 
}
	