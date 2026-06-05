// --------------GeeksForGeeks--------------
// ---------[Q.Column Sum in a Matrix]-------------
//Given a 2-D integer matrix mat[][] of size n*m. Return a list of integers where list[i] represents the sum of elements of the ith column of the matrix.

//Examples:
//Input: mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//Output: [12, 15, 18]
//Explanation: Column 1 -> 1+4+7=12, Column 2 -> 2+5+8=15, Column 3 -> 3+6+9=18
//Input: mat = [[1, 2], [10, 2], [3, 3]]
//Output: [14, 7]
//Explanation: Column 1 -> 1+10+3=14, Column 2 -> 2+2+3=7
import java.util.Arrays;
public interface ColumnSumIn2DArray {
    public static int[] colSum(int mat[][]) {

        int rows = mat.length;  //calculating the number of rows
        int column = mat[0].length;  //calculating the number of columns
        int[] array = new int[column];  //integer array of column size to store the sum
        for(int cols = 0;cols<column;cols++){  //Iterating column wise
            int sum = 0;
            for(int r= 0; r< rows;r++){  // iterating rows
                sum += mat[r][cols];  // calculating sum for each column
            }
            array[cols] = sum;
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};  //  2D Array
        System.out.println("Sum Of Each Row in Matrix 1: "+ Arrays.toString(colSum(mat1)));

        int[][] mat2 = {{1, 2},{10,2},{3,3}};
        System.out.println("Sum Of Each Row in Matrix 2: "+Arrays.toString(colSum(mat2)));

    }
}
