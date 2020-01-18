package Strings;



import java.util.*;
public class SortingString {
	
	
	/*
	 * 
	 * Sort the string in lexicological decreasing order
	 * 
	 * Tc - O(n)
	 * 
	 */
	
	public static void main(String[] args)
	{
		String myString = "geeks";
		
		System.out.print(sortString(myString));
	}
	
	
	public static String sortString(String string)
	{
		
		char[] c = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		Arrays.sort(c);
		
		for(int i = c.length - 1; i >= 0; i--)
		{
			sb.append(c[i]);
		}
		
		return sb.toString();
	}

}
