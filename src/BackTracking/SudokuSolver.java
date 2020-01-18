package BackTracking;

public class SudokuSolver {
	
	private static int[][] board = {
			  { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
			  { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
			  { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
			  { 0, 5, 0, 0, 0, 2, 0, 0, 0 },
			  { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
			  { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
			  { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
			  { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
			  { 0, 9, 0, 0, 0, 0, 4, 0, 0 } 
			};
	
	
	private static int SIZE = 9;
	private static int EMPTY = 0;
	
	
	

		
	public static boolean solve()
	{
		for(int ROW = 0;ROW < SIZE; ROW++)
		{
			for(int COL = 0;COL < SIZE; COL++)
			{
				if(board[ROW][COL] == EMPTY)	//Empty cell, add a number from 1 to 9;
				{
					for(int VAL = 1;VAL < 10; VAL++ )
					{
						if(followsConstraints(ROW, COL, VAL))
						{
							board[ROW][COL] = VAL;
							
							
							if(solve())
							{
								return true;

							}
							else
							{
								board[ROW][COL] = EMPTY;
							}
							
						}
					}
					
					return false;
					
				}
			}
		}
		
		return true;
	}	
	
	
	public static boolean followsConstraints(int ROW, int COL, int VAL)
	{
		if(rowSatisfied(ROW, VAL) && colSatisfied(COL, VAL) && boxSatisfied(ROW, COL, VAL))
		{
			return true;
		}
			
		return false;
	}
	
	public static boolean rowSatisfied(int ROW, int VAL)
	{
		for(int i = 0;i < SIZE; i++)
		{
			if(board[ROW][i] == VAL)
			{
				return false;
			}
		}
		
		return true;
	}
	public static boolean colSatisfied(int COL, int VAL)
	{
		for(int i = 0;i < SIZE; i++)
		{
			if(board[i][COL] == VAL)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean boxSatisfied(int row, int col, int num)
	{
		
		int sqrt = (int) Math.sqrt(board.length); 
	    int boxRowStart = row - row % sqrt; 
	    int boxColStart = col - col % sqrt; 
	  
	    for (int r = boxRowStart; 
	             r < boxRowStart + sqrt; r++)  
	    { 
	        for (int d = boxColStart;  
	                 d < boxColStart + sqrt; d++)  
	        { 
	            if (board[r][d] == num)  
	            { 
	                return false; 
	            } 
	        } 
	    } 
	  
	        // if there is no clash, it's safe 
	    return true; 

	}
	
	
	public static void display()
	{
		
		for(int ROW = 0; ROW < SIZE; ROW++)
		{
			for(int COL = 0; COL < SIZE; COL++)
			{
				System.out.print(board[ROW][COL] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Grid to be solved: ");
		SudokuSolver.display();
		
		if(SudokuSolver.solve())
		{
			System.out.println("Sudoku Solved using BackTracking");
			SudokuSolver.display();
		}
		else
		{
			System.out.println("Sudoku unsolvable");

		}
		
	}
	
}