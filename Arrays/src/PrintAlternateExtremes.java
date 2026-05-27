import java.util.Arrays;

public class PrintAlternateExtremes {
    //printing alternate extremes of an array from starting and end in an alternate manner
    static void PrintAlternateExtremes(int[] arr) {
        for (int i=0; i<(arr.length); i+=2){
            if(i==(arr.length)/2){
                System.out.print(arr[i]+",");
                break;
            }
            System.out.print(arr[i]+",");
            System.out.print(arr[arr.length-i-1]+",");

        }
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9};       //printing after skipping one step
        System.out.println("Array elements are:"+ Arrays.toString(arr));
        System.out.println("Printing Alternate Extreme ELements Of the Array:");
        PrintAlternateExtremes(arr);
    }
}
