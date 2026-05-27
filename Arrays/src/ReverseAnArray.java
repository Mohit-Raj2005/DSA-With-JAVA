import java.util.Arrays;

public class ReverseAnArray {
    //Reverse the elements of an array
    static int [] ReverseArr(int[] arr){
        for(int i=0; i<arr.length/2; i++){    //iterating till half length of the array
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];     //main swapping logic
            arr[arr.length-i-1]=temp;
        }
        return arr;
    }

    //another method to reverse the array
    // Classical 2 pointer dsa syntax
    static int[] RevArr(int[] arr){
            int i=0;   //initialising the first variable
            int j=arr.length-1;    //initialising the second variable
            while(i<=j){   //looping till the starting variable is lesser than the end variable
                int temp=arr[i];
                arr[i]=arr[j];    //main swapping logic
                arr[j]=temp;

                i++;   //incrementing the starting variable
                j--;   //decrementing the end variable towards the starting variable
            }
            return arr;
    }
    public static void main(String[] args) {
            int[] arr={1,2,3,4,45,32,89,100,55,5};
        System.out.println("Array before reverse:"+ Arrays.toString(arr));
        ReverseArr(arr);
        System.out.println("Array after reverse:"+ Arrays.toString(arr));
        RevArr(arr);
        System.out.println("Again Applying the RevArr method to reverse the array:"+Arrays.toString(arr));
    }
}
