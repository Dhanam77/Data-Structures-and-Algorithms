package DynamicProgramming;

public class WaysToFormN {
	
	
	
	
	public static void main(String[] args)
	{
		
		
		int N = 6;
		
		System.out.print(ways(N));
		
	}
	
	public static int ways(int N)
	{
		int[] memo = new int[100];
		
		if(memo[N] != 0)
		{
			return memo[N];
		}
		
		  if (N < 0)   
		  {
			  return 0; 
		  }
		      
		  if (N == 0)  
		  {return 1; 
			  
		  
		  }
			  
	}l
	
	

}
