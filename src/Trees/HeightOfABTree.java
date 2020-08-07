package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfABTree {
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(6);
		root.right = new Node(7);
		root.left.left = new Node(8);
		root.left.right = new Node(9);
		root.left.left.left = new Node(10);
		root.left.left.right = new Node(11);
		
		System.out.println(getHeightIt(root));
		
	}
	
	//Recursive
	
	public static int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		return Math.max(1 + getHeight(root.left), 1+getHeight(root.right));
		

	}
	
	//Iterative
	
	
	public static int getHeightIt(Node root) {
		
		int height = 0;
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			
			int size = q.size();
			while(size-- > 0) {
				Node node = q.poll();
				
				if(node.left != null) {
					q.add(node.left);
				}
				if(node.right != null) {
					q.add(node.right);
				}
				
			}
			height++;			
			
		}
		
		
		return height;
		
	}

}
