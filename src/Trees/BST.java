package Trees;

public class BST {
	
	
	public static Node createNewNode(int data)
	{
		Node node = new Node(data);
		node.left = null;
		node.right = null;
		
		return node;
	}
	
	
	
	public static Node insert(Node root, int data)
	{
		
		if(root == null)
		{
			return createNewNode(data);
		}
		
		else
		{
			if(root.data < data)
			{
				root.right = insert(root.right, data);
			}
			else 
			{
				root.left = insert(root.left, data);
			}
		}
		
		return root;
		
	}
	
	public static void printInOrder(Node root)
	{
		if(root!= null)
		{
			printInOrder(root.left);
			System.out.println(root.data);
			printInOrder(root.right);
		}
	}
	
	public static String search(Node root, int data)
	{
		if(root == null)
		{
			return "No";
		}
		else if(root.data == data)
		{
			return "Yes";
		}
		else
		{
			if(root.data < data)
			{
				search(root.right, data);
			}
			else if(root.data > data)
			{
				search(root.left, data);
			}
		}
		
		return "No";
		
	}

	public Node root;

}
