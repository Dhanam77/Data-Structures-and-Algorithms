package Mathematical;

public class reverseDigits {
	
	public static void main(String[] args)
	{
		int a = 123455568;
		int base = 1;
		int digit, result = 0;
		while(a > 0)
		{
			result *= 10;
			digit = a % 10;
			result += digit;
			
			
			
			a = a/10;
		}
		
		System.out.print(result);
		
	}

}
