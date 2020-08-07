package Trees;

public class LowestCommonAncestor {
	
	public static void main(String[] args)
	{
		BST bst = new BST();
		BST bst1 = new BST();
		
		 bst.root = new Node(10);  
	     bst.root.left = new Node(20);  
	     bst.root.right = new Node(30);  
	     bst.root.left.left = new Node(40);  
	     bst.root.left.right = new Node(50);  

		
	     System.out.println(lca(bst.root, 10,30).data);
	}

	private static Node lca(Node root, int i, int j) {
		// TODO Auto-generated method stub
		
		if(root == null)
		{
			return null;
		}
		
		
		if(i > root.data && j > root.data)
		{
			return lca(root.right, i, j);
		}
		
		if(i < root.data && j < root.data)
		{
			return lca(root.left, i, j);
		}
		
		return root;
		
	}

}
