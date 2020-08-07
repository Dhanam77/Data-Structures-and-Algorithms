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
		int[] arr = {5,9,7,6,2,3};
		
		quicksort(arr,0, arr.length-1);
		print(arr);
		
	}
	
	
	public static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotPosition = partition(arr, low, high);
			quicksort(arr,low,pivotPosition-1);
			quicksort(arr,pivotPosition+1,high);
		}
	}


	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		/*
		 * 5,9,7,6,2,3
		 */
		int pivot = arr[high];
		int left = low, right = high-1;
		while(true) {
			while(arr[left] < pivot) {
				left++;
			}
			while(arr[right] > pivot) {
				right--;
			}
			if(left >= right) {
				break;
			}
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		int temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;
		return left;
	}
	
	
	public static void print(int[] arr) 
	{
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	/*
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low < high)
		{			
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);	
		}	
		
	}
	
	public static int partition(int[] arr, int low, int high) {
		//Last element as pivot
		int pivot = arr[high];
		int i = low-1, j;
		for(j = low;j < high; j++)
		{
			if(arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}
	*/
	
}
