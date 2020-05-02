package Strings;

public class DifferentAdjacentCharacters {
	
	
	/* 
	 * 
	 * Manipulate string such as no adjacent characters are same 
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		String s = "aabbc";
		
		
		System.out.println(manipulateString(s));
		
		
		 
	}
	
	public static String manipulateString(String s)
	{
		
		char[] arr = s.toCharArray();
		
		int j = 0;
		for(int i = 0;i < arr.length - 1; i++)
		{
			
				if(arr[i] == arr[i+1])
				{
					j = i++;
					
					while(arr[i] == arr[j] && j != arr.length - 1)
					{
						j++;
					}
					
					if(j == arr.length - 1)
					{
						return "";
					}
					
					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
					
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