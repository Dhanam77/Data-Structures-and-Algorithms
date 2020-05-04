package Sorting;

public class InsertionSort {
	
	
	/*
	 * 
	 * 
	 * Sort an array using InsertionSort
	 * 
	 * 
	 */

	public static void main(String[] args)
	{
		
		int[] arr = {3,1,5,7,3};
		
		insertionSort(arr);
		
	}
	
	
	public static void insertionSort(int[] arr)
	{
		
		int n = arr.length;
		for(int i = 0;i < n; i++)
		{
			for(int j = i; j> 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		

		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			
		
}
}