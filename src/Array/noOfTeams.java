package Array;


/*
 * 
 * Current TC - O(N^3)
 * need to optimize
 */

class noOfTeams {
    public int numTeams(int[] arr) {
        
        final int n = arr.length;
        int count = 0;
        
        for(int i = 0;i < n-2; i++)
        {
            for(int j = i+1;j < n-1; j++)
            {
                for(int k = j+1;k < n;k++)
                {
                    if(isLesser(arr[i], arr[j], arr[k]))
                    {
                      count++;  
                    }
                    if(isGreater(arr[i], arr[j], arr[k]))
                    {
                        count++;
                    }
                }
            }
        }
        
        return count;
        
    }
    
    public static boolean isGreater(int i, int j, int k)
    {
        return i < j && j < k;
    }
    
    public static boolean isLesser(int i, int j, int k)
    {
        return i > j && j > k;
    }
}
