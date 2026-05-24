public class AvgOfElements {
    //finding the average of all the elements in a array

    static double getAvg(int[] arr){
        double sum=0;
        for (int i:arr){ //sum of elements calculation logic
            sum+=i;
        }
        double avg=sum/arr.length;  //average calculation logic
        return avg;
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Average of elements of the array:"+getAvg(arr));

    }
}
