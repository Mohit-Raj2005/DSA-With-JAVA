import java.util.HashSet;
import java.util.Set;

//Set implementation using HashSet
public class HashSetBasics {
    static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        //order of insertion not preserved
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Original Set :"+set1);


        Set<Integer> set2 = new HashSet<>();

        //order of insertion not preserved
        set2.add(10);
        set2.add(20);
        set2.add(1);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Original Set :"+set2);

        //retainAll()-> set1 aur set2 ka intersection store hoga
        set1.retainAll(set2);
        System.out.println("Set1 intersection set2:"+set1);

        //containsAll()-> returns true if one set contains all the elements of another set else false
        System.out.println("Set1 contains all elements of set2:"+set1.containsAll(set2));
        System.out.println("Set2 contains all elements of set1:"+set2.containsAll(set1));






    }
}
