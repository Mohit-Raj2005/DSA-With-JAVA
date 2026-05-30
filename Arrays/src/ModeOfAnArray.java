import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ModeOfAnArray {

    //returning the element of the array having the highest frequency in the array or maximum number of repetition
    static int ModeOfArray(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        //MAIN CONCEPT
        for (int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1); //this method If the key is present, its mapped value is returned.//If the key is absent, the provided defaultValue is returned//If the key exists but maps to null, null is returned (not the default).
        }

        //THIS IS JUST TO SHOW THAT THE DATA IS GETTING STORED IN THE HASHMAP
        for(int i: freq.keySet()){
            //keySet()-> will return all the keys of the hashmap
            // i-> will represent keys
            System.out.println(i+"-->> "+freq.get(i));
        }

        int maxfreq=-1;    //initialising the maxfreq with -1
        int maxfreqkey=-1; //initialising the maxfreqkey with -1
        for(int key: freq.keySet()){   //iterating key over the entire hashmap
            int currentkey=key;   //storing the key in the current key
            int currentkeyfreq=freq.get(key);   //storing the value of the key which is the freq of the key int the current key freq
            if(currentkeyfreq>maxfreq){   //main comparasion logic
                maxfreq=currentkeyfreq;    //updating the maxfreq with every loop after comparision
                maxfreqkey=key;          //updating the maxfreqkey with the key having the maximum frequency
            }
        }
        //when we will get out of the loop we will have maxfreqkey
        return maxfreqkey;     //returning the key with max freq

    }
    //we will be finding the element with the highest frequency in an array
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5,5,5,5,6,6,6,7,8,8,9,10};
        System.out.println("Array is:"+Arrays.toString(arr));
        System.out.println("Mode Of Array is:"+ ModeOfArray(arr));

    }
}
