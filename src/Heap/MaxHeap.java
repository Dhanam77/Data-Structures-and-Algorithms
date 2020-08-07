package Heap;

public class MaxHeap {

	int[] maxHeap;
	int capacity;
	int size = 0;
	
	MaxHeap(int capacity){
		this.capacity = capacity;
		this.size = 0;
		maxHeap = new int[capacity];
	}
	
	public int parent(int pos) {
		return (pos-1)/2;
	}
	
	public int leftChild(int pos) {
		return 2*pos+1;
	}
	public int rightChild(int pos) {
		return 2*pos+2;
	}
	
	void insert(int element) {
		int current = size;
		maxHeap[size++] = element;
		while(maxHeap[current] > maxHeap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		
	}
	
	void swap(int a, int b) {
		int temp = maxHeap[a];
		maxHeap[a] = maxHeap[b];
		maxHeap[b] = temp;
	}
	
	public int getMax() {
		return maxHeap[0];
	
	}
	
	public int extractMax() {
		int max = getMax();
		
		maxHeap[0] = maxHeap[size];
		maxHeap[size--] = 0;
		 
		heapify(0);
		
		return max;
		
		
	}
	
	public void heapify(int pos) {
		if(isLeaf(pos)) {
			return;
		}
		
		if(maxHeap[pos] < maxHeap[leftChild(pos)] 
				|| maxHeap[pos] < maxHeap[rightChild(pos)]) {
			if(maxHeap[leftChild(pos)] < maxHeap[rightChild(pos)]) {
				swap(pos, rightChild(pos));
				heapify(rightChild(pos));
			}
			else {
				swap(pos, leftChild(pos));
				heapify(leftChild(pos));
			}
		}
		
		
	}
	
	public boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
	
	 public void print() 
	    { 
	        for (int i = 0; i < size / 2; i++) { 
	            System.out.print(" PARENT : " + maxHeap[i] + " LEFT CHILD : " + 
	                      maxHeap[2 * i + 1] + " RIGHT CHILD :" + maxHeap[2 * i + 2]); 
	            System.out.println(); 
	        } 
	    } 
	
	
	
	public static void main(String[] args) {
		
		MaxHeap maxheap = new MaxHeap(15);
		 	maxheap.insert(5); 
	        maxheap.insert(3); 
	        maxheap.insert(17); 
	        maxheap.insert(10); 
	        maxheap.insert(84); 
	        maxheap.insert(19); 
	        maxheap.insert(6); 
	        maxheap.insert(22); 
	        maxheap.insert(9); 
		
		
	        maxheap.print(); 
	        System.out.println("The max val is " + maxheap.extractMax()); 
	} 	
	
}
