package Queue;

public class Queue {
	
	/*
	 * Implementation of queue using Arrays
	 */

	int queue[] = new int[5];
	int size = 0;
	int front = 0, rear = 0;

	
	
	
	public void enqueue(int data)
	{
		
		queue[rear] = data;
		rear++;
		size++;
		
		
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int dequeue()
	{
		queue[front] = 0;
		front++;
		size--;
		
		return queue[front];
	}
	
	public int peek()
	{
		return queue[front];
	}
	
	public void show()
	{
		for(int i = front; i < rear; i++)
		{
			System.out.print(queue[i] + " ");
		}
	}

}
