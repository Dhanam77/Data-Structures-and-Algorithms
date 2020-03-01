package Sorting;

public class SelectionSort {
	
	/*
	 * 
	 * Sort an array using selection sort
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,5,6,2,3};
		
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] arr)
	{
		
		for(int i = 0;i < arr.length; i++)
		{
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					int temp = arr[minIndex];
					arr[minIndex] = arr[j];
					arr[j] = temp;				}
			}
				

		}
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
			

			
	}
}
