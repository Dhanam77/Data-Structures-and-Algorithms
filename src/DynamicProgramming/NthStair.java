package DynamicProgramming;

public class NthStair {
	
	/*
	 * 
	 * Find no  of ways to reach Nth stair
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
		int n = 5;
		
		System.out.println(findWays(n));
		
		 
	}
	
	
	static int findWays(int n)
	{
		int[] memo = new int[1000];
		if(n <= 1)
		{
			return n;
		}
		
		if(memo[n] != 0)
		{
			return memo[n];
		}
		
		memo[n] =  findWays(n-1) + findWays(n-2);
		return memo[n];
		
		
	}
}
