package Deque;

import java.util.*;
import java.util.Deque;

public class LRUCache {

	
	//1 2 3 1 4 5
	//SIZE = 3
	//Queue  5 4 1    
	
	private static int CACHE_SIZE;
	private Set<Integer> set;
	private Deque<Integer> queue;
	
	
	LRUCache(){
		CACHE_SIZE = 10;
		set = new HashSet<>();
		queue = new ArrayDeque<>();
	}
	
	LRUCache(int capacity){
		CACHE_SIZE = capacity;
		set = new HashSet<>();
		queue = new ArrayDeque<>();
	}
	
	
	public void display() {
		Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
	}
	
	public void refer(int page) {
		//if already is cache, move it to front
		if(set.contains(page)) {
			queue.remove(page);
		}
		//not in cache, check the size
		else if(queue.size() == CACHE_SIZE) {
			int leastUsed = queue.removeLast();
			set.remove(leastUsed);
		}
		queue.addFirst(page);
		set.add(page);
	}
	
		
	public static void main(String[] args) {
		
		LRUCache cache = new LRUCache(10);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.display();
		cache.refer(1);
		cache.display();

		cache.refer(4);
		cache.refer(5);
		cache.display();
		
	}
	
	
}
