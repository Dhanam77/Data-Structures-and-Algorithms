package Sorting;

public class QuickSort {
	
	
	/*
	 * 
	 * Sort an array using quickSort
	 * 
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {5,9,2,6,2,3};
		
		quickSort(arr,0, arr.length-1);
		print(arr);
		
	}
	
	public static void print(int[] arr)
	{
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void quickSort(int[] arr, int low, int high)
	{
		
		if(low < high)
		{
			
			int pivot = partition(arr, low, high);
			
			
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
			
			
		}
	
		
	
		
		
	}
	
	public static int partition(int[] arr, int low, int high)
	{
		
		int pivot = arr[low];
		
		int i = low - 1, j = high + 1;
		
		while(i < j)
		{
			do
			{
				i++;
			}
			while(arr[i] <= pivot);
			
			do
			{
				j--;
			}
			while(arr[j] > pivot);
			
			if(i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			
		}
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j] = temp;
		return j;
	
	}
	
	
}
