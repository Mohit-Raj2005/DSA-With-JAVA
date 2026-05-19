import java.util.HashSet;
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

        //Hashset for Student or for custom class
        // we need to override equals() and hashcode() so that they treat duplicate objects as same
        Set<Student> set2 = new HashSet<>();
        Student S1 = new Student(20, "John");
        Student S2 = new Student(20, "John");
        Student S3 = new Student(20, "John");
        set2.add(S1);
        set2.add(S2);
        set2.add(S3);
        System.out.println("Original Student Set :"+set2);
    }
}
