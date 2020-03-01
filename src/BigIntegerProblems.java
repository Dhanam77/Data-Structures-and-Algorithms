import java.math.*;

public class BigIntegerProblems {
	
	
	public static void main(String[] args)

	{
		
		
		int n = 100;
		System.out.println(findFactorial(n));
		
	
		
		
		
		
		
	}
	
	static BigInteger findFactorial(int n)
	{
	
		BigInteger bi = new BigInteger("1");
		
		for(int i = 2;i <= n; i++)
		{
			
			bi = bi.multiply(BigInteger.valueOf(i));
			
			
		}
		
		return bi;
		
		
		

		
		
	}
}
