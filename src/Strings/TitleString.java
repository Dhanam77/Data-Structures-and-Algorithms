package Strings;

public class TitleString {
	
	/*
	 * 
	 * Capitalize first letter of the string 
	 * 
	 * TcC - O(n)
	 * 
	 * */
	
	
	public static void main(String[] args)
	{
		
		
		String s = "hello dear i am dhanam";
		
		System.out.print(capitalizeString(s));
		
		
		
		
	}
	
	public static String capitalizeString(String s)
	{
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++)
		{
			boolean isFirst = false;
			if(i == 0 || arr[i-1] == ' ')
			{
				isFirst = true;
			}
			
			if(isFirst)
			{
				arr[i] = Character.toUpperCase(arr[i]);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i < arr.length; i++)
		{
			sb.append(arr[i]);
		}
		return sb.toString();
		
	}

}
