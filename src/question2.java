
public class question2 {
	
	public static void main(String[] args)
	{
		int[] trader = {6, 7, 2, 8, 1};
		int[] risk = {5, 4, 3, 1, 8};
		int[] bonus = {9, 9, 1, 9, 4};
		System.out.println(maxReward(trader, risk, bonus));
		
	}
	
	public static int maxReward(int[] trader, int[] risk, int[] bonus)
	{
		int arrayLength = trader.length;
		int maxBonus = 0, totalBonus = 0,maxIndex = 0, minRisk = 10000;
		
		for(int i = 0; i < arrayLength; i++)
		{
			if(bonus[i] >= maxBonus)
			{
				maxBonus = bonus[i];
				if(risk[i] < minRisk)
				{
					minRisk = risk[i];
					maxIndex = i;
				}
				
			}
		}
			
		for(int j = 0; j < arrayLength; j++)
		{
			if(trader[j] >= risk[maxIndex])
			{
				totalBonus += maxBonus; 
			}
		}
		return totalBonus;
		
	}

}
