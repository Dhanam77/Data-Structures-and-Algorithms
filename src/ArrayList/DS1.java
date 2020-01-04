package ArrayList;
import java.util.*;

public class DS1 {
	public static int arrayLength;
	private static List<Integer> elementList = new ArrayList();
	private static List<Integer> higherValueElements = new ArrayList();
	
	public static void main(String args[])	{
	
		System.out.println("Enter array length");
		Scanner sc = new Scanner(System.in);
		
		arrayLength = sc.nextInt();
		
		for(int i = 0; i< arrayLength; i++)
		{
			System.out.println("Enter array element");			
			elementList.add(sc.nextInt());
		}
		
		for(int i = 0; i< elementList.size(); i++)
		{
			for(int j=0; j< elementList.size(); j++)
			{
				if(elementList.get(i) > elementList.get(j))
				{
					if(!higherValueElements.contains(elementList.get(i)))
					{
					higherValueElements.add(elementList.get(i));
				}}
				
			}
			
		}
		System.out.println(higherValueElements);
	}
}
