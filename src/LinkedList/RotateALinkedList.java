package LinkedList;


public class RotateALinkedList {
	
	
	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(1);
		node.next.next.next  = new Node(2);
		node.next.next.next.next  = new Node(1);
		node.next.next.next.next.next  = new Node(2);
	
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		list.rotate(node, 3);
		
		list.print();


		
		
	}

}
