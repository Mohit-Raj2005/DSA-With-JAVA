import java.lang.reflect.Array;
import java.util.Arrays;

//sorting array in ascending or descending order using our custom comparator

//another sorting logic defined in ArraySortReverseComp class by implementing comparator interface for descending order
public class ArraySortComparator {
    public static void main(String[] args) {
        Integer[] arr = {1,9,5,7,6,4,3};

        // the below method is just for sorting in ascending order without custom comparator
//        Arrays.sort(arr);
//        System.out.println("Ascending order:");
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }


        // this is another method of sorting in reverse order by making custom comparator
        Arrays.sort(arr,new ArraySortReverseComp());
        System.out.println("Descending Order:");
        for (int i : arr) {
           System.out.print(i+" ");
        }

    }
}
