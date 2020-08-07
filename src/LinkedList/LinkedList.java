package LinkedList;

public class LinkedList {
	
	static Node head = null;	
	
	public static int rotate(Node head, int k)
	{
		
		Node curr = head;	//Get reference to head
		
		int i = 1;
		
		while(i < k)
		{
			
			curr = curr.next;
			i++;
		} 
		
		Node newNode = curr;
		
		while(curr.next != null)
		{
			curr = curr.next;
			
		}
		
		curr.next = head;
		
		head = newNode.next;
		newNode.next = null;
		
		return head.data;
		
	}
	
	public static void insertLast(int data) {
		Node node = new Node(data);
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = node;
	}
	public static void insert(int data)
	{	
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		
		else
		{
			Node last = head;
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = node;
		}
		
		
	}	
	
	public static void insertAt(int index, int data)
	{

		Node node = new Node(data);
		Node n = head;
		int i =0;
		while(i < index-1)
		{
			n = n.next;
			i++;
		}
		
		node.next = n.next;
		n.next = node;
		
		
		
		
	}
	
	public void insertStart(int data)
	{
		Node node = new Node(data);
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		
		else
		{
			node.next = head;
			head = node;
		}
	}
	
	
	public static void print()
	{
	
		Node curr = head;
		while(curr != null)
		{
			System.out.println(curr.data);

			curr = curr.next;

		}
	}
	
	public static int getMiddle()
	{
		
		
		Node curr1 = head;
		Node curr2 = head;
		
		while(curr2.next.next != null)
		{
			curr2 = curr2.next.next;
			curr1 = curr1.next;
		}
		
		return curr1.data;
		
	}
	
	public static int getNode(int index)
	{
		if(index == 1)
		{
			return head.data;
		}
		else
		{
			int i = 2;
			Node curr = head.next;
			while(i != index)
			{
				curr = curr.next;
				i++;
			}
			
			return curr.data;
		}
	}
	
	public static int length()
	{
		int count = 0;
		Node curr = head;
		while(curr != null)
		{
			count++;
			curr = curr.next;
		}
	
		return count;
	}
	
	public static void print1(ReverseLinkedList list)
	{
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	

}

