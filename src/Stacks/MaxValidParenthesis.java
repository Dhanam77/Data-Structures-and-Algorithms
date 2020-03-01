package Stacks;

import java.util.Stack;

public class MaxValidParenthesis {
	
	/*
	 * Find Max Length of valid parenthesis 
	 */
	
	
	public static void main(String[] args)
	{
		
		
		String s = ")()())";
		
		System.out.println(findMax(s));
		
		
	}
	
	
	public static int findMax(String s)
	{
		
		Stack<Character> myStack = new Stack<>();
		
		int count = 0;
		
		char[] arr = s.toCharArray();
		
		for(int i = 0;i < arr.length; i++)
		{
			
			if(myStack.isEmpty() || arr[i] == '{' || arr[i] == '[' || arr[i] == '(')
			{
				myStack.push(arr[i]);
			}
			
			else
			{
				
				if(arr[i] == '}' && myStack.peek() == '{')
				{
					count += 2;
					myStack.pop();
				}
				if(arr[i] == ')' && myStack.peek() == '(')
				{
					count += 2;
					myStack.pop();
				}
				if(arr[i] == ']' && myStack.peek() == '[')
				{
					count += 2;
					myStack.pop();
				}
				
			
				
				
			}
			
			
		}
		
		return count;
		
		
		
		
	}
	

}
