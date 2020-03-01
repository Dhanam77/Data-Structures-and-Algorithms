package Stacks;

public class NextLargerElement {
	
	public static void main(String[] args)
	{
		int[] arr = {3,5,7,2,8};
		
		
		
		System.out.println(findNextLargerElement(arr));
	}
	
	public static int findNextLargerElement(int[] arr)
	
	{		
		for(int i = 0;i < arr.length; i++)
		{
			for(int j = i+1;j < arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
					return arr[j];
					
				}
			}
		}
		
		
		return -1;
	}

}
