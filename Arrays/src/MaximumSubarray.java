//LEET-CODE [Q.53. Maximum Subarray](Medium)
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

//Example 2:
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.

//Example 3:
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

import java.util.Arrays;
public class MaximumSubarray {

    //This is a brute force method to solve this problem with runtime complexity of O(n2)
//Passed all the sample testcases but Memory Limit Exceeded and hidden testcases failed but can be a solution
//    static int maxSubArray(int[] nums) {
//        ArrayList<Integer> finalArrSum = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            int sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                finalArrSum.add(sum);
//            }
//        }
//        int maxsum = Collections.max(finalArrSum);
//        return maxsum;
//    }

    // METHOD 2 KADENE'S ALGORITHM MORE OPTIMAL //
    //This is an optimized solution to this problem using Kadene's Algorithm
    static int maxSubArray(int[] nums) {
        int sum=0; //initialising sum variable with 0
        int maxsum= Integer.MIN_VALUE; //initialising maxsum with minimum value of integer
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];  // calculating sum till current iteration
            if(sum>maxsum){
                maxsum=sum;  //updating maxsum if the sum is greater than current sum
            }
            if(sum<0){
                sum=0; //making sum=0 if it is less -ve or bypassing the sum till previous interation because carrying the -ve sum will elentually decrease the sum value
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums1={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Input Array 1:"+ Arrays.toString(nums1));
        System.out.println("Maximum sum subarray TESTCASE 1:"+ maxSubArray(nums1));

        int[] nums2={1};
        System.out.println("Input Array 2:"+ Arrays.toString(nums2));
        System.out.println("Maximum sum subarray TESTCASE 2:"+ maxSubArray(nums2));

        int[] nums3={5,4,-1,7,8};
        System.out.println("Input Array 3:"+ Arrays.toString(nums3));
        System.out.println("Maximum sum subarray TESTCASE 3:"+ maxSubArray(nums3));

    }
}
