package Stacks;
import java.util.Stack;

class MinElementInStack {
	
	private Stack<Integer> checkMinStack;
	private Stack<Integer> mainStack;
	private int minNumber;
	
	public MinElementInStack()
	{
		//create an empty stack
		
		checkMinStack =  new Stack<>();
		mainStack  = new Stack<>();
	}
	
	public void push(int n)
	{
		mainStack.push(n);
		if(checkMinStack.isEmpty())
		{
			checkMinStack.push(n);
		}
		else
		{
			if(checkMinStack.peek() > n)
			{
				checkMinStack.push(n);
			}
		}
		
	}
	
	public int determineMin()
	{
	
		minNumber = checkMinStack.peek();
		return minNumber;
		
	}
	
	public void pop()
	{
		if(mainStack.isEmpty())
		{
			
		}
		
		else
		{
			
		}
	}
	
	
	
	

	
	public static void main(String args[])
	{
		MinElementInStack ds2 = new MinElementInStack();
		ds2.push(5);
		ds2.push(7);
		ds2.push(3);
		ds2.push(5);
		ds2.push(1);
		
		System.out.println("Min number in stack 2 is " + String.valueOf(ds2.determineMin()));
	}
}
