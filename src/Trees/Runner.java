package Trees;

public class Runner {
	
	
	public static void main(String args[])
	{
		
		BST bst = new BST();
		
		Node root = null;
		root = bst.insert(root, 19);
		root = bst.insert(root, 14);
		
		
		bst.printInOrder(root);
		
		
	}

}
