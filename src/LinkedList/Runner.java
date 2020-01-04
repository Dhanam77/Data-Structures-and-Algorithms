package LinkedList;

public class Runner {
	
	
	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(12);
		list.insert(332);
		list.insert(32);
		list.insert(42);
		list.insert(52);
		
		list.insertAt(0, 22);

		

		list.print(list);

		
		
	}

}
