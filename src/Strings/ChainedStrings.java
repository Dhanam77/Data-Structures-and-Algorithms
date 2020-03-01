package Strings;

public class ChainedStrings {
	
	
	/*Check if all the strings in an array can be joined to be formed 
	 * a circle of strings
	 */
	
	
	
	
	public static void main(String[] args)
	{
		
		String[] arr = {"My", "MYam", "Men"};
		
		
		System.out.println(res(arr));
		
		
	}
	
	
	static boolean res(String[] arr)
	{
		
		for(int i = 1;i < arr.length; i++)
		{
			int n = arr[i-1].length();
			
			if(!arr[i].toLowerCase().startsWith(String.valueOf(arr[i-1].charAt(n-1))))
			{
				
				return false;
			}
			
			
		}
		
		return true;
		
		
	}
	

}
