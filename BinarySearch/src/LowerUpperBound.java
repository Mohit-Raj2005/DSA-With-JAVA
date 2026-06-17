public class LowerUpperBound {
    // T.C --> O(log n)  based on binary search
    static int getLowerBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;   //initialising the lowerbound ans with the length of the array
        while(start <= end){
            int mid = start + (end - start)/2;  // calculating mid
            if(arr[mid] >= target){        // satisfying condition for lower bound
                ans = mid;                 // storing the index
                end = mid-1;            // moving towards left to find if other target values are also there in the left subarray
            }
            else{
                start = mid+1;    // otherwise moving towards right to check lower bound in the right subarray
            }
        }
        return ans;
    }

    static int getUppperBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;   //initialising the upperbound ans with the length of the array
        while(start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid] <= target){
                start = mid+1;   //move towards right
            }
            else{
                ans = mid;    //storing the answer
                end =  mid-1;  //moving towards left to look if other lower bounds are also present in the left subarray
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int [] arr= {10,20,30,30,30,30,30,40,50};
        int target = 35;
        System.out.println(getLowerBound(arr,target));
        System.out.println(getUppperBound(arr,target));
    }
}
