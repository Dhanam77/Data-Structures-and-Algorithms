package Array;

public class MaxSubArray {
	
	/*
	 * 
	 * 
	 * Find max subArray 
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {1,3,4,-2,1,5,6,-1,3};
		
		int[] count = new int[arr.length];
		int j = 0;
		for(int i = 0;i < arr.length; i++)
		{
			
			if(arr[i] < 0)
			{
				j++;
				continue;
			}
			count[j] += arr[i];
			
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0;i < count.length; i++)
		{
			if(count[i] > max)
			{
				max = count[i];
			}
		}
		
		System.out.print(max);
		
	}

}
