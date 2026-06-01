import java.util.*;

//LEET-CODE [Q.15. 3Sum (Medium)]
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

//Ex.1
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.

//Ex.2
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.

//Ex.3
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.

public class ThreeSumProblem {

    //This Solution passed all the three test cases in the question but did not get accepted because of
    // Time Limit Exceeded
    //we can optimize this further

        static List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> result=new HashSet<>();

            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            Collections.sort(temp);   //sorting the temp list so that the simmilars will be arranged in a manner that would look like duplicates and then we will add it to the hashset so that no duplicates allowed and then typecasting it into an arraylist so that our testcases run
                            result.add(temp);


                        }
                    }
                }
            }
            return new ArrayList<>(result);  //typecasting the result set into a new arraylist so that our test cases run
        }

   public static void main(String[] args) {
            int[] num1={-1,0,1,2,-1,-4};
            String result1=threeSum(num1).toString();
            System.out.println("TEST-CASE 1:"+result1);
            int[] num2={0,1,1};
            String result2=threeSum(num2).toString();
            System.out.println("TEST-CASE 2:"+result2);
            int[] num3={0,0,0};
            String result3=threeSum(num3).toString();
            System.out.println("TEST-CASE 3:"+result3);

    }
}

