package Array;

public class ArrayLeaders {
	
	public static void main(String[] args)
	{
		int[] arr = {6, 17, 4, 3, 5, 2};
		boolean isLeader = true;
		
		for(int i = 0;i < arr.length-1; i++)
		{
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					isLeader = false;
					break;
				}
					
			}
		}
		
		System.out.print(arr[arr.length - 1]);
	}

}
