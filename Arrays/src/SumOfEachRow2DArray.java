//GEEKS FOR GEEKS QUESTION
// ----------[Q]Row Sum in a Matrix-----------
//Given a 2-D integer matrix mat[][] of size n*m. Return a list of integers where list[i] represents the sum of elements of the ith row of the matrix.
//Note: The sum of any row will remain within the range of an integer
//Examples:
//Input: mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//Output: [6, 15, 24]
//Explanation: Row 1 -> 1+2+3=6, Row 2 -> 4+5+6=15, Row 3 -> 7+8+9=24

//Input: mat = [[1, 2], [10, 2], [3, 3]]
//Output: [3, 12, 6]
//Explanation: Row 1 -> 1+2=3, Row 2 -> 10+2=12, Row 3 -> 3+3=6
import java.util.Arrays;
public class SumOfEachRow2DArray {
    public static int[] rowSum(int mat[][]) {
        int[] array = new int[mat.length];
        for(int i=0; i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+= mat[i][j];
            }
            array[i]=sum;
        }
        return array;
    }
    // Logic For calculating rows and columns in a 2D matrix //
// int rows = mat.length;
// int columns = mat[0].length;
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};  //  2D Array
        System.out.println("Sum Of Each Row in Matrix 1: "+Arrays.toString(rowSum(mat1)));

        int[][] mat2 = {{1, 2},{10,2},{3,3}};
        System.out.println("Sum Of Each Row in Matrix 2: "+Arrays.toString(rowSum(mat2)));

    }
}
