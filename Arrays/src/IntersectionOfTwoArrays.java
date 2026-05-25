import java.util.Arrays;

public class IntersectionOfTwoArrays {

    // printing the intersection of two array
    static void IntersectionArray(int[] arr1, int[] arr2) {

        for(int i=0;i<arr1.length;i++){    //iterating till the length of the first array
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){    // comparing the element of the first array with each element of array 2
                    System.out.print(arr1[i]+",");   //printing the common intersection elements
                }

            }
        }
    }
    static void main(String[] args) {
        int[]  arr1={1,2,5,4,9};
        int[] arr2={9,5,7,8,3,4,9,99,12,25};
        System.out.println("Array 1:"+ Arrays.toString(arr1));
        System.out.println("Array 2:"+ Arrays.toString(arr2));
        System.out.println("Intersection Elements of the above two arrays:");
        IntersectionArray(arr1,arr2);

    }
}
