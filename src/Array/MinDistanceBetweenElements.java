package Array;

public class MinDistanceBetweenElements {

	
	/*
	 * 
	 * Find minimum distance between two elements
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {1,2};
		
		int a = 1, b = 2;
		
		int count = 0;
		boolean isStarted = false;
		for(int i = 0;i < arr.length; i++)
		{
			if(arr[i] == a)
				
			{
				isStarted = true;
			}
			else if(arr[i] == b)
			{
				isStarted = false;
			}
			if(isStarted)
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
}
