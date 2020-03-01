package Strings;

public class SameChar {

	
	public static void main(String[] args)
	{
		
		String s = "xxxoxooo";
		
		
		
		
		System.out.print(find(s));
		
		
		
	}
	
	
	static boolean find(String s)
	
	{
		
		final int n = s.length();
		
		if(n % 2 == 1)
		{
			return false;
		}
		
		int countO = 0;
		int countX = 0;
		for(int i = 0;i < n; i++)
		{
			if(s.charAt(i) == 'x' || s.charAt(i) == 'X')
			{
				countX++;
			}
			else if(s.charAt(i) == 'o' || s.charAt(i) == 'O')
			{
				countO++;
			}
			
		}
		
		return countO == countX;
	}
	
}
