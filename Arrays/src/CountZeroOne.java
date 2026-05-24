import java.lang.reflect.Array;
import java.util.Arrays;

public class CountZeroOne {
    //count the number of zeros and ones in the array
    static void countZeroOne(int[] arr) {
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i < arr.length; i++) {  //traversing each element of the array
            if (arr[i] == 0) {
                countZero++;  //counting the number of zeroes in the array
            }
            else if (arr[i]==1) {
                countOne++;  //counting the number of 1 in the array
            }
        }
        System.out.println("Number of 0 elements in array: " + countZero);
        System.out.println("Number of 1 elements in array: " + countOne);
    }

    static void main(String[] args) {
        int[] arr = {20,0,9,0,1,0,1,5,7};
        System.out.println("Array:"+ Arrays.toString(arr));
        countZeroOne(arr);
    }
}
