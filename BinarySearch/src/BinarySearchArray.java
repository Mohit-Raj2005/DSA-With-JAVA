//LEET-CODE[Q.704. Binary Search]
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4

//Example 2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1

import java.util.Arrays;

public class BinarySearchArray {
    static  int search(int[] nums, int target) {
        int low = 0;   //starting index
        int high = nums.length-1;   //ending index
        while(low <= high){
            //    int mid = (low + high)/2;     this condition for calculation of mid is also valid but it can break if the mid ends up to a value greater than the range of an index
            int mid = low + (high - low)/2; //by using this expression for the evaluation of mid will handle the edge case of overflow, overflow will not happen if we use this expression
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[mid]<target){
                    low = mid + 1;    //moving towards right
                }
                else{
                    high = mid -1;  // moving towards left
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1={-1,0,3,5,9,12};
        System.out.println("Input Array 1: "+ Arrays.toString(nums1)+" ");
        System.out.println("Searching for target 9 in the input array 1 : "+ search(nums1,9));
        System.out.println("Searching for target 2 in the input array 1 : "+ search(nums1,2));

    }
}
