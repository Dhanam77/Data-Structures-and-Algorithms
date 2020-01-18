package Trees;

public class Runner {
	
	
	public static void main(String args[])
	{
		
		
		BST bst = new BST();
	
		 bst.root = new Node(1);  
	     bst.root.left = new Node(2);  
	     bst.root.right = new Node(3);  
	     bst.root.left.left = new Node(4);  
	     bst.root.right.left = new Node(5);  
	     bst.root.right.right = new Node(6);
		
		
		System.out.println(bst.search(bst.root, 4));
		bst.printInOrder(bst.root);
		
		
	}

}
