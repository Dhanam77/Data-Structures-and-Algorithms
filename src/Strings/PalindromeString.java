package Strings;

public class PalindromeString {
	
	/*
	 * 
	 * 
	 * Palindrome String using stringbuilder
	 * 
	 * another method - convert string to char array
	 * 					create another array with reverse characters
	 * 					compare arrays
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		
		String s = "abba";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < s.length(); i++)
		{
			sb.append(s.charAt(i));
		}
		
		
		String s1 = sb.reverse().toString();
		
		if(s1.equals(s))
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");

		}
		
		
	}

}
