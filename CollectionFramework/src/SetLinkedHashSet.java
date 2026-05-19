import java.util.LinkedHashSet;
import java.util.Set;

//set implementation using LinkedHashSet
public class SetLinkedHashSet {
    static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        //Insertion Order is Preserved in Linked Hash Set and duplicates are not allowed
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
