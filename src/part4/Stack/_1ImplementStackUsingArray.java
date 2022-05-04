package part4.Stack;
//last in first out
public class _1ImplementStackUsingArray {
    int size;
    int arr [];
    int top;

    _1ImplementStackUsingArray(int size){
        this.size = size;
        this.arr = arr;
        this.top = -1;
    }
    public void push(int pushedElement){
        if (!isFull()){
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed Element: "+pushedElement);
        }else {
            System.out.println("Stack is full!!");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int returnedTop = top;
            top--;
            System.out.println("Popped Element: "+ arr[returnedTop]);
            return arr[returnedTop];
        }else {
            System.out.println("Stack is empty!!");
            return -1;
        }
    }
    public int peek(){
        if (!this.isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty!!!");
            return -1;
        }
    }
    public boolean isEmpty() {
        return (top == - 1);
    }
    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        _1ImplementStackUsingArray stackCustom = new _1ImplementStackUsingArray(10);
        stackCustom.pop();
        System.out.println("=====================");
        stackCustom.push(10);
        stackCustom.push(30);
        stackCustom.push(50);
        stackCustom.push(40);
        System.out.println("=====================");
        stackCustom.pop();
        stackCustom.pop();
        stackCustom.pop();
        System.out.println("=====================");

    }
}
