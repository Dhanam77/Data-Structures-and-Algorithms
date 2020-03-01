package DynamicProgramming;

public class Fibonacci {
	
	
	/*
	 * 
	 * Find the nth fibonacci number using dp
	 * 
	 * 
	 */
	
	public static int[] memo = new int[101];
	
	public static void main(String[] args)
	{
		
		
		int n = 20;
		
		System.out.println(findFibonacci(n));
		
		
		
	}

	
	public static int findFibonacci(int n)
	{
		if(memo[n] != 0)
		{
			return memo[n];
		}
		else if(n == 1 || n == 0)
		{
			return n;
		}
		else
		{
			memo[n] = findFibonacci(n-1) + findFibonacci(n-2);
			return memo[n];
		}
				
	}
	
	
}
