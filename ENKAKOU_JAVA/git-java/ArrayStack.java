public class ArrayStack {
	public static void main(String[] args) {
		
	}
	

    private int size;         // 数组大小
    private int[] stack;      // 数组
    private int top = -1;     // 栈顶在数组为空时，值为-1
 
    public ArrayStack(int initialSize) {
        // 保证数组大小为正
    	
        if (initialSize <= 0)
            throw new RuntimeException("The size should be positive");
        
        this.size = initialSize;     
        stack = new int[initialSize];
    }
 
    // // 通过栈顶所在位置判断数组是否已满或为空
    public boolean isFull() { return top == size - 1; }   
 
    public boolean isEmpty() {
        return top == -1;
    }
 
    public void push(int value) {
    	
        // 如果数组已满，先调整大小
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
        // 定义一个大小为原数组两倍的新数组
    	
        int[] newArray = new int[size * 2];
 
        // 复制原数组的数据至新数组
        for (int i=0; i<size; i++)
            newArray[i] = stack[i];
        stack = newArray;
    }
 
    public void clear() {
        int[] newArray = new int[top+1];
        stack = newArray;
    }
}