import java.util.Arrays;

//Main Logic ----> placing the minimum value element at its correct position through multiple rounds of iterations
public class SelectionSort {  //T.C---->>O(n2)
    static void selectionSort(int[] arr){
        int minIndex;
        int n = arr.length;
        for(int i = 0; i<n-1;i++){   //outer loop for rounds
            minIndex = i;
            for(int j = i+1;j<n;j++){  // inner loop for comparision of arr[j] and arr[minIndex]
                if(arr[j]<arr[minIndex]){
                    minIndex = j;    //updating the minIndex according to the smallest element wrt to increasing j and the traversed array
                }
            }
            //swapping the minimum value element with the current element i.e, value at current iteration of the outer loop
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr ={9,5,7,3,1,4,2};
        System.out.println("Before sorting :"+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sorting using selection sort:"+ Arrays.toString(arr));
    }
}
