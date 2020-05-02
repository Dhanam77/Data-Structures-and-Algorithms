package Trees;

public class LeftView {

	
	public static void main(String[] args)
	{
		
		
		BST bst = new BST();
		
		 bst.root = new Node(10);  
	     bst.root.left = new Node(20);  
	     bst.root.right = new Node(30);  
	     bst.root.left.left = new Node(40);  
	     bst.root.left.right = new Node(50);  
		
	     findLeftView(bst.root);
		
	}
	
	
	
	static void findLeftView(Node root)
	{
		
		if(root != null)
		{
			System.out.print(root.data + " ");
		}
		
		if(root == null)
		{
			return;
		}
		
		
		else if(root.left == null && root.right == null)
		{
			return;
		}
		
		else if(root.left == null)
		{
			findLeftView(root.right);
		}
		
		else
		{
			findLeftView(root.left);
		}
		
		
	}
	
}
