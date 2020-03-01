package Array;

public class RotateArray {
	
	/*
	 * 
	 * Rotate array d times
	 */

	
	public static void main(String[] args)
	{
		int d = 2, n = 5;
		
		int[] arr = {1,2,3,4,5};
		
		
		for(int i = 0;i < d; i++)
		{
			rotateArray(arr, n);
		}
		
	}
	
	
	public static void rotateArray(int[] arr, int n)
	{
		int temp = arr[0];
		for(int i = 0;i < n-1; i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = temp;
		
		for(int i = 0;i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
	}
}
