package Array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BetweenTwoSets {
	
	
	/*
	 * 
	 * Find numbers that has factors in first array and which are themselves factors for all elements
	 * in second array 
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		int[] a = {2,4};
		
		int[] b = {16, 32, 96};
		
		
		getNumbers(a,b);
		
		
	}
	
	
	static void getNumbers(int[] a, int[] b)
	{
		
		
		int first = a[a.length - 1];
		int last = b[0];
		
		for(int i = first; i <= last; i++)
		{
			boolean isValid = true;

			for(int j = 0;j < a.length; j++)
			{
				if(i % a[j] != 0)
				{
					isValid = false;
					break;
				}
			}
			
			for(int j = 0;j < b.length; j++)
			{
				if(b[j] % i != 0)
				{
					isValid = false;
					break;
				}
			}
			
			

			
			if(isValid)
			{
				System.out.print(i + " ");

			}
		}
		
		
		
		
		
		
		
	}

}
