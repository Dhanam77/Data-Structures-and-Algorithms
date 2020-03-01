package Greedy;

public class LargestNumberWithGivenSum {
	
	
	/*
	 * 
	 * Find the largest number with given number of digits and sum of digits
	 * 
	 * Since we have to find max, we use greedy
	 */
	
	public static final int MAX_DIGIT = 9;
	static int sum = 0;
	
	public static void main(String[] args)
	{
		int numOfDigits = 5;
		int sum = 12;
		
		findPassword(numOfDigits, sum);
		
	}
	
	public static void findPassword(int N, int S)
	{
		int[] result = new int[N];
		for(int i = 0;i < N; i++)
		{
			if(S >= MAX_DIGIT)
			{
				result[i] = MAX_DIGIT;
				S -= MAX_DIGIT;
			}
			else
			{
				result[i] = S;
				S = 0;
			}
		}
		
		for(int i = 0;i < N; i++)
		{
			System.out.print(result[i]);
		}
		
		
		
	}
	
	

}
