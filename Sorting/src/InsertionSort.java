import java.util.Arrays;

//Main logic----> whichever element is to be inserted, is compared with the elements of the present sorted subarray and after shifting and determination of the correct position of the element... it is inserted at that correct position
public class InsertionSort {
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            int current = i;
            int prev = i-1;
            int currentVal = arr[current];
            while(prev>=0 && currentVal<arr[prev]){    // checking prev represents a valid index and comparing currentValue is less than the value at the previous index
                arr[prev+1] = arr[prev];     //shifting logic
                prev--;           // moving prev backward but keeping in mind that it represents a valid index
            }
            arr[prev+1] = currentVal;   // placing the current value at the index next to prev i.e, prev+1 because after shifting elements... the correct value of the currentValue would be at prev+1 index
        }
    }

    public static void main(String[] args) {
        int[] arr ={9,5,7,3,1,4,2};
        System.out.println("Before sorting :"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sorting using insertion sort:"+ Arrays.toString(arr));

    }
}
