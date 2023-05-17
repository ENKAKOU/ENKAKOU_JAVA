public class ArrayStack {
	public static void main(String[] args) {
		
	}
	

    private int size;
    private int[] stack;     
    private int top = -1;    
 
    public ArrayStack(int initialSize) {
        if (initialSize <= 0)
            throw new RuntimeException("The size should be positive");
        
        this.size = initialSize;     
        stack = new int[initialSize];
    }

    public boolean isFull() { return top == size - 1; }   
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public void push(int value) {
    	
        if (isFull()) {
            resize();
        }
 
        top++;
        stack[top] = value;
    }
 
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty now");
        }
 
        int value = stack[top--];
        return value;
    }
 
    public void print() {
        if (isEmpty()) {
            System.out.println("The stack is empty now");
            return;
        }
 
        for (int i=top; i>=0; i--) {
            System.out.printf("stack[%d] = %d\n", i, stack[i]);
        }
    }
 
    public void resize() {
      
        int[] newArray = new int[size * 2];
        for (int i=0; i<size; i++)
            newArray[i] = stack[i];
        stack = newArray;
    }
 
    public void clear() {
        int[] newArray = new int[top+1];
        stack = newArray;
    }
}
