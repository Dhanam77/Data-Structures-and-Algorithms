package DynamicProgramming;

public class LongestPalindromicString {
	
	
	public static void main(String[] args)
	
	{
		
		
		String s = "ABCACDBA";
		
		char[] arr = s.toCharArray();
		
		System.out.println(LPS(arr, 0, arr.length - 1));
		
		
		
	}

	private static int LPS(char[] arr, int n, int m) {
		// TODO Auto-generated method  stub
		
		
		int[][] dp = new int[m+1][m+1];
		
		if(n > m)
		{
			return 0;
		}
		
		if(n == m)
		{
			return 1;
		}

		
			
			if(arr[n] == arr[m])
			{
				return LPS(arr,n+1, m-1) + 2;
			}
			
		
		
		return Integer.max(LPS(arr,n,m-1), LPS(arr,n+1,m));
		
		
		
		
		
	}
	
	

}
