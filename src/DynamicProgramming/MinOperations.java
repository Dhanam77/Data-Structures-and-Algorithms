package DynamicProgramming;



import java.util.*;

public class MinOperations {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		System.out.println("Min operations required are: " + getMinOperations(val));
		
		sc.close();
		
	}
	
	
	public static int getMinOperations(int val)
	{
		int start = 0;
		
	
		if(val%2 == 0)
		{
			start += 2;
			
			while(start!= val)
			{
				start *= 2;
				
				
				
			}
		}
	}
	
	
	
	
}
