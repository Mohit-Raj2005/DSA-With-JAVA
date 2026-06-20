//LEET-CODE[Q.2161. Partition Array According to Given Pivot]
//Medium

//Hint
//You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:

//Every element less than pivot appears before every element greater than pivot.
//Every element equal to pivot appears in between the elements less than and greater than pivot.
//The relative order of the elements less than pivot and the elements greater than pivot is maintained.
//More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
//Return nums after the rearrangement.

//Example 1:
//Input: nums = [9,12,5,10,14,3,10], pivot = 10
//Output: [9,5,3,10,10,12,14]
//Explanation:
//The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
//The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
//The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
//Example 2:
//Input: nums = [-3,4,3,2], pivot = 2
//Output: [-3,2,4,3]
//Explanation:
//The element -3 is less than the pivot so it is on the left side of the array.
//The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
//The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.

import java.util.Arrays;
public class PartitionArrayPivot {
    //this is an optimal approach for this question
    static int[] pivotArray(int[] nums, int pivot) {
        int [] result = new int[nums.length]; //initialising the result array
        int index = 0;      // intialising the index
        for(int element: nums){   // for each loop over nums array
            if(element < pivot){  // inserting the elements lesser than the pivot element in the result array
                result[index] = element;
                index++;
            }
        }
        for(int element: nums){
            if(element == pivot){     // inserting pivot elements in the result array
                result[index] = element;
                index++;
            }
        }
        for(int element: nums){
            if(element > pivot){    // inserting elements greater than the pivot elements in the result array
                result[index] = element;
                index++;
            }
        }
        return result;
    }

//================THIS IS METHOD 2 OF DOING THIS PROBLEM WHICH IS LESS OPTIMAL==============================================
    //     public int[] pivotArray(int[] nums, int pivot) {
//         ArrayList<Integer> lessPivot = new ArrayList<>();
//         ArrayList<Integer> inputPivot = new ArrayList<>();
//         ArrayList<Integer> morePivot = new ArrayList<>();
//         ArrayList<Integer> finalresult = new ArrayList<>();   <----- finalresult list to store both the lists
//         int[] result = new int[nums.length];
//         for(int i=0; i<nums.length;i++){
//             if(nums[i]<pivot){
//                 lessPivot.add(nums[i]);   <----- list for elements lesser than the pivot element
//             }
//             else if(nums[i]>pivot){
//                 morePivot.add(nums[i]);    <----- list for elements greater than the pivot element
//             }
//             else{
//                 inputPivot.add(nums[i]);   <------ separate list for all the pivot elements in the input array
//             }
//         }
//         finalresult.addAll(lessPivot);    <----- adding all the elements of lessPivot list to finalresult
//         finalresult.addAll(inputPivot);  <----- adding pivot elements to the finalresult
//         finalresult.addAll(morePivot);       <----- adding all the elements of lessPivot list to finalresult
//         for(int i=0; i<finalresult.size();i++){   <----- iterating the finalresult list and adding it to the result array
//             result[i] = finalresult.get(i);
//         }

//          return result;
//     }
//     ==================================================================================================================================

    public static void main(String[] args) {
        int[] nums1 = {9,12,5,10,14,3,10};
        System.out.println("Input Array 1: "+ Arrays.toString(nums1)+" ");
        System.out.println("Final partition Array 1 based on the pivot: "+Arrays.toString(pivotArray(nums1,10)));

        int[] nums2 = {-3,4,3,2};
        System.out.println("Input Array 2: "+ Arrays.toString(nums2)+" ");
        System.out.println("Final partition Array 2 based on the pivot: "+Arrays.toString(pivotArray(nums2,2)));

    }

}
