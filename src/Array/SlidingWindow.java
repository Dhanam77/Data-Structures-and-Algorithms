package Array;

public class SlidingWindow {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,6,5,4,6,7,3};
		int k = 3;
		//3 6 6 6 6 7 3
		int start = 0, end = 0;
		for(int i = start;i < arr.length; i++) {
			if(end-start < k-1) {
				end++;
				continue;
			}
			
			
		}
		
	}

}
