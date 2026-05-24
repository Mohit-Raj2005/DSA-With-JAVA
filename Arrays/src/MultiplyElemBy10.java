import java.util.Arrays;

public class MultiplyElemBy10 {
    //multiplying each element of an array by 10

    static int[] MulBy10(int[] arr){
        for(int i=0;i < arr.length;i++){ //accessing each element of the array and multiplying each element by 10
            arr[i]=arr[i]*10;
        }
        return arr;  //we are updating the elements of the same array and we can also create a new array and store the multiplied element into the new array
    }
    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Arrays before multiplying by 10:"+Arrays.toString(arr));
        MulBy10(arr);
        System.out.println("Arrays After multiplying by 10"+Arrays.toString(arr));
    }
}
