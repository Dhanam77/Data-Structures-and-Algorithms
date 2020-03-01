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
		
		int maxDifference = 0;

		
		
		
		for(int i = 0;i < arr.length; i++)
			
		{
			int j = i+1;
			int k = 0;
			while(j < arr.length && arr[i] <= arr[j])
			{
				k++;
				j++;
			}
			
			if(k > maxDifference)
			{
				maxDifference = k;
			}
		}
		
		
		
		return maxDifference;
		
		
		
		
		
	}

}
	