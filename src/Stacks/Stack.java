package Stacks;

public class Stack {
	
	int size;
	int[] arr;
	int top = -1;
	
	Stack(int size)
	{
		this.size = size;
		arr = new int[size];
	}
	
	Stack()
	{
		this.size = 10;
		arr = new int[10];

	}
	
	public void push(int value)
	{
		
		if(top == size - 1)
		{
			System.out.println("Stack Overflow!");
			System.exit(0);
		}
		
		else
		{
			arr[++top] = value;
		}
		
	}
	
	public int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack underflow!");
			System.exit(1);
			return -1;
			
		}
		
		else
		{
			return arr[top--];
		}
			
	}
	
	public void print()
	{
		for(int i = 0;i <= top; i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
