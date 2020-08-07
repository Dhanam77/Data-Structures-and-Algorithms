package BackTracking;

import java.util.Stack;

public class RatMaze {
	
	static int[][] maze = { { 1, 1, 1, 0 }, 
            { 1, 1, 1, 1 }, 
            { 1, 0, 1, 0 }, 
            { 1, 1, 1, 1 } };
	
	private static int N = 4;

	
	public static void main(String[] args)
	{
		
		System.out.println("Maze to be solved...");
		printMaze(maze);
		solveMaze();
		solveUsingBFS();
		
	}
	
	private static void solveUsingBFS() {
		// TODO Auto-generated method stub
		
	}

	public static boolean solveMaze()
	{
		int[][] soln = new int[N][N];
		
		if(canSolve(0,0,soln))
		{
			System.out.println("Maze Solved! ");
			printMaze(soln);
			return true;
		}
		System.out.println("Maze Cannot be Solved! ");

		return false;
	}
	
	public static boolean isSafe(int x, int y, int[][] soln)
	{
		if(x >= 0 && x < N && y>= 0 && y< N && maze[x][y]==1)
		{
			return true;
		}
		return false;
	}
	
	public static boolean canSolve(int x, int y, int[][] soln)
	{
		if(x == N-1 && y == N-1)
		{
			soln[x][y] = 1;
			return true;
		}
		
		if(isSafe(x,y,soln))
			{
				soln[x][y] = 1;
				
				if(canSolve(x, y+1, soln))		//go right
				{
					return true;
				}
				if(canSolve(x+1, y, soln))		//go down
				{
					return true;
				}
				
					soln[x][y] = 0;			//backtrack
					return false;
				
			}
		
		
		return false;
	}
	
	public static void printMaze(int[][] soln)
	{
		for(int i = 0;i < N; i++)
		{
			for(int j = 0;j < N;j++)
			{
				System.out.print(soln[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	
	

}
