package Mathematical;

import java.util.*;

public class jumpingNumbers {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int  i = 0;i <= n; i++)
		{
			if(isJumpingNumber(i, n))
			{
				
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isJumpingNumber(int i, int n)
	{
		if(i <= 10)
		{
			return true;
		}
		
		else if( i >= 11 && i <=99)
		{
			int d2 = i% 10;
			int d1 = i/10;
			
			if(d1 == d2)
			{
				return false;
			}
			else if(++d1 == d2 || --d1 == d2 || ++d2 == d1 ||--d2 == d1 )
				
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

}
