package Queue;

public class Runner {

	
	public static void main(String[] args) throws Exception
	{
		Queue q = new Queue(10);
		q.enqueue(4);
		q.enqueue(7);
		//q.enqueue(5);
		//q.dequeue();
		q.dequeue();
		//q.enqueue(8);
	//	q.dequeue();
		
	//	q.peek();
		
		//q.enqueue(43);
		//q.enqueue(48);
		
	//	q.dequeue();
		
	//	q.peek();
		
		//q.show();
	
		
	
		StackUsingQueue s = new StackUsingQueue();
		
		s.push(5);
		s.push(6);
		s.push(7);
		s.popCostly();
		s.show();
}
	
		
}
