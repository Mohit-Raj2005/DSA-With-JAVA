import java.util.Arrays;

public class PrintExtremeElementsOfArray {
    //printing extreme elements of an array or we can say that printing elements from beginning and ending of the array
    static void PrintExtremes(int[] arr){
        for(int i=0;i<arr.length;i++){     //iterating each element of the array
            if(arr[i]==arr[arr.length-i-1]){        //Breaking on reaching the mid of the array
                System.out.println(arr[i]);    // printing the mid element of the array when we have printed all the other extremes
                break;
            }
            System.out.print(arr[i]+",");    // printing from the front extreme
            System.out.print(arr[arr.length-i-1]+",");  // printing from the end extreme
        }
    }
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array:"+ Arrays.toString(arr));
        System.out.println("Printing Extremes Of array:");
        PrintExtremes(arr);

    }
}
