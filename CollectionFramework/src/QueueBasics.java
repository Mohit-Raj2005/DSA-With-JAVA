import java.util.LinkedList;
import java.util.Queue;


//Queue immplementation using linkedlist() interface
public class QueueBasics {
    static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        //add()-> adds element and returns true if successful else exception
        q1.add(1);
        q1.add(2);
        q1.add(3);

        //offer()-> adds element and returns true if successful else false
        q1.add(4);
        q1.add(5);
        System.out.println("Original Queue:"+q1);

        //element()-> returns the head and throws exception if empty
        System.out.println("Using element():"+q1.element());

        //peek()-> returns head and null if empty
        System.out.println("Using peek():"+q1.peek());

        //remove()-> removes and returns the head element and exception if enmpty
        System.out.println("Removed using remove():"+q1.remove());
        System.out.println("Queue after removal:"+q1);

        //poll()->removes and returns the head element and returns null if enmpty
        System.out.println("Removed using poll():"+q1.poll());
        System.out.println("Queue after poll:"+q1);

        //we will use offer(), peek() and poll() mostly to avoid exceptions

    }

}
