import java.util.Arrays;

public class MaxElementInArray {
    //find the maximum element in an array
    static int maxElement(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){   //logic of comparing each element and updating the max
                max=arr[i];   //assuming that our array will atleast have 1 element
            }
        }
        return max;
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,45,32,89,100,55,5};
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Maximum element in the array: "+maxElement(arr));
    }

}
