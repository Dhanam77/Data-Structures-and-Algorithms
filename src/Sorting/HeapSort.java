package Sorting;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] arr = {3,2,5,3,7,5,1};
		heapsort(arr, arr.length);
	}
	
	public static void heapsort(int[] arr ,int n) {
		int[] heap = new int[n];
		for(int i = 0;i < n; i++) {
			heapify(heap,arr[i]);
		}
		
	}
	public static void heapify(int[] heap, int element) {
		
	}

}
