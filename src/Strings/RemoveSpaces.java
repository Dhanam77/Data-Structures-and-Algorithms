package Strings;

public class RemoveSpaces {
	
	
	
	/*
	 * 
	 * 
	 * Remove spaces from given string
	 * 
	 */
	
	public static void main(String[] args)

	{
		
		String s = "abc  d ef g h ijk";
		
		
		System.out.println(RemoveSpaces(s));
		
		
	}
	
	
	public static String RemoveSpaces(String s)
	{
		
		
		
		return s.replace(" ", "");		
		
		
		
	}
	

}
