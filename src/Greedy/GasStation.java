package Greedy;

public class GasStation {

	
	public static void main(String[] args)
	{
		
		int[] A = {1,2};
		int[] B = {2,1};
		
		
		System.out.println(findMinIndex(A,B));
		
		
		
		

	}
	
	
	public static int findMinIndex(int[] A, int[] B)
	{
		
		boolean hasReturned = false;
		
		int n = A.length;
		
		int i = 0;
		
		while(i < A.length)
		{
			while(A[i] < B[i])
			{
				i++;
			}
			
			int j = i;
			while(!hasReturned)
			{
				
				int a = A[i] - B[i];
				
				if(a < 0 && i == A.length - 1)
				{
					return -1;
				}
				
				else if(a < 0 && i < A.length - 1)
				{
					i++;
					break;
				}
				
				i = (i+1)%n;
				
				if(i == j)
				{
					hasReturned = true;
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		return i;
		
		
		
		
	}
	
	
}

