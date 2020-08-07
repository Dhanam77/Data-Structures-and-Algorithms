package Heap;

public class MinHeap {
	
	int[] heap;
	int size;
	int capacity;
	
	MinHeap(int cap){
		capacity = cap;
		heap = new int[cap+1];
		size = 0;
	}
	
	public int getParent(int index) {
		return (index-1)/2;
	}
	public int getLeftChild(int index) {
		return (2*index)+1;
	}
	public int getRightChild(int index) {
		return (2*index)+2;
	}
	
	public void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}
	
	public void insert(int data) {
		if(size == capacity) {
			throw new RuntimeException("Heap Full");
		}
		size++;
		int pos = size;
		heap[pos] = data;
		//O(logn)
		while(heap[pos] < heap[getParent(pos)]) {
			swap(pos,getParent(pos));
			pos = getParent(pos);
		}
	}
	
	public int getMinElement() {
		if(size == 0) {
			throw new RuntimeException("Heap is empty");
		}
		return heap[0];
	}
	
	public int removeMin() {
		int toBeRemoved = heap[0];
		heap[0] = heap[size];
		heap[size] = 0;
		size--;
		heapify(0);
		return toBeRemoved;
	}
	
	public boolean isLeafNode(int pos) {
		if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
	}
	
	public void heapify(int pos) {
		
		if(isLeafNode(pos)) {
			return;
		}
		if(getLeftChild(pos) < heap[pos] || getRightChild(pos) < heap[pos]) {
			if(getLeftChild(pos) < getRightChild(pos)) {
				swap(getLeftChild(pos), pos);
				heapify(getLeftChild(pos));
			}
			else {
				swap(getRightChild(pos), pos);
				heapify(getRightChild(pos));
			}
		}
	} 
	public void print() 
    { 
        for (int i = 0; i < size / 2; i++) { 
            System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + 
            		heap[2 * i + 1] + " RIGHT CHILD :" + heap[2 * i + 2]); 
            System.out.println(); 
        } 
    } 
	
	
	public static void main(String[] args) {
		
		
		MinHeap minheap = new MinHeap(10);
		minheap.insert(2);
		minheap.insert(4);
		minheap.insert(1);
		minheap.insert(3);
		minheap.insert(5);
		minheap.insert(6);
		minheap.insert(8);
		minheap.insert(7);minheap.insert(10);
		minheap.insert(11);
		
		System.out.println(minheap.getMinElement());
		System.out.println(minheap.removeMin());
		System.out.println(minheap.getMinElement());
		//minheap.print();
		for(int i = 0;i < minheap.heap.length; i++) {
			System.out.print(minheap.heap[i] + " ");
		}
	}

}
