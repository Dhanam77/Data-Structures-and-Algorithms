package Queue;

import java.util.Queue;
import java.util.*;
public class StackUsingQueue {
	
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	int size = 0;
	
	//TODO Add size
	public void pushCostly(int data) {
		//If queue is empty, directly push inside queue
		if(queue1.isEmpty()) {
			queue1.offer(data);
		}
		else {
			//First empty the queue
			while(!queue1.isEmpty()) {
				queue2.offer(queue1.poll());
			}
			//Add the newest element so it is removed first on poll
			queue1.offer(data);
			//Add other elements back again
			while(!queue2.isEmpty()) {
				queue1.offer(queue2.poll());
			}		
		}
	}	
	public void push(int data) {
		queue1.offer(data);
	}
	
	//Last element is at last place, so remove all and pop
	public int popCostly() throws Exception{
		if(queue1.isEmpty()) {
			throw new Exception();
		}
		while(queue1.size() >= 2) {
			queue2.offer(queue1.poll());
		}
		int toBeRemoved = queue1.poll();
		Queue temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		return toBeRemoved;
	}
	
	//Last element in kept at first position
	public int pop() throws Exception {
		if(queue1.isEmpty()) {
			throw new Exception("Stack already empty");
		}
		return queue1.poll();
	}
	
	public void show() {
		Iterator<Integer> it = queue1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
