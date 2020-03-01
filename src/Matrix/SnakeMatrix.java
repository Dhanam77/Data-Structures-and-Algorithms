package Matrix;

public class SnakeMatrix {
	
	/*
	 * 
	 * print matrix in snake form
	 * 
	 */
	
	public static void main(String[] args)
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		printInSnakeForm(matrix);
		
	}
	
	
	public static void printInSnakeForm(int[][] matrix)
	{
		for(int i = 0;i < 3; i++)
		{
			for(int j = 0;j < 3; j++)
			{
				if(i % 2 != 0)
				{
					System.out.print(matrix[i][2-j]);
				}
				else
				{
					System.out.print(matrix[i][j]);

				}
				
			}
		}
	}

}
