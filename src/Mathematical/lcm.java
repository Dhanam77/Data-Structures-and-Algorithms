package Mathematical;

public class lcm {
	
	/*
	 * 
	 *  Find LCM
	 */
	
	public static void main(String[] args)
	{
		int a = 5, b = 10;
		
		if(a%b == 0)
		{
			System.out.println(a);
		}
		
		else if( b%a == 0)
		{
			System.out.println(b);

		}
		
		else
		{
			for(int i = 2; i <= 10; i++)		//O(n)
			{
				if((a*i) % b == 0)
				{
					System.out.println(a*i);
					break;
				}
			}
		}
	}

}
