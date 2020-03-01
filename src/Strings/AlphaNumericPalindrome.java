package Strings;

public class AlphaNumericPalindrome {
	
	
	/*
	 * 
	 * To check if given string is palindrome
	 * 
	 */
	
	public static void main(String[] args)
	{
		String s = "ab.c.ba";
		
		System.out.println(checkPalindrome(s));
		
		
		
	}
	
	public static boolean checkPalindrome(String s)
	{
		char[] a = s.toCharArray();
		char[] b = new char[a.length];
		
		for(int i = 0;i < a.length; i++)
		{
			b[i] = a[a.length-i-1];
		}

		
		for(int i = 0;i < a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;  // arrays are different no palindrome
			}
		}
		
	
		
		return true; //palindrome
	}

}
