package LinkedList;

public class LinkedList {
	
	static Node head = null;
	
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
		node.data = data;
		node.next = null;
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
	
	
	public static void print(LinkedList list)
	{
		
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
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
