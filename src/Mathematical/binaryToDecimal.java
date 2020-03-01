package Mathematical;

public class binaryToDecimal {
	
	
	public static void main(String[] args)
	{
		int binary = 1001001;
		int lastDigit;
		int result = 0;
		int base = 1;
		
		
		while(binary > 0)
		{
			lastDigit = binary % 10;
			
			result += lastDigit * base;
			base = base*2;
			binary = binary / 10;
		}
		
		System.out.println(result);
		
	}
	

}
