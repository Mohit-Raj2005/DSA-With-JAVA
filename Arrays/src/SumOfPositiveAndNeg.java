import java.util.Arrays;

public class SumOfPositiveAndNeg {
    //finding the sum of positive and negative numners in an array
    static void sumPositiveAndNeg(int[] arr){
        int sumPositive=0;  //initialising variable for positive number sum
        int sumNegative=0;  //initialising variable for negative number sum
        for(int i=0;i<arr.length;i++){  //traversing each element of the array
            if(arr[i]<=0){              //assuming the array will have atleast 1 element
                sumNegative+=arr[i];  //adding the negative numbers
            }
            else{
                sumPositive+=arr[i];  //adding the negative numbers
            }
        }
        System.out.println("Sum of positive numbers of array:"+sumPositive);
        System.out.println("Sum of negative numbers of array:"+sumNegative);
    }

    static void main(String[] args) {
        int[] arr={-5,-4,-3,-2,-1,0,1,2,3,4,5};
        System.out.println("Array:"+ Arrays.toString(arr));
        sumPositiveAndNeg(arr);

    }
}
