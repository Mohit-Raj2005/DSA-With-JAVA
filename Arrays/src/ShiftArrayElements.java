import java.util.Arrays;

public class ShiftArrayElements {

    //shifting the elements of an array by 1 in a cyclic manner
    static int[] ShiftArrayElementsBy1(int[] arr)
    {
        int temp=arr[arr.length-1];  //storing the last element of the array in a temporary variable
        for(int i=arr.length-1;i>0;i--){        //iterating the loop from the end and going till 1 index
            arr[i]=arr[i-1];   //shifting the previous element to the next index
        }
        arr[0]=temp;  //storing the last element stored in the temp variable in the 0th index or the starting of the array to maintain the cyclic order
        return arr;
    }

   public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
       System.out.println("Array before shifting"+ Arrays.toString(arr));
       ShiftArrayElementsBy1(arr);
       System.out.println("Array after shifting"+ Arrays.toString(arr));

    }
}
