package Array;

public class shiftZeros {
	
	/*
	 * 
	 * Shift all zeros to end of array
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {1,0,3,5,0,7};
		
		int j = 0, k = 0;
		while(k < arr.length && j < arr.length)
		{
			
	
			while(arr[j] != 0)
			{
				j++;

			}
			
			k = j+1;
			
		
			while(arr[k] == 0)
			{
				k++;

			}
			
			int temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
		}
		
	}

}