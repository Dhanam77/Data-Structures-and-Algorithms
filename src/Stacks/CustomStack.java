package Stacks;

class CustomStack {

    int top = -1;
    int[] arr;
    int maxSize;
    
    public CustomStack(int maxSize) {
        
        arr = new int[maxSize];
        this.maxSize = maxSize;

    }
    
    public void push(int x) {
		if(top == maxSize - 1)
        {
             return;

        }
        else
        {
            arr[++top] = x;
        }
    }
    
    public int pop() {
        if(top < 0)
		{
		
			return -1;
			
		}
		
		else
		{
			return arr[top--];
		}
    }
    
    public void increment(int k, int val) {
        
        if(k > maxSize)
        {
           for(int i = 0;i < arr.length; i++)
            {
            arr[i] += val;
            } 
        }
        else
        {
            for(int i = 0;i < k; i++)
            {
            arr[i] += val;
            }
        }
       
        
        
    }
}