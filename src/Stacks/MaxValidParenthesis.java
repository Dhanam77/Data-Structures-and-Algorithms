package Stacks;

import java.util.Stack;

public class MaxValidParenthesis {
	
	/*
	 * Find Max Length of valid parenthesis 
	 */
	
	
	public static void main(String[] args)
	{
		String s = "()()()()))(()()(())))";
		
		//System.out.println(findMax(s));
		
		Stack<Character> stack = new Stack<>();
		int maxValid = 0;
		for(int i = 0;i < s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}
			else {
				if(s.charAt(i) == '(') {
					stack.push(s.charAt(i));
				}
				else {
					if(stack.peek() == '(') {
						maxValid += 2;
						stack.pop();
					}
					else {
						stack.push(s.charAt(i));
					}
				}
			}
		}
		System.out.println(maxValid);
		
		
		
	
	} 
	/*
	public static int findMax(String s)
	{
		
		Stack<Character> myStack = new Stack<>();
		
		int count = 0;
		
		char[] arr = s.toCharArray();
		
        System.out.println('c' - 'a');

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
	*/

}
