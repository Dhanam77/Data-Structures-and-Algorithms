package Array;

import java.util.*;

class LuckyNumber {
    public int findLucky(int[] arr) {
        
        final int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0;i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(map.get(arr[i]),1));            
        }
        
        
        int res = -1;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == entry.getValue())
            {
                res = entry.getKey();
            }
        }
        
        
        return res;
    }

}
