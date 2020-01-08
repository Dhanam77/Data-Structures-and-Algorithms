package LinkedList;

public class Runner {
	
	
	public static void main(String[] args)
	{
		
		LinkedList list1 = new LinkedList();
		
	/*	list.insert(5);
		list.insert(12);
		list.insert(332);
		list.insert(32);
		list.insert(42);
		list.insert(52);
		
		list.insertAt(0, 22);

		

		list.print(list);

	*/
		
		ReverseLinkedList list = new ReverseLinkedList();
		 list.head = new Node(85); 
	     list.head.next = new Node(15); 
	     list.head.next.next = new Node(4); 
         list.head.next.next.next = new Node(20); 
         
         list.reverse(list.head);
         list1.print1(list);
         
		
	}

}
