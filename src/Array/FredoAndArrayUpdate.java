package Array;

public class FredoAndArrayUpdate {
	
	public static void main(String args)
	{
		
		int[] arr = {1,2,3,4,5};
		
		
		System.out.println(findMin(arr));
		
		
		
	}
	 
	
	static int findMin(int[] arr)
	{
		
		int sum = 0;
		int n = arr.length;
		
		
		for(int i = 0;i < n; i++)
		{
			
			sum += arr[i];
			
			
		}
		
		int a = (int)sum / n;
		
		return ++a;
		
		
		
		
	}
	

}
