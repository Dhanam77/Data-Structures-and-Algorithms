package Array;

import java.util.*;

public class ArrayManipulation {
	
	/*
	 * 
	 * Find min element, subtract it from remaining elements
	 * and remove it from list
	 *  
	 */ 
	
	public static void main(String[] args)
	{
		int[] arr = {7,9,5, 8, 13,3};
		Arrays.sort(arr);		//1, 2, 3, 4, 5
		result(arr);
	}
	
	public static void result(int[] arr)
	{
		for(int i = 0;i < arr.length; i++)
		{
			int min = arr[i];

			for(int j = i+1;j < arr.length; j++)
			{
				arr[j] -= min;
			}
			print(arr, i);
		}
		
	}
	
	public static void print(int[] arr, int low)
	{
		for(int i = low+1; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}
