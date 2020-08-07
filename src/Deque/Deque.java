package Deque;

import java.util.Iterator;

public class Deque<Integer> implements Iterable<Integer> {
	
	Collections
	 List<Integer> a= new ArrayList<>();
	int[] arr;
	int size;
	int front, last;
	
	// construct an empty deque
	
    public Deque()
    {
    	arr = new int[20];
    	size = 0;
    	front = 0;
    	last = 0;
    }

    // is the deque empty?
    public boolean isEmpty()
    {
    	return size == 0;
    }

    // return the number of items on the deque
    public int size()
    {
    	return size;
    }

    // add the item to the front
    public void addFirst(int item)
    {
    	if(size == 0) {
        	arr[front] = item;
    		
    	}
    }

    // add the item to the back
    public void addLast(int item)
    {
    	
    }

    // remove and return the item from the front
    public int removeFirst()
    {
    	
    }

    // remove and return the item from the back
    public int removeLast()
    {
    	
    }

    // return an iterator over items in order from front to back
    public Iterator<int> iterator()
    {
    	
    }

    // unit testing (required)
    public static void main(String[] args)
    {
    	
    }

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
