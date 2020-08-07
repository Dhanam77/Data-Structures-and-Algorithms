import java.util.*;
import java.io.*;

public class ModifiedSubArray {


	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] res = new int[t];
        int k = 0;
        while(t-- > 0) {
            String[] values = br.readLine().split(" ");
            int N = Integer.parseInt(values[0]);
            int x = Integer.parseInt(values[1]);
            int[] arr = new int[N];

            for(int i = 0;i < N; i++) {
            	arr[i] = Integer.parseInt(br.readLine());
            }
            
            res[k++] = getSum(N,x, arr);
            
            
        }
        for(int i = 0;i < res.length; i++) {
        	System.out.println(res[i]);
        }

        
	}

	private static int getSum(int n, int x, int[] arr) {
		
		
		
		
		//Normal
		int sum = arr[0];
		int maxSum = sum;
		for(int i = 0;i < n; i++) {
			sum = Math.max(arr[i], sum+arr[i]);
			maxSum = Math.max(sum, maxSum);
		}
		
		
		return maxSum;
	}
} 