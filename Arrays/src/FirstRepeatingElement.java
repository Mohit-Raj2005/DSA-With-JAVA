//LEET-CODE [Q.287.](Medium)[Find the Duplicate Number]
//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.

//Example 1:
//Input: nums = [1,3,4,2,2]
//Output: 2

//Example 2:
//Input: nums = [3,1,3,4,2]
//Output: 3

//Example 3:
//Input: nums = [3,3,3,3,3]
//Output: 3

import java.util.Arrays;
import java.util.HashMap;

public class FirstRepeatingElement {
    static int findDuplicate(int[] nums) {
        //This is a brute force method to solve this problem with runtime complexity of O(n2) but this solutin passes all the sample testcases but fails some hidden testcases on submission Time limit exceeded
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        // }

//this is a more efficient way of solving this problem with a runtime complexity of O(n) using a hashmap for storing the elements and its frequencies with getOrDefault method and then returning the key with frequency more than 1 else returning -1.

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])>1){
                return nums[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num1={1,3,4,2,2};
        System.out.println("Original Array 1:"+ Arrays.toString(num1));
        System.out.println("First Repeating element in Array 1:"+ findDuplicate(num1));
        int[] num2={3,1,3,4,2};
        System.out.println("Original Array 2:"+ Arrays.toString(num2));
        System.out.println("First Repeating element in Array 2:"+ findDuplicate(num2));
        int[] num3={3,3,3,3,3};
        System.out.println("Original Array 3:"+ Arrays.toString(num3));
        System.out.println("First Repeating element in Array 3:"+ findDuplicate(num3));

    }
}

