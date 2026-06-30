//LEET-CODE[Q.2529. Maximum Count of Positive Integer and Negative Integer]

//Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
//In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
//Note that 0 is neither positive nor negative.

//Example 1:
//Input: nums = [-2,-1,-1,1,2,3]
//Output: 3
//Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

//Example 2:
//Input: nums = [-3,-2,-1,0,0,1,2]
//Output: 3
//Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.

//Example 3:
//Input: nums = [5,20,66,1314]
//Output: 4
//Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.

import java.util.Arrays;
public class MaxCountOfPosAndNeg {
    //APPROACH:-------->>>>> since this is an ascending array, we need to find the index of the last -ve element and starting index of the first +ve element
    // all the elements before the last -ve element will -ve so we can calculate the total number of -ve elements
    // all the elements after the first +ve element will be +ve so we can calculate the total number of +ve elements
    static int maximumCount(int[] nums) {
        int n =  nums.length;   // length of the input array
        int start = 0;  // starting index of the input array
        int end = n-1;  // ending index of the input array
        int end2 = n-1;  // negative index of the second positive subarray
        int posIndx=nums.length;  // variable for index of first positive element
        int negIndx=-1;  // variable for index of last negative element
        int newStart = 0; // variable for start index of new positive subarray
        while(start<=end){   // biary search to find the index of last negative element
            int mid = start + (end - start)/2;
            if(nums[mid]<0){   // if the mid element is -ve
                negIndx = mid ;   // storing the index of -ve element
                start = mid + 1;   // moving right to find if other -ve elements are present after
            }
            else{    // if the mid element is +ve or 0
                newStart = mid;   // storing the start index of the new subarry
                end = mid -1;  // moving left to find if other +ve elements are present before this index
            }
        }
        while(newStart <= end2){  // binary search over the new subarray to find the index of first +ve element
            int mid = newStart + (end2 - newStart)/2;
            if(nums[mid]==0){   // if the mid element is 0
                newStart = mid + 1;  // moving right
            }
            else{
                posIndx = mid;   // storing the value of the positive element
                end2 = mid -1;  // moving left to find if any other +ve element is present before this index
            }
        }
        int finalans = Math.max(negIndx+1,n-posIndx);   // calculating max of negative elements and the positive elements
        return finalans;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2,-1,-1,1,2,3};
        int[] nums2 = {-3,-2,-1,0,0,1,2};
        int[] nums3 = {5,20,66,1314};
        System.out.println("Input nums1: "+ Arrays.toString(nums1));
        System.out.println("Max Count Of +ve or -ve elements in nums1: "+ maximumCount(nums1));
        System.out.println("Input nums2: "+ Arrays.toString(nums2));
        System.out.println("Max Count Of +ve or -ve elements in nums2: "+ maximumCount(nums2));
        System.out.println("Input nums1: "+ Arrays.toString(nums1));
        System.out.println("Max Count Of +ve or -ve elements in nums3: "+ maximumCount(nums3));

    }
}
