package Stacks;

import java.util.Stack;


public class Paranthesis {
	
	public static void main(String[] args)
	{
		System.out.println(checkBalance("[({})]"));
		System.out.println(checkBalance("[(]{})]"));
		System.out.println(checkBalance("[({]})]"));
	
	}

	
	public static String checkBalance(String s)
	{
		
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray())
		{
			if(c == '{' || c == '(' || c == '[')
			{ 
				stack.push(c);
			}
			
			else
			{
				if(stack.isEmpty())
				{
					return "No";
				}
				if(c == '}' && stack.peek() == '{')
				{
					stack.pop();
				}
				else if(c == ')' && stack.peek() == '(')
				{
					stack.pop();
				}
				else if(c == ']' && stack.peek() == '[')
				{
					stack.pop();
				}
			}
			
			
		}
		return stack.isEmpty()?"Yes":"No";
		
		
	}
}
