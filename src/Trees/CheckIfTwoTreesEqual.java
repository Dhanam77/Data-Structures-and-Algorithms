package Trees;

public class CheckIfTwoTreesEqual {
	
	public static void main(String[] args)
	{

		BST bst = new BST();
		BST bst1 = new BST();
		
		 bst.root = new Node(10);  
	     bst.root.left = new Node(20);  
	     bst.root.right = new Node(30);  
	     bst.root.left.left = new Node(40);  
	     bst.root.left.right = new Node(50);  
	     
	     bst1.root = new Node(10);  
	     bst1.root.left = new Node(20);  
	     bst1.root.right = new Node(20);  
	     bst1.root.left.left = new Node(40);  
	     bst1.root.left.right = new Node(50);  
		
	     System.out.println(checkIfEqual(bst.root, bst1.root));
	}

	private static boolean checkIfEqual(Node root, Node root2) {
		// TODO Auto-generated method stub
		
		if(root == null && root2 == null)
		{
			return true;
		}
		
		if(root == null || root2 == null)
		{
			return false;
		}
		
		if(root.data == root2.data)
		{
			return checkIfEqual(root.left, root2.left) && checkIfEqual(root.right, root2.right);
		}
		
		return false;
		
		
	}

}
