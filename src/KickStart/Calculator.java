package KickStart;

public class Calculator {
	
	
	public static void main(String[] args)
	{
		
		
		int n = 1;
		
		
		System.out.print(getMinPresses(n));
		
		
		
	}
	
	
	static int getMinPresses(int n)
	{
		
		if(n >= 0 && n < 100 && n%2 == 0)
		{
			return 0;
		}
		
		boolean hasOdd = hasOddDigits(n);
		
		if(!hasOdd)
		{
			return 0;
		}
		
		int countAdd = 0, countSub = 0;
		
		int a = n, b = n;
		while(hasOddDigits(a++))
		{
			countAdd++;
		}
		
		while(hasOddDigits(b--))
		{
			countSub++;
		}
		
		
		return Math.min(countAdd, countSub);
		
	}
	
	static boolean hasOddDigits(int n)
	{
		
		while(n > 0)
		{
			int lastDigit = n % 10;
			if(n % 2 == 1)
			{
				return true;
			}
			
			n = n/10;
		}
		
		return false;
		
	}

}
