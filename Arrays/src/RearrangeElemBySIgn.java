//LEET-CODE[2149. Rearrange Array Elements by Sign]
//Medium
//Hint
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//You should return the array of nums such that the array follows the given conditions:
//Every consecutive pair of integers have opposite signs.
//For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.
//Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//
//Example 1:
//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]
//Explanation:
//The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
//Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

//Example 2:
//Input: nums = [-1,1]
//Output: [1,-1]
//Explanation:
//1 is the only positive integer and -1 the only negative integer in nums.
//So nums is rearranged to [1,-1].


import java.util.Arrays;

public class RearrangeElemBySIgn {
    //Method 2 this is a more efficient and optimal way in terms of space utilization
    // T.C-----> O(n)
    static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] finalArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                finalArr[pos] = nums[i];
                pos += 2;       // at even indices we are adding the positive elements of nums
            } else {
                finalArr[neg] = nums[i];
                neg += 2;    //at odd indices we are adding negative elements of numa
            }
        }
        return finalArr;

    }
    // solved and runtime was 5ms.... optimization in terms of memory utilization can be done
    //Method 1      T.C-----> O(n)
    // static int[] rearrangeArray(int[] nums) {
    //     int[] negArr = new int[nums.length/2];    //for storing all the negative elements
    //     int[] posArr = new int[nums.length/2];     // for storing all the negative elements
    //     int indxPos =0;
    //     int indxNeg =0;
    //     for(int j =0;j<nums.length;j++){
    //         if(nums[j]>0){
    //             posArr[indxPos]=nums[j];
    //             indxPos++;
    //         }
    //         else{
    //             negArr[indxNeg] = nums[j];
    //             indxNeg++;
    //         }
    //     }
    //     int m =0;
    //     int n =0;
    //     for(int i = 0; i <nums.length;i++){
    //         if(i%2==0){   the approach can be that at even indices we are adding positive elements
    //             nums[i]=posArr[m];
    //             m++;
    //         }
    //         else{   and at odd indiced we are adding negative elements
    //             nums[i]= negArr[n];
    //             n++;
    //         }
    //     }

    //     return nums;
        //}
    //
    public static void main(String[] args) {
        int[] nums1 = {3,1,-2,-5,2,-4};
        int[] nums2 = {-1,1};
        System.out.println("Input Array 1:"+ Arrays.toString(nums1));
        System.out.println("OUTPUT ARRAY 1:"+ Arrays.toString(rearrangeArray(nums1)));
        System.out.println("Input Array 2:"+ Arrays.toString(nums2));
        System.out.println("OUTPUT ARRAY 2:"+ Arrays.toString(rearrangeArray(nums2)));
    }
}
