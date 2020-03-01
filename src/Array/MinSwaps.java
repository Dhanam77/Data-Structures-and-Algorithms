package Array;

public class MinSwaps {
	
	
	/*
	 * 
	 * Min Swaps required to sort in ascending order
	 */
	
	
	public static void main(String[] args)
	{
		
		
		int[] arr = {7,1,3,2,4,5,6};
		
		
		System.out.print(findMinSwaps(arr));
		
		
		
	}
	
	
	
	static int findMinSwaps(int[] arr)
	{
		
		
		final int n = arr.length;
		int a, b;
		int count = 0;
		
		for(int j =0;j < n-1; j++)
			
		{
			int i = 1;

			if(arr[i] < arr[i-1])
			{
				a = i-1;
				i++;
				while(arr[i-1] < arr[i])
				{
					i++;
				}
				b = i;
				count++;
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
				
				
				
				
			}	
		}
		
		return count;
			
		
			
			
			
			
		
		
		
		
	}

}
