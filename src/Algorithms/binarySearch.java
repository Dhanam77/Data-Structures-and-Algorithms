package Algorithms;
import java.util.*;

public class binarySearch {
	
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter array Length");
		int val = 3;
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		ByLinearSearch(arr, val);
		
		ByBinarySearch(arr, val);
		
		
	}

	private static void ByLinearSearch(int[] arr, int val) {
		// TODO Auto-generated method stub
		
		
		/*
		 * By Linear Search
		 */
		
		long a = System.currentTimeMillis();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == val)
			{
				System.out.println("Yes");
				break;
			}
		
			
		}
		
		System.out.println("time for linear search "  + (a - System.currentTimeMillis()));

		
	}
	private static void ByBinarySearch(int[] arr, int val)
	{
		
		
		/*
		 * By Binary Search
		 */
		
		long b = System.currentTimeMillis();
		int low = 0;
		int high = arr.length - 1;
		int mid = (low+high)/2;
		
		
		Arrays.sort(arr);
		
		
		while(low < high)
		{
			
			if(arr[mid] < val)
			{
				low = mid+1;
				
			}
			
			else if(arr[mid] > val)
			{
				high = mid-1;
			}
			
			else
			{
				System.out.println("Yes");

				break;
			}
		}
		
		System.out.println("Time for binary Searh " + (b - System.currentTimeMillis()));

		
		
	
		}
	
	

}
