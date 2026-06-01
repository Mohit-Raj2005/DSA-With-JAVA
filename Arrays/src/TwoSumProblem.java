import java.util.Arrays;
import java.util.HashMap;

//LEET-COD[Q.1](Two Sum problem)

public class TwoSumProblem {

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    static int[] twoSum(int[] arr, int target){
        int[] finalarr = new int[2];
        //This is a brute force method to solve this problem but we can have multiple approaches to solve this
        //we can use hashmap also so that the searching becomes more efficient
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    finalarr[0]=i;
                    finalarr[1]=j;
                }
            }
        }
        return finalarr;
    }

    static int[] twoSumEfficient(int[] arr, int target){
        //this method is a more efficient way of solving this problem with runtime complexity of O(n) and an efficient search due to hashmap
        int[] finalarr = new int[2];
        int x;
        int y;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);   //putting the element and index of the array into the map
        }
        for(int j=0;j<arr.length;j++){
            x=arr[j];     //fixing x one by one
            y=target-x;   // calculating the other number
            if(map.get(y)!=null && map.get(y)!=j){   //condition checking if the entry is present in the map and does not refer to the same index in case of duplicates case of ARRAY3 in the main method
                finalarr[0]=map.get(target-arr[j]);
                finalarr[1]=j;
            }
        }
        return finalarr;
    }

    public static void main(String[] args) {
        int[] arr1={2,7,11,15};
        System.out.println("Array1:"+ Arrays.toString(arr1));
        System.out.println("Ans for sum 9:"+Arrays.toString(twoSum(arr1,9)));
        System.out.println("Ans for sum 9 using Method 2:"+Arrays.toString(twoSumEfficient(arr1,9)));
        int [] arr2={3,2,4};
        System.out.println("Array2:"+ Arrays.toString(arr2));
        System.out.println("Ans for sum 6:"+Arrays.toString(twoSum(arr2,6)));
        System.out.println("Ans for sum 6 Using method 2:"+Arrays.toString(twoSumEfficient(arr2,6)));
        int[] arr3={3,3};
        System.out.println("Array3:"+ Arrays.toString(arr3));
        System.out.println("Ans for sum 6:"+Arrays.toString(twoSum(arr3,6)));
        System.out.println("Ans for sum 6 using Method 2:"+Arrays.toString(twoSumEfficient(arr3,6)));

    }
}
