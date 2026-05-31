//LEET-CODE [Q.268](missing-number)//

//Given an array containing n distinct numbers taken from 0,1,2,...n.
//Find the one that is missing from the array
//Implement the algorithm using linear runtime complexity
//Input: n=8 array=[5,6,0,2,4,1,8,7]

import java.util.Arrays;

public class MissingNumber {

    //method 1 by basic maths
    static int missingNumber(int[] arr) {
    int n=arr.length;  //initialising n with the length of the array
    int allsum=n*(n+1)/2;   //calculating the sum of the array of range given in the question
    int sumOfInputElem=0;
    int value=0;
    for(int i=0;i<n;i++)
    {
        sumOfInputElem+=arr[i];  //calculating the sum of the elements of the input array
    }
    if (allsum>sumOfInputElem)   //checking that the sum of input elements of the array is less than the sum of the elements of the range array given in the question
    {
        value= allsum-sumOfInputElem;   //this will return the missing element from the array
    }
    return value;  //returning the missing value
    }

    //method 2 by XOR sum
    //ADVANCED APPROACH
    static int  missingNumber2(int[] arr)
    {
        int xorSum=0;
        //xor with all the array elements
        //XOR all elements in the array → accumulates their combined XOR.
        for (int i:arr){
            xorSum=xorSum^i;
        }
        // xor with all the elements in the range
        //XOR with all numbers from 0 to n → introduces the full expected range
        //Cancellation happens → duplicates vanish, leaving only the missing number.
        int n=arr.length;
        for (int i=0;i<=n;i++) {
            xorSum = xorSum ^ i;
        }
        //MAIN CONCEPT
        //This algorithm relies on the XOR cancellation property — when you XOR two identical numbers, they vanish (become 0). By XORing the array with the complete range, all present numbers cancel out, leaving only the missing one.
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr={5,6,0,4,3,1,8,7};
        System.out.println("Input Array:"+ Arrays.toString(arr));
        System.out.println("Missing number in array:"+missingNumber(arr));
        System.out.println("Missing number in array using xor method:"+missingNumber2(arr));
    }
}
