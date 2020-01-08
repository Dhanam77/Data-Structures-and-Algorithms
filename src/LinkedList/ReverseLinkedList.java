package LinkedList;

public class ReverseLinkedList {
	
	
	public Node head;

	public Node reverse(Node head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		else
		{
			Node current = head;
			Node prev = null;
			Node next = null;

			while(current!= null)
			{
			
			    next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;
			return head;
		}
		
		
	}

}
