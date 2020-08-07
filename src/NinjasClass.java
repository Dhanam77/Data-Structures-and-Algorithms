import java.util.*;
import java.io.*;

public class NinjasClass {


	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<List<Long>> res = new ArrayList<>();
        for(int i = 0;i < t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int[] arr = new int[n];
        	List<Long> list = new ArrayList<>();
        	for(int j = 0;j < n; j++) {
        		arr[j] = Integer.parseInt(br.readLine());
        	}
        	
        	list.addAll(getAllMoney(n,arr));
        	res.add(list);
        }
        
        for(List<Long> ans: res) {
        	for(int i = 0;i < ans.size(); i++) {
        		System.out.print(ans.get(i) + " ");
        	}
    		System.out.println();

        }
        
	}

	private static List<Long> getAllMoney(int n, int[] arr) {
		List<Long> res = new ArrayList<>();
		
		for(int i = 0;i < n; i++) {
			long sum = 0;
			
			List<Integer> factors = getFactors(i+1);
			for(int j = 0;j < factors.size(); j++) {
				sum += arr[factors.get(j)-1];
			}
			res.add(sum);
		}
		return res;
		
	}

	private static List<Integer> getFactors(int n) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		 for (int i=1; i<=Math.sqrt(n); i++) 
	        { 
	            if (n%i==0) 
	            { 
	                if (n/i == i) 
	                	 l.add(i);
	                else
	                { 
	                	 l.add(i);
	                    l.add(n/i); 
	                } 
	            } 
	        }
		 
		 return l;
	}
}