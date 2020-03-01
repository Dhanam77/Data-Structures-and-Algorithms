package Greedy;

import java.util.*;

public class MinimumCoinExchange {
	
	static int[] denominations = { 1, 2, 5, 10, 20, 50, 100, 500, 1000};
	static int count = 0, i = 0;
	static int[] reqd = new int[denominations.length];

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value: ");
		
		int val = sc.nextInt();
		
		
		
		System.out.println("Min coins reqd are: " + getCoinsCount(val));
		System.out.print("Denominations are: ");

		
		for(int i : reqd)
		{
			if(i != 0)
			{

			System.out.print(i + " ");
			}
		}
		
		
	}
	
	
	public static int getCoinsCount(int val)
	{
	
		
		int max = denominations[0];
		
		if(!(val < 1))
		{
			for(int i : denominations)
			{
				if(i > max && i <= val)
				{
					max = i;
				}
			}
			val -= max;
			reqd[i++] = max;
			count++;
			getCoinsCount(val);
		}
		
		
		return count;
			
	}
}
