package Queue;

public class Queue {
	
	/*
	 * Implementation of queue using Arrays
	 */

	int queue[];
	int size;
	int front = -1, rear = -1;

	public Queue(int cap) {
		queue = new int[cap];
		size = cap;
	}
	
	
	public void enqueue(int data)
	{
		if(front == -1) {
			front++;
		}
		if(rear == size-1) {
			System.out.println("Queue is full");
		}
		else {
			queue[++rear] = data;
			
		}
		
		
		
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
	
	public int dequeue()
	{
		
		if(front == rear) {
			System.out.println("Queue already empty");
			return -1;
		}

		else {
			int elem = queue[front];

			queue[front] = 0;
			front++;
			return elem;
	
		}
		
	}
	
	public int peek()
	{
		return queue[front];
	}
	
	public void show()
	{
		for(int i = front; i <= rear; i++)
		{
			System.out.print(queue[i] + " ");
		}
	}

}
