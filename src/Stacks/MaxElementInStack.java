package Stacks;
import java.util.Stack;

public class MaxElementInStack {
	
	private Stack<Integer> myStack = new Stack<>();
	
	public void push(int n)
	{
		if(myStack.isEmpty())
		{
		myStack.push(n);
		}
		else
		{
			if(n > myStack.peek())
			{
				myStack.push(n);
			}
		}
	}
	public void pop()
	{
		myStack.pop();
	}
	
	public int returnMax()
	{
		return myStack.peek();
	}
	
	public static void main(String[] args)
	{
		MaxElementInStack ds3 = new MaxElementInStack();
		ds3.push(5);
		ds3.push(4);
		ds3.push(7);
		ds3.pop();
		ds3.push(6);
		ds3.push(7);
		
		System.out.println("Max is " + ds3.returnMax());
	}

	
}
