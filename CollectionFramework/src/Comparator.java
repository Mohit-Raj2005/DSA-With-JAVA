import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Custom comparision or custom sorting logic of objects
public class Comparator {
   public static void main(String[] args) {

        List<Student2> Students=new ArrayList<Student2>();
        Students.add(new Student2(21,"Rahul",45));
        Students.add(new Student2(22,"Ram",38));
        Students.add(new Student2(19,"Aaku",40));
        //we want to sort this array list of students in our custom way
        System.out.println(Students);

        //we cant sort this list directly thus we will have to implement Comparable interface in our Student2.java file

        Collections.sort(Students,new WeightComparator());
        System.out.println(Students);
    }
}
