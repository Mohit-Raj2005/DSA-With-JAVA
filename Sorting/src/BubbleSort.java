import java.util.Arrays;

//Main Logic -----> placing the largest element at its correct position through multiple rounds of iterations
public class BubbleSort {
    static void bubblesort(int[]array){  //T.C----> O(n2)
        int m = array.length;
        for(int i =0;i<m-1;i++){  //number of rounds
            for(int j=0;j<m-i-1;j++){
                if(array[j]>array[j+1]){  // comparing neighbouring elements
                    //swap if the next element is greater than the current element
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {6,5,1,3,9,7};
        System.out.println("Original array: "+ Arrays.toString(array));
        bubblesort(array);
        System.out.println("Sorted array using bubble sort: "+ Arrays.toString(array));
    }
}
