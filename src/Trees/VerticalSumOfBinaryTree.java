package Trees;

import java.util.*;

public class VerticalSumOfBinaryTree {

	/*
	 * 		
	 * Basic idea is to find horizontal distance of each node
	 * Map each element at a particular distance
	 * 
	 * 
	 */
	public static  Map<Integer,Integer> map = new TreeMap<>();

	
	public static void main(String[] args) {
		
		 BST bst = new BST();
		
		 bst.root = new Node(1);  
	     bst.root.left = new Node(2);  
	     bst.root.right = new Node(3);  
	     bst.root.left.left = new Node(4);  
	     bst.root.left.right = new Node(5);  
	     bst.root.right.right = new Node(7);
	     bst.root.right.left = new Node(6);
		
		int[] arr = findVerticalSum(bst.root);
	     
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] == 0) break;
			System.out.print(arr[i] + " ");
		}
		
	}

	private static int[] findVerticalSum(Node root) {
		// TODO Auto-generated method stub
		
		helper(root,0);
		int[] res = new int[10000];
		int k = 0;
		for(Integer i: map.values()) {
			res[k++] = i;
		}	
		return res;
	}
	
	static void helper(Node root, int distance) {
		if(root == null) {
			return;
		}
		map.put(distance, map.getOrDefault(distance,0) + root.data);
		
		helper(root.left, distance-1);
		helper(root.right,distance+1);
	}
	
	
}
