package Sorting;

public class Sort012 {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,0,1,2,2,1,1,2,2};
		
		
		int left = 0, right = arr.length - 1;
		int i = 0;
		while(i <= right) {
			if(arr[i] == 1) {
				i++;
				continue;
			}
			else if(arr[i] == 2) {
				int temp = arr[i]; 
				arr[i] = arr[right];
				arr[right] = temp;
				right--;
			}
			else {
				int temp = arr[i];
				arr[i] = arr[left];
				arr[left] = temp;
				left++;
				i++;
			}
			for(int k = 0;k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		for(int k = 0;k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
