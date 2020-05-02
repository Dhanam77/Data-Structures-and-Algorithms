package DynamicProgramming;

public class CoinChange {
	
	
	public static void main(String[] args)
	{
		
		
		String s = "GeeksForGeeks";
		String x = "Fr";
		
		int[] arr = {100,80,60,70,60,75,85};
		
		
		int[] res = stockSpan(arr);
		
		for(int i = 0;i < res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
		
		//System.out.print(findIndex(s,x));
		
		
	}
	
	
	static int findIndex(String s, String x)
	{
		
		return s.indexOf(x)>0?s.indexOf(x):-1;
		
		
		
	}
	
	static int[] stockSpan(int[] arr)
	{
		
		final int n = arr.length;
		int[] res = new int[n];
		int k = 1;
		res[0] = 1;

		
		for(int i = 1;i < n; i++)
		{
			int count = 1;

			for(int j = i-1;j >= 0; j--)
			{
				if(arr[j] < arr[i])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			
				res[k++] = count;

			
		}
		
	
	
	return res;
	
	}

}
