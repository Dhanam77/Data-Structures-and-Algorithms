package Strings;

public class AnagramPalindrome {
	
	/*
	 * 
	 * Check  if a string can be arranged to form a palindrome
	 * 
	 * TC - O(n);
	 */
	
	public static void main(String[] args)
	{
		String s = "abcdoooeeabcde";
		final int chars = 256;
		
		int[] count = new int[chars];
		
		for(int i = 0;i < s.length(); i++)
		{
			count[(int)s.charAt(i)]++;
		}
		
	
		//find odd char
		
		int odd = 0;
		for(int i = 0;i < chars; i++)
		{
			if(count[i] % 2 == 1) // odd
			{
				odd++;
			}
		}
		
		if(odd > 1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.print("Yes");
			
		}
		
	}
}
