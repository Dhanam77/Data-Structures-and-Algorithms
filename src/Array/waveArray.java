package Array;

import java.util.Arrays;

public class waveArray {
	
	
	/*
	 * 
	 * Manipulate the array to form wave array
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
        int arr[] = {10, 90, 49, 2, 1, 5, 23}; 
		
		sortInWave(arr);
		
		
	}
	
	
	
	public static void sortInWave(int[] arr)
	{
		
		Arrays.sort(arr);
		
		for(int i = 0;i < arr.length-1; i+= 2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		
	}
	

}
