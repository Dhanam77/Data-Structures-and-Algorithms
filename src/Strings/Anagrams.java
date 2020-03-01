package Strings;

import java.util.Arrays;

public class Anagrams {
	
	
	/*
	 * 
	 * TO check if given two strings are anagrams!
	 * 
	 * 
	 * author - dhanam
	 */
	
	
	public static void main(String[] args)
	{
		
		String a = "listen";
		String b = "silent";
		
		boolean isAnagram = true;
		
		
		if(a.length() != b.length())
		{
			System.out.print("NO");

		}
		
		else
		{
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i = 0;i < a.length(); i++)
		{
			if(c1[i] != c2[i])
			{
				isAnagram = false;
			}
		}
		
		if(isAnagram)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("NO");
		}
		
		
	}

}}
