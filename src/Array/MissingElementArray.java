package Array;

import java.util.Scanner;

public class MissingElementArray {
	
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		int n = sc.nextInt();
		
		
		int[] array = new int[n];
		
		for(int i =0;i < n; i++)
		{
			System.out.println("Enter element");
			array[i] = sc.nextInt();
			
			
		}
		
		
		System.out.println(FindMissing(array));
		
		
		
		
	}
	
	public static int FindMissing(int[] array)
	{
		int n = array.length;
		
		int sum = 0;
		
		for(int i = 0;i < array.length; i++)
		{
			sum += array[i];
		}
		
		return ((((n+1)*(n+2))/2) - sum);
		
		
		
	}
	
	

}
