package Queue;

public class StackUsingQueue {
	
	
	Queue queue1 = new Queue();
	Queue queue2 = new Queue();
	int size = 0;
	
	
	public void push(int data)
	{
		
		queue1.enqueue(data);
		size++;
		
	}
	
	public int pop()
	{
		while(!queue1.isEmpty())
		{
			queue2.enqueue(queue1.peek());;
		}
		
		
		Queue q = queue1;
		queue1 = queue2;
		queue2 = q;
		size--;
		return queue1.dequeue();
		
		}
	
	
	public void show()
	{
		
		while(!queue1.isEmpty())
		{
			System.out.println(queue1.dequeue());
		}
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	
	
	
	
	
	
	

}
