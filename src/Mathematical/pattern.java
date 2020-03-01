package Mathematical;

public class pattern {
	
	public static void main(String[] args)
	{
		
		/*
		 * 
		 * 333222111
		 * 332211
		 * 321
		 * 
		 * 
		 * Time complexity - O(n^3)
		 * 
		 */
		for(int i = 3;i >=1; i--)
		{
			for(int j = 3; j >= 1; j--)
			{
				
				for(int k = 1;k <= i; k++)
				{
					System.out.print(j);
				}
			}
			System.out.println();
			
			
		}
	}

}
