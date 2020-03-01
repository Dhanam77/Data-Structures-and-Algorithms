package Mathematical;

public class armstrong {
	
	public static void main(String[] args)
	{
		for(int i = 100;i <= 999; i++)
		{
			int d3 = i % 10;
			int d1 = i / 100;
			int d2 = (i/10) % 10;
			
			
			if((d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3) == i)
			{
				System.out.println( i + " " + "Yes");
			}
		
		}
		
		
		
		
	}

}
