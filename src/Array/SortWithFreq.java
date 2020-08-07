package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SortWithFreq {
	
	public static void main(String[] args) {
		int[] arr = {2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5};
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0;i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			pq.add(entry);
		}
		List<Integer> list = new ArrayList<>();
		
		while(!pq.isEmpty()) {
			int val = pq.poll().getKey();
			list.add(val);
		}
		
		for(int a : list) {
			System.out.print(a + " ");
		}
		
	}

}
