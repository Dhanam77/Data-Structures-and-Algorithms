
public class question5 {
	
	public static void main(String[] args)
	{
		int[] threats = new int[] {4,1,1,2,2,3,1,5,1};
		
		System.out.println(getMaxInstances(threats));
	}
	
	
	public static int getMaxInstances(int[] threats)
	{
		int instances = 1;
		
		for(int i = 1; i < threats.length; i += 2)
		{
			if(threats[i] < threats[i+1])
			{
				instances++;
			}
			else
			{
				continue;
			}
		}
		
		return instances;
	}

}
