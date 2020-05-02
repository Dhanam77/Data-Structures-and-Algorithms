package KickStart;

public class NewRobot {
	
	
	public static void main(String[] args)
	{
		
		int[][] grid = {{0,0,0},{0,0,0},{0,0,0}};
		
		
		String query = "SESE";
		int x = 1, y = 1;
		int startRow = x-1, startColumn = y-1;
		
		
		grid[startRow][startColumn] = 1;
		
		
		char[] arr = query.toCharArray();		
		int[] array = new int[2];
		
		for(char c : arr)
		{
			if(c == 'E')
			{
				array = moveEast(grid,startRow, startColumn);
				startRow = array[0];
				startColumn = array[1];
				grid[startRow][startColumn] = 1;


			}
			if(c == 'W')
			{
				array = moveWest(grid,startRow, startColumn);
				startRow = array[0];
				startColumn = array[1];
				grid[startRow][startColumn] = 1;

			}
			if(c == 'N')
			{
				array = moveNorth(grid,startRow, startColumn);
				startRow = array[0];
				startColumn = array[1];
				grid[startRow][startColumn] = 1;

			}
			if(c == 'S')
			{
				array = moveSouth(grid,startRow, startColumn);
				startRow = array[0];
				startColumn = array[1];
				grid[startRow][startColumn] = 1;

			}
		}
		
		startRow++;
		startColumn++;
		System.out.println("Final Position of Robot: " + startRow  + " " +startColumn);
		
		for(int i = 0;i < 3; i++)
		{
			for(int j = 0;j < 3; j++)
			{
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	static int[] moveEast(int[][] grid, int startRow, int startColumn){
		
		int[] array = new int[2];
		while(grid[startRow][startColumn] == 1 && startColumn < 3)
		{
			startColumn++;
		}
		grid[startRow][startColumn] = 1;

		array[0] = startRow;
		array[1] = startColumn;
		
		return array;
		
		
	}

static int[] moveSouth(int[][] grid, int startRow, int startColumn){
		
		int[] array = new int[2];
		while(grid[startRow][startColumn] == 1 && startRow < 3)
		{
			startRow++;
		}
		grid[startRow][startColumn] = 1;

		array[0] = startRow;
		array[1] = startColumn;
		
		return array;
		
		
	}

static int[] moveNorth(int[][] grid, int startRow, int startColumn){
	
	int[] array = new int[2];
	while(grid[startRow][startColumn] == 1 && startRow > 0)
	{
		startRow--;
	}
	grid[startRow][startColumn] = 1;

	array[0] = startRow;
	array[1] = startColumn;
	
	return array;
	
	
}

static int[] moveWest(int[][] grid, int startRow, int startColumn){
	
	int[] array = new int[2];
	while(grid[startRow][startColumn] == 1 && startColumn > 0)
	{
		startColumn--;
	}
	grid[startRow][startColumn] = 1;
	
	array[0] = startRow;
	array[1] = startColumn;
	
	return array;
	
	
}

}
