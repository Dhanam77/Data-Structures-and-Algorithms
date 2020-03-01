package DynamicProgramming;

public class LongestCommonSubsequence {
	
	public static void main(String[] args)
	
	{
		
		
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		
		int m = s1.length();
		int n = s2.length();
		
		
		System.out.println(find(s1, s2, m,n));
		
		
	}
	
	
	static int find(String s1, String s2, int m, int n)
	{
		
		if(m==0 || n == 0)
		{
			return 0;
		}
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
		{
			return find(s1,s2,m-1,n-1) + 1;
		}
		else
		{
			return Math.max(find(s1,s2,m-1,n),find(s1,s2,m,n-1));
		}
		
		
		
		
	}

}
