//448. Find All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

//Example 2:
//Input: nums = [1,1]
//Output: [2]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MissingElemArrayWithDuplicates {
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> finalarr = new ArrayList<>();

        //marking the elements at the correct index or position element as negative so that we will get to know that the element is present in the array
        for(int i=0;i<nums.length;i++){
            int value=Math.abs(nums[i]);  //getting the absolute value of the element at the current iteration of the index i
            int position = value - 1 ; // getting the correct position of the value in the sorted array

            if(nums[position]>0){
                nums[position]=-nums[position];
                //marking the value at the correct position as negative so that it will represent that position + 1 == element is present in the array... negative sign will show that its present
            }
        }
        for(int j=0; j<nums.length;j++){
            if(nums[j]>0){
                finalarr.add(j+1);  //checking the unmarked element i.e, positive element and this shows that the correct element of that index which will be that index + 1 is missing so we are adding it to the output array list
            }
        }
        return finalarr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println("Original Array 1:"+ Arrays.toString(nums1));
        System.out.println("Missing elements of array 1:"+ findDisappearedNumbers(nums1));
        int[] nums2 = {1,1};
        System.out.println("Original Array 2:"+ Arrays.toString(nums2));
        System.out.println("Missing elements of array 2:"+ findDisappearedNumbers(nums2));
    }
}
