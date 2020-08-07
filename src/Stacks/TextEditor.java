package Stacks;

import java.io.*;
import java.util.*;
import java.util.Stack;

public class TextEditor {
	
	
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-- >= 0)
		{
			String[] queries = sc.nextLine().split(" ");
			
			performOperations(queries);
		}
		
		
	}
	 
	
	
	static void performOperations(String[] queries)
	{
		
		Stack<Integer> myStack = new Stack<>();
		
		String query;
		int b;
		int a = Integer.parseInt(queries[0]);
		
		if(a == 1)
		{
			query = queries[1];
			
		}
		else
		{
			b = Integer.parseInt(queries[1]);
		}
		
		
		
		
	}

}
