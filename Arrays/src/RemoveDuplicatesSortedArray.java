import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    //LEET-CODE [Q.26](Remove Duplicates from Sorted Array)
    //Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
    //Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
    //The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

    //Example 1:
    //Input: nums = [1,1,2]
    //Output: 2, nums = [1,2,_]
    //Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).

    //Example 2:
    //Input: nums = [0,0,1,1,1,2,2,3,3,4]
    //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    //Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
    //It does not matter what you leave beyond the returned k (hence they are underscores).
    static int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int n= nums.length;

        //This function passed all the test cases and in an efficient manner
        //we can also solve this using a hash map
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                i++;
                nums[i]=nums[j];
                j++;
            }

        }
        //skipping these print statements in the original leetcode solution
        System.out.print("Final Array output:");
        for(int k=0;k<i+1;k++){
            System.out.print(nums[k]+" ");
        }
        System.out.println();
        System.out.println("K:");
        return i+1;
    }

    public static void main(String[] args) {
        int[] num1={1,1,2};
        System.out.println("Original Array 1:"+Arrays.toString(num1));
        System.out.print(removeDuplicates(num1));
        int[] num2={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original Array 2:"+Arrays.toString(num2));
        System.out.print(removeDuplicates(num2));
    }

}
