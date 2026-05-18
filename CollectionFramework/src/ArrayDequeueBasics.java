import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//for doubly ended queue we have to add Dequeue<Integer> as a reference
public class ArrayDequeueBasics {
    static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<Integer>();

        q1.offer(1);
        q1.offer(2);
        //offerFirst()-> adds element to the first
        q1.offerFirst(3);

        //offerLast()-> adds element to the Last
        q1.offerLast(4);
        System.out.println("Double ended Queue:"+q1);

        //peekFirst() and peekLast()
        System.out.println(  "peekFirst(): "+q1.peekFirst());
        System.out.println(  "peekLast(): "+q1.peekLast());

        //pollFirst()-> removes element from first
        System.out.println(  "pollFirst(): "+q1.pollFirst());
        //pollLast()-> removes element from last
        System.out.println(  "pollLast(): "+q1.pollLast());

        System.out.println("Final queue:"+q1);
    }

}
