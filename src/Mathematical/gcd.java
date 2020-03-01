package Mathematical;

public class gcd {

	
	/*
	 * Find gcd of two numbers
	 */
	
	public static void main(String[] args)
	{
		
		int a = 48, b =18;
		
		int n = (Math.min(a,b))/2;
		
		int max = 1;
		for(int i = 2; i <= n; i++)		// O(n)
		{
			if(a%i == 0 && b%i == 0)
			{
				max = i;
			}
		}
		
		
		System.out.println(max);
		
	}
	
}
