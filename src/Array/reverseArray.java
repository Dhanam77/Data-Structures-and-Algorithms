package Array;

public class reverseArray {
	
	/*
	 * 
	 * Reverse the array
	 */
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int b[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			
			b[i] =  arr[arr.length-i-1];
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}
	
	
	

}
