import java.util.Arrays;

public class PrintExtremeElementsOfArray {
    //printing extreme elements of an array or we can say that printing elements from beginning and ending of the array
//    static void PrintExtremes(int[] arr){
//        for(int i=0;i<arr.length;i++){     //iterating each element of the array
//            if(i==(arr.length)/2){        //Breaking on reaching the mid of the array
//                System.out.print(arr[i]+",");    // printing the mid element of the array when we have printed all the other extremes
//                break;
//            }
//            System.out.print(arr[i]+",");    // printing from the front extreme
//            System.out.print(arr[arr.length-i-1]+",");  // printing from the end extreme
//        }
                                  //THIS FUNCTION HAS A BUG SO SOLVING THIS BY THE CLASSICAL TWO POINTER APPROACH
//    }
//    static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        System.out.println("Original Array:"+ Arrays.toString(arr));
//        System.out.println("Printing Extremes Of array:");
//        PrintExtremes(arr);
//
//    }



    static void printExtremeElemArray(int[] arr){
        int left=0,right=arr.length-1;   //defining two variables for the end and starting
        while(left<right){              //running the loop untill the left crosses the right
            System.out.print(arr[left]+","+arr[right]+",");
            left++;      //moving left variable by incrementing
            right--;     //moving right variable by decrementing
            if(left==right){
                System.out.print(arr[left]);    //when the left reaches the right printing the element and breaking the loop
                break;
            }
        }      //this method works for both even and ood input values of the array
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Initial Array:"+Arrays.toString(arr));
        System.out.println("Printing the extreme elements of the array:");
        printExtremeElemArray(arr);

    }
}
