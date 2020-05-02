package Strings;

public class MergeTwoString {
	
	/*
	 * 
	 * Merge two strings alternatively
	 * 
	 */
	
	
	public static void main(String[] args)
	{
		String a = "abcdl";
		String b = "cdefeee";
		
		System.out.print(merge(a,b));
	}
	
	
	public static String merge(String a, String b) 
	{
		StringBuilder sb = new StringBuilder();
		int i = 0, j = 0;
		for(int k = 0;k < a.length() + b.length(); k++)
		{
			if(k % 2 == 0)
			{
				if(i != a.length())
				{
				sb.append(a.charAt(i));
				i++;
				}
				else
				{
					sb.append(b.charAt(j));
					j++;
				}
			}
			else
			{
				if(j != b.length())
				{
					sb.append(b.charAt(j));
					j++;
				}
				else
				{
				sb.append(a.charAt(i));
				i++;
			}}
		}
		
		return sb.toString();
		
		
	}

}
