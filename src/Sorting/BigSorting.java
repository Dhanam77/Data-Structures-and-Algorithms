package Sorting;

import java.util.*;;

public class BigSorting {
	
	
	/*
	 * 
	 * 
	 * Sort very big numbers 
	 * 
	 */
	
	public static void main(String[] args)
	{
		
		String[] arr = {"5","4","7","455555555555555555555555555554444","333333333333333333333333333333333333333333333333333333333333333333333333","111111111111111111111111111111111111111111111111111111111111111111122"};
		
		Arrays.sort(arr, new sorter());
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}


class sorter implements Comparator<String>
{

	@Override
	public int compare(String x, String y) {
		// TODO Auto-generated method stub
		
		if(x.length() != y.length())
		{
			return x.length() - y.length();		//returns -1 if x is shorter, 1 if x is longer
		}
		
		for(int i = 0;i < x.length(); i++)
		{
			int result =  x.charAt(i) - y.charAt(i);
			if(result != 0)
			{
				return result;
			}
		}
		
		
		return 0;
	}
	
}
