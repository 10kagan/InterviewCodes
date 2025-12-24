package Chain100Days;

import java.util.Stack;

public class SortStackRecursively {
    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        insertSorted(stack, top);
    }

    public static void insertSorted(Stack<Integer> stack, int value){
        if (stack.isEmpty() || value >= stack.peek()){
            stack.push(value);
            return;
        }
        int temp = stack.pop();

        insertSorted(stack, value);

        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println(stack); // [1, 2, 3, 4] (bottom → top)
    }
}

// Sort a stack using recursion