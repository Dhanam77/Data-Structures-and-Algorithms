package Mathematical;

public class primeCheck {
	
	/*
	 * 
	 * Check whether number is prime or not
	 */
	
	public static void main(String[] args)
	{
		
		int n = 5;
		boolean bool = false;
		
		if(n == 1 || n == 2)
		{
			bool = true;

		}
		else if(n % 2 == 0)
		{
			bool = false;
		}
		
		else
		{
			for(int i = 3;i <= n-1; i++)
			{
				if(n % i == 0)
				{
					bool = false;
					
				}
				
			}
		}
		
	}

}
