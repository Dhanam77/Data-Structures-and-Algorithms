package Stacks;
import java.util.Stack;

public class StackReverseOrder {
	
	private static Stack<Integer> originalStack = new Stack<>();
	private static Stack<Integer> reverseStack = new Stack<>();
	
	
	public int peek()
	{
		if(originalStack.isEmpty())
		{
			return -1;
		}
		return originalStack.peek();
	}
	
	public void push(int n)
	{
		originalStack.push(n);
	}
	public void pushreverse(int n)
	{
		
		reverseStack.push(n);
	
	}
	public void pop()
	{
		originalStack.pop( );
	}
	
	
	public static void main(String args[])
	{
		StackReverseOrder sro = new StackReverseOrder();
		sro.push(5);
		sro.push(4);
		sro.push(7);
		sro.push(4);
		
		while(!originalStack.isEmpty())
		{
		sro.pushreverse(sro.peek());
		sro.pop();
		}
		
		System.out.println("Reverse stack is " + reverseStack);
		
	}
	
	

}
