package part4.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _2ImplementStackUsingTwoQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    _2ImplementStackUsingTwoQueues(){
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    public void push(int i){
        if (queue1.size() == 0)
            queue1.add(i);
        else {
            int sizeOfQueue1 = queue1.size();
            for (int j = 0; j < sizeOfQueue1; j++){
                queue2.add(queue1.remove());
            }
            queue1.add(i);
            for (int k = 0; k < sizeOfQueue1; k++){
                queue1.add(queue2.remove());
            }
        }
    }
    public int pop(){
        if (queue1.size() == 0)
            throw new QueueEmptyException("Underflow Exception");
        return queue1.remove();
    }

    public static void main(String[] args) {
        _2ImplementStackUsingTwoQueues stack = new _2ImplementStackUsingTwoQueues();
        stack.push(20);
        stack.push(40);
        stack.push(70);
        stack.push(50);
        stack.push(90);
        stack.push(110);
        stack.push(30);
        System.out.println("Removed element : "+ stack.pop());
        stack.push(170);
        System.out.println("Removed element : "+ stack.pop());
    }
}
class QueueEmptyException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }
}