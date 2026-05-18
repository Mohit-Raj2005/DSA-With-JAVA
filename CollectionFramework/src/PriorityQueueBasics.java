import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //max heap -> INtegers-> high value -> high priority

        //offer()
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Original Priority Queue"+pq);

        //pq -> strings -> comparator

        // Default---->>>>  Smallest integer have the highest priority by default in case of integers
        //poll()-> returns and remove having the highest priority element
        System.out.println("Having most priority :"+pq.poll());
        System.out.println("Having most priority :"+pq.poll());
        System.out.println("Having most priority :"+pq.poll());


    }
}
