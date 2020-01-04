package Algorithms;

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
		for(int i =0;i < n-1; i++)
		{
			if(array[i+1] != array[i] + 1)
			{
				return array[i] + 1;
			}
		}
		
		return -1;
		
		
		
	}
	
	

}
