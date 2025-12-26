package Chain100Days;

public class ArrayStack {

    private int [] stack;
    private int top;
    private int capacity;

    public ArrayStack (int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1; // stack boş
    }
    public void push(int value){
        if (top == capacity - 1){
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = value;
    }

    public int pop () {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    public int peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}

// Implement a Stack using Array