package Graphs;

public class NumberOfIslands {

	public static boolean[][] b = new boolean[5][5];
    static final int ROW = 5, COL = 5; 

	public static void main(String[] args) {
		int[][] graph =  { { 1, 1, 0, 0, 0 }, 
                { 0, 1, 0, 0, 1 }, 
                { 1, 0, 0, 1, 1 }, 
                { 0, 0, 0, 0, 0 }, 
                { 1, 0, 1, 0, 1 } }; 
		
		System.out.println(getNoOfIslands(graph));
	}

	private static int getNoOfIslands(int[][] graph) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i = 0;i < graph.length; i++) {
			for(int j = 0;j < graph[0].length; j++) {
				if(graph[i][j] == 1 && b[i][j] != true) {
					count++;
					dfs(graph,i,j); 
				}
			}
		}
		
		return count;
		
		
		
	}
	
	static boolean isSafe(int M[][], int row, int col, 
             boolean visited[][]) 
{ 
  // row number is in range, column number is in range 
  // and value is 1 and not yet visited 
		 return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]); 
	} 

	
	
	private static void dfs(int[][] graph, int i, int j) {
		
		int[][] dirns = {{1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1},{-1,1},{1,-1}};
		
		b[i][j] = true;
		
		for(int [] arr : dirns) {
			int x = i+arr[0];
			int y = j+arr[1];
			
			
			if(isSafe(graph, x,y, b)) {
				dfs(graph,x,y);
			}
			
		}
		
	}
	
	
}
