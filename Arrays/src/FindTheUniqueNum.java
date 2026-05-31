import java.util.Arrays;

//LEET-CODE [Q.136](Single Number)
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Input: arr = [4,1,2,1,2]
//Output: 4
//concept-> 4^1^2^1^2=4 || similar elements 1 and 2 will get cancelled out and 4 will be returned
public class FindTheUniqueNum {
    static int findUnique(int[] arr){
        int value=0;
        for (int i=0;i<arr.length;i++){
            value=value^arr[i];
            // concept---->>> xor with similar elements gets cancelled
            // a^a=0
            //a^0=a
            // 1^1^2^2^3^
        }
        return value;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Unique Value : "+findUnique(arr));
    }
}
