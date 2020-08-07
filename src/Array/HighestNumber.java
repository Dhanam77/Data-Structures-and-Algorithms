package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestNumber {
	
	/*
	 * 
	 * Arrange Elements to get highest possible number
	 */
	
	
	public static void main(String[] args)
	{
		
		List<String> list = new ArrayList<String>();
		list.add("231");
		list.add("234");
		list.add("23");
		list.add("3");
		list.add("56");
		
		System.out.println(highestNumber(list));
		
	}

	
	static String highestNumber(List<String> list)
	{
		Collections.sort(list, new sorter());
		StringBuilder sb = new StringBuilder();
		for(String s : list)
		{
			sb.append(s);
		}
		
		return sb.toString();
		
		
	}
}

class sorter implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		
		String X = o1 + o2;
		String Y = o2 + o1;
		
		return Y.compareTo(X);	
	}	
}
