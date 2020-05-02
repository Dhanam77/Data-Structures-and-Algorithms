package Array;

import java.util.*;

public class ArrSubsetOfAnotherArr {
	
	
	
	public static void main(String[] args)
	{
		
		
		int[] arr1 = {1,6,5};
		int[] arr2 = {1,4,7,3,5,6};
		
		
		System.out.println(isSubset(arr1,arr2));
		
		
	}
	
	
	static boolean isSubset(int[] arr1, int[] arr2)
	{
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i < arr2.length; i++)
		{
			
			map.put(arr2[i],1);
			
		}
		
		for(int i = 0;i < arr1.length; i++)
		{
			if(!map.containsKey(arr1[i]))
			{
				return false;
			}
		}
		
		return true;
		
		
		
		
		
	}

}
