package Array;

public class MaxProfitInStock {

	
	public static void main(String[] args)
	{
		
		int[] prices = {7,1,5,5,3,6,4};
		
		System.out.print(findMax(prices));
		
		
	}
	
	static int findMax(int[] arr)
	{
		boolean isSold = true;
		final int n = arr.length;
		
		int profit = 0;
		
		int i = 0;
		 
		
		for(int j = 1;j < n; j++)
		{
			
			if(arr[j] > arr[j-1])
			{
				if(isSold)
				{
					System.out.println("Buy on day " + j);
					isSold = false;
				}
				continue;
			}
			
			else
			{
				if(!isSold)
			
				{
					profit += (arr[j-1] - arr[i]);
					System.out.println("Sell on day " + j);
					isSold = true;
				}
				
				i=j;
				
			}
			
			
		}
		
		if(arr[n-1] > arr[i])
		{
			profit += (arr[n-1] - arr[i]);
			System.out.println("Sell on day " + n);
			isSold = true;
		}
	
		return profit;
		
	}
	
	
	
}
