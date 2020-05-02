package Array;

public class SpeedEff {
	
	    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
	        
	        int  maxPerformance = 0;
	        
	        for(int  i =0; i < n-k; i++)
	        {
	            int performance = 0;
	            for(int j = i;j < k+i; j++)
	            {
	                performance += speed[j];
	            }
	            
	            performance *= getMin(efficiency, k, i);
	            if(performance > maxPerformance)
	            {
	                maxPerformance = performance;
	            }
	        }
	         
	        return maxPerformance;
	        
	        
	        
	    }
	    
	    public int getMin(int[] efficiency, int k, int i)
	    {
	        
	        int min = Integer.MAX_VALUE;

	        
	        for(int l = i;l < k; l++)

	        {
	            if(efficiency[l] < min)
	            {
	                min = efficiency[l];
	            } 
	        }
	           
	        
	        return min;
	        
	    }
	    
	    public static void main(String[] args)
	    {
	    	
	    	SpeedEff s = new SpeedEff();;
	    	int n = 6;
	    	int[] speed = {2,10,3,1,5,8};
	    	int[] efficiency = {5,4,3,9,7,2};
	    	int k = 3;
	    	
	    	System.out.println(s.maxPerformance(n, speed, efficiency, k));
	    	
	    	
	    }
	    
	}

