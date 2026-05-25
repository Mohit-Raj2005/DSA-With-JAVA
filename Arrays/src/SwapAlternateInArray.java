import java.util.Arrays;

public class SwapAlternateInArray {
    //swapping alternate elements in an array
    // we are swapping in the same array and not using any extra array for storing the swapped array elements

    static  int[] SwappElements(int[] arr){
        int i=0;
        while((i<arr.length-1)){  //iterating the array untill we reach the last index of the array
            int temp=arr[i]; //storing the current index element in temporary variable
            arr[i]=arr[i+1];  //swapping logic
            arr[i+1]=temp;
            i+=2; // incrementing the index by 2
        }
        return arr;
    }
    static void main(String[] args) {
        int[] arr={1,2,5,4,9};
        System.out.println("Array before swapping:"+ Arrays.toString(arr));
        SwappElements(arr);
        System.out.println("Array after swapping:"+ Arrays.toString(arr));

    }
}
