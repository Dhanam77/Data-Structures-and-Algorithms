
public class pattern {
	
	public static void main(String[] args)
	{
		
		/*
		 * 
		 *
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 
		 */
		
		
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1;j <= i; j++)
			{
				System.out.print(i);
			}
			for(int k = 5 - i; k >= 0; k--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
	}

}
