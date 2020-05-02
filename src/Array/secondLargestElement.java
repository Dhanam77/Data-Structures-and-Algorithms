package Array;


import java.util.*;

public class secondLargestElement {
	
	
	/*
	 * 
	 *Second Largest element in an array
	 * Edge case - multiple same large elements
	 *  
	 *  
	 *  TC - O(n);
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		int[] arr = {3,7,2,16,16,17,13};
		int n = arr.length;
		
		Arrays.sort(arr);
		
		
		
		for(int i = n-2; i >= 0; i--)
		{
			if(arr[i] != arr[i+1])
			{
				System.out.println(arr[i]);
				break;
			}
		}
		
		
	//	System.out.println(arr[n-2]);
		
		
	}

}
