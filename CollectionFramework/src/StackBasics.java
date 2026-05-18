import java.util.ArrayDeque;
import java.util.Deque;

//Stack implementation using ArrayDequeue
public class StackBasics {
    static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack:"+stack);

        stack.pop();
        System.out.println("Stack pop():"+stack);

        System.out.println("Peek:"+stack.peek());
    }
}
