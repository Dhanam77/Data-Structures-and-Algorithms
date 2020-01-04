package Queue;

public class Runner {

	
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enqueue(4);
		q.enqueue(7);
		q.enqueue(5);
		q.dequeue();
		q.dequeue();
		q.enqueue(8);
		q.dequeue();
		
		q.peek();
		
		q.enqueue(43);
		
		q.dequeue();
		
		q.peek();
		
		q.show();
	}
		
}
