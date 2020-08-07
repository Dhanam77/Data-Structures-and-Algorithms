package Graphs;

import java.util.*;

public class Graph {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	
	
	static void BFS(ArrayList<ArrayList<Integer>> adj, int V)
	{
		boolean[] visited = new boolean[V+1];
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		visited[1] = true;
		while(!queue.isEmpty())
		{
			int s = queue.poll();
			System.out.print(s + " ");

			for(int i = 0;i < adj.get(s).size(); i++)
			{
				if(visited[adj.get(s).get(i)] == false)
				{
					visited[adj.get(s).get(i)] = true;
					queue.add(adj.get(s).get(i));

				}
			}
			
			
			
		}
	}
	
	public static void dfs(ArrayList<ArrayList<Integer>> adj, int V) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		boolean[] vis = new boolean[V+1];
		vis[1] = true;
		while(!stack.isEmpty()) {
			int a = stack.pop();
			System.out.print(a + " ");
			for(int i = 0;i < adj.get(a).size(); i++) {
				if(!vis[adj.get(a).get(i)]) {
					stack.push(adj.get(a).get(i));
					vis[adj.get(a).get(i)] = true;

				}
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		int V = 6;	//Graph with 6 vertices
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V+1);
		
		for(int i = 0;i < V+1; i++)
		{
			adj.add(new ArrayList<Integer>());
			
			
		}
		
		addEdge(adj, 1,2);
		addEdge(adj, 1,3);
		addEdge(adj, 2,4);
		addEdge(adj, 2,5);
		addEdge(adj, 3,5);
		addEdge(adj, 4,5);
		addEdge(adj, 4,6);
		addEdge(adj, 5,6);

		
		dfs(adj, V);
		
	}

}
