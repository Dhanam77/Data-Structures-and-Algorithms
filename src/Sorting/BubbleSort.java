package Sorting;

public class BubbleSort {
	
	/*
	 * 
	 * Sort an array using BubbleSort
	 * 
	 * TC - O(n^2)
	 * 
	 * 
	 * Can be optimized by checking if even 1 element is swapped
	 * if not swapped, array is already sorted so break
	 */
	
	public static void main(String[] args)
	{
		
		int[] arr = {1,2,3,7,5,6};
		
		bubbleSort(arr);
		
	}
	
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i < n-1; i++)
		{
			boolean isSwapped = false;

			for(int j = 0;j < n - 1; j++) 		// or n - i - 1
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;			//array is sorted
				}
			}
			
			if(!isSwapped)
			{
				break;
			}
		}
		
		for(int i = 0;i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public static void swap(int a, int b) 		//call by value doesnt work
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	

}
