package BackTracking;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

class Node
{
	int x, y, dist;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Node(int x, int y, int dist) {
		this.x = x;
		this.y = y;
		this.dist = dist;
	}

}


public class dont_get_volunteered {
	
	private static int row[] = { 2, 2, -2, -2, 1, 1, -1, -1 };
	private static int col[] = { -1, 1, 1, -1, 2, -2, 2, -2 }; 
	
	
	public static void main(String[] args)
	{
		System.out.println(solution(19,36));
	}
	

	   public static int solution(int src, int dest) {
	        //Your code here
		   int[] res = new int[2];
		   int[] res1 = new int[2];
		   
		   res = getDim(src);
		   res1 = getDim(dest);
		   
			System.out.println(res[0] +" "+  res[1]);

		   return BFS(new Node(res[0], res[1]), new Node(res1[0], res1[1]), 8);
	   }
	   
	   private static int[] getDim(int val)
	   {
		   int[] res = new int[2];
		   int count = 0;
		   for(int i = 0;i < 8; i++)
		   {
			   for(int j = 0;j < 8; j++)
			   {
				   if(val == count)
				   {
					   res[0] = i;
					   res[1] = j;
				   }
				   
				   count++;
			   }
		   }
		   
		   return res;
	   }
	   
	   private static boolean valid(int x, int y, int N)
		{
			if (x < 0 || y < 0 || x >= N || y >= N)
				return false;

			return true;
		}
	   public static int BFS(Node src, Node dest, int N)
		{
			// set to check if matrix cell is visited before or not
			Set<Node> visited = new HashSet<>();

			// create a queue and enqueue first node
			Queue<Node> q = new ArrayDeque<>();
			q.add(src);

			// run till queue is not empty
			while (!q.isEmpty())
			{
				// pop front node from queue and process it
				Node node = q.poll();

				int x = node.x;
				int y = node.y;
				int dist = node.dist;

				// if destination is reached, return distance
				if (x == dest.x && y == dest.y)
					return dist;

				// Skip if location is visited before
				if (!visited.contains(node))
				{
					// mark current node as visited
					visited.add(node);

					// check for all 8 possible movements for a knight
					// and enqueue each valid movement into the queue
					for (int i = 0; i < 8; ++i)
					{
						// Get the new valid position of Knight from current
						// position on chessboard and enqueue it in the
						// queue with +1 distance
						int x1 = x + row[i];
						int y1 = y + col[i];

						if (valid(x1, y1, N))
							q.add(new Node(x1, y1, dist + 1));
					}
				}
			}

			// return INFINITY if path is not possible
			return Integer.MAX_VALUE;
		}
}
	        