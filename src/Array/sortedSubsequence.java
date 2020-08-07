package Array;

public class sortedSubsequence {

	
	/*
	 * 
	 * Find no of sorted subsequence such that
	 * a < b < c
	 */

	public static void main(String[] args)
	{
		int[] arr = {1,2,1,1,3};
		
		
		int count = 0;
		
		for(int i = 0;i < arr.length; i++)
		{
			boolean hasLower = false, hasUpper = false;
			
			for(int j = 0;j < arr.length; j++)
			{
				if(j == i)
				{
					continue;
				}
				else
				{
					if(arr[j] > arr[i])
					{
						hasUpper = true;
						
					}
					else if(arr[j] < arr[i])
					{
						hasLower = true;
						 
					}
				}
			}
			
			if(hasLower && hasUpper)
			{
				count++;
			}
			
		}
		
		System.out.println(count);
	}

}

 