package Matrix;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeMatrix {
	
	
	/*
	 * Alphabetically order the rows and check if columns are in alphabetical order
	 */
	
	public static void main(String[] args)
	{
		String[][] arr = {{"a","b","c"},
				{"a","d","e"},
				{"e","f","g"}};
		
		System.out.println(checkCondition(arr));
		
	}
	
	
	
	public static String checkCondition(int[][] arr)
	{
		int[] check = new int[arr.length];
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = 0;j < arr.length; j++)
			{
				check[j] = arr[i][j];
			}
			
			solve(check, i);
		}
		
		
		
	}
	
	public static int[][] solve(int[] check, int i)
	{
		int[][] arr = new int[check.length][check.length];
		Arrays.sort(check);
		
		for(int j = 0;i < check.length; i++)
		{
			arr[i][j] = check[i];
		}
		
		return arr;
		
		
		
	}
	

}


class checker implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}
