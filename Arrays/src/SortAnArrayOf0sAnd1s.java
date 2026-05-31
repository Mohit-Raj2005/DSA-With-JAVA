//Given an array consisting of only 0s and 1s. write a function to sort this array so that all 0s are placed before any 1s .
//this is achieved in an efficient manner with optimal use of time and space resources and returning the sorted array
//input=[0,1,0,1,0,1,0,1]
//output=[0,0,0,0,1,1,1,1]   //linear  traversal approach//

import java.util.Arrays;

public class SortAnArrayOf0sAnd1s {
    static int[] SortAnArrayOf0sAnd1s(int[] arr)
    {
        //we are solving using two pointer method
        int n=arr.length;   //initialising n with length of the array
        int i=0;           //initialising left pointer i with 0
        int j=n-1;         //initialising right pointer j with n-1
        while(i<j){        //checking untill i crosses j or i < j
            if(arr[i]==1 && arr[j]==0){    //checking if left element is 1 and right element is 0
                arr[i]=0;     //making the left element 0 and the right element 1
                arr[j]=1;
            }
            if(arr[i]==0){
                // move i by 1 towards right by incrementing
                i++;
            }
            if(arr[j]==1){
                //move j by 1 towards left by decrementing
                j--;
            }
        }
        return arr;   //returning the sorted array
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,0,1,1,1,0,1,0,1,0};
        System.out.println("Original Array:"+ Arrays.toString(arr));
        System.out.println("Sorted Array of 0s and 1s:"+Arrays.toString(SortAnArrayOf0sAnd1s(arr)));
    }

}
