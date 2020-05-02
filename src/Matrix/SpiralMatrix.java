package Matrix;

public class SpiralMatrix {
	
	
	public static void main(String[] args)
	{
		
		
		
		int[][] arr = {{1,2,3},
					  {4,5,6},
					  {7,8,9}};
		
		
		printInSpiralForm(arr);
		
		
	}

	private static void printInSpiralForm(int[][] arr) {
		// TODO Auto-generated method stub
		
		int k = 0;
		int l = 0;
		int m = 3;
		int n = 3;

		while(k < m && l < n)
		{
			
			for(int i = k;i < m; i++)
			{
				
				System.out.print(arr[l][i] + " ");
			}
			
			k++;
			
			for(int i = k;i < n; i++)
			{
				System.out.print("");
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	

}
