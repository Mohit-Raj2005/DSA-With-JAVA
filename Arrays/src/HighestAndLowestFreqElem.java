import java.util.Arrays;
import java.util.HashMap;

public class HighestAndLowestFreqElem {
    //returning the element having the highest and the lowest frequency
    static int[] HighestAndLowFreq(int[] arr){
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i: arr){
            //i--> will represent keys
            //putting the keys and the values in the hashmap
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        //hashmap is ready

        int highfreq=Integer.MIN_VALUE;   //initialising the highfreq with maxvalue of integer so that further comparision and updation can be done
        int highfreqkey=-1;
        for(int key: freq.keySet()){    //iterating over the hashmap
            int currentkey=key;
            int currentkeyfreq=freq.get(key);
            if(currentkeyfreq>highfreq){    //comparision logic for highfreqkey
                highfreq=currentkeyfreq;
                highfreqkey=currentkey;     //updating the keys and frequencies
            }
        }
        int lowfreq=Integer.MAX_VALUE; //initialising the highfreq with minvalue of integer so that further comparision and updation can be done
        int lowfreqkey=-1;
        for (int key: freq.keySet()){
            int currentkey=key;
            int currentkeyfreq=freq.get(key);
            if (currentkeyfreq<lowfreq){//comparision logic for lowfreqkey
                lowfreq=currentkeyfreq;
                lowfreqkey=key;      //updating the keys and frequencies
            }
        }
        int ans[]={highfreqkey,lowfreqkey};    //storing the key having the highest and lowest freq in an array
        return ans;    //returning the array
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,2,3,3,3,4,4,4};
        System.out.println("Original Array:"+ Arrays.toString(arr));
        System.out.println("Highest And Lowest Frequency Elements are:"+Arrays.toString(HighestAndLowFreq(arr))+" respectively");

    }

}
