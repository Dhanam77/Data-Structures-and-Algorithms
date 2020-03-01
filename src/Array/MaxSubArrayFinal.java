package Array;

public class MaxSubArrayFinal {
	
	
	/*
	 * 
	 * 
	 * FInd index of array which has X value
	 * 
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
		int x = 15;
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		find(arr,x);
		
		
	}
	
	static void find(int[] arr, int x)
	{
		int sum;
		for(int i = 0;i < arr.length; i++)
		{
			
			sum = 0;
			
			for(int j = i;j < arr.length; j++)
			{
				sum += arr[j];
				
				if(sum == x)
				{
					print(i,j);
					break;
				}
				else if(sum > x)
				{
					break;
				}
				
			}
			
			if(sum == x)
			{
				break;
			}
			
		}
		
		
	}
	
	static void print(int i, int j)
	{
		
		System.out.println("From " + (i+1) + " to " + (j+1));
	}

}
