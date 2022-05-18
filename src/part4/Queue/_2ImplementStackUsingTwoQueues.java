package part4.Queue;

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
            throw mew QueueEmptyException("Underflow Exception");
        return queue1.remove();
    }
}
