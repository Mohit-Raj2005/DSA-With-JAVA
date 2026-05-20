import java.util.Comparator;

public class WeightComparator implements Comparator<Student2> {


    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.weight - o2.weight;

        //another method of defining our sorting logic
        //return Integer.compare(o1.weight, o2.weight);
        // direct implementation of compare() is possible
    }
}
