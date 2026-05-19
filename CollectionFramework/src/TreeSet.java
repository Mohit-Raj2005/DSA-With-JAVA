import java.util.LinkedHashSet;
import java.util.Set;

//set implementation using tree set but in this it is in sorted order
public class TreeSet {
    static void main(String[] args) {

        //HashSet -> O(1)
        // LinkedHashSet -> O(n)
        // TreeSet -> O(log(n))   SORTED ORDER
        Set<Integer> set = new java.util.TreeSet<>();

        //SORTED ORDER : duplicates are not allowed
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(60);
        set.add(60);
        set.add(70);
        set.add(80);
        System.out.println("Original Set :"+set);
    }
}
