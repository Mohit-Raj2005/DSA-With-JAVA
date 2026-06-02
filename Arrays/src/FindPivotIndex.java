//LEET-CODE [Q.724]( Find Pivot Index)
//Given an array of integers nums, calculate the pivot index of this array.
//The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//Return the leftmost pivot index. If no such index exists, return -1.

//Example 1:
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

//Example 2:
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.

//Example 3:
//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0

import java.util.Arrays;

public class FindPivotIndex {
    static int pivotIndex(int[] nums) {
        int[] leftsum = new int[nums.length];  //initialising the leftsum array
        int [] rightsum = new  int[nums.length]; //initialising the rightsum array
        int lefts=0;
        int rights=0;
        for(int i=0;i<nums.length;i++){
            lefts+=nums[i];
            leftsum[i]=lefts;    //Create an array leftsum where leftsum[i] is the sum of all the numbers to the left of index i.

        }
        for(int j=nums.length-1;j>=0;j--){    //running loop from end
            rights+=nums[j];
            rightsum[j]=rights;    //Create an array rightsum where rightsum[i] is the sum of all the numbers to the right of index i.
        }
        for(int k=0;k<rightsum.length;k++){  //For each index i, check if leftsum[i] equals rightsum[i]. If so, return i. If no such i is found, return -1.
            if(leftsum[k]==rightsum[k]){
                return k;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums1={1,7,3,6,5,6};
        System.out.println("Input Array 1:"+ Arrays.toString(nums1));
        System.out.println("Pivot Index Of Array 1:"+ pivotIndex(nums1));

        int[] nums2={1,2,3};
        System.out.println("Input Array 2:"+ Arrays.toString(nums2));
        System.out.println("Pivot Index Of Array 2:"+ pivotIndex(nums2));

        int[] nums3={2,1,-1};
        System.out.println("Input Array 3:"+ Arrays.toString(nums3));
        System.out.println("Pivot Index Of Array 3:"+ pivotIndex(nums3));
    }
}
