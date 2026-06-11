//LEET-CODE[Q.54. Spiral Matrix](Medium)
//Given an m x n matrix, return all elements of the matrix in spiral order.
//Example 1:
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//Example 2:
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
        int startingrow = 0;
        int startingcol = 0;
        int endingrow = matrix.length-1;
        int endingcol = matrix[0].length-1;
        ArrayList<Integer> spiralArray = new ArrayList<>();
        while(startingrow<=endingrow && startingcol<=endingcol){
            //row wise L->R  -->from startingcol to endingcol
            for(int col=startingcol;col<=endingcol;col++){
                spiralArray.add(matrix[startingrow][col]);
            }
            startingrow++;
            //Column wise T->B ---> from startingrow to endingrow
            for(int row=startingrow;row<=endingrow;row++){
                spiralArray.add(matrix[row][endingcol]);
            }
            endingcol--;
            //row wise R->L ---> from endingcol to startingcol
            //but checking if there is any valid row to print
            if(startingrow<=endingrow){
                for(int col = endingcol;col>=startingcol;col--){
                    spiralArray.add(matrix[endingrow][col]);
                }
                endingrow--;
            }

            //Column wise B->T --> from endingrow to startingrow
            //but checking if there is any valid column to print
            if(startingcol<=endingcol){
                for(int row = endingrow;row>=startingrow;row--){
                    spiralArray.add(matrix[row][startingcol]);
                }
                startingcol++;
            }

        }
        return  spiralArray;
    }

    public static void main(String[] args) {
        int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Original Matrix1:");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Spiral matrix 1 :"+Arrays.toString(List.of(spiralOrder(matrix1)).toArray()));
        System.out.println("Original Matrix2:");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral matrix 2 :"+Arrays.toString(List.of(spiralOrder(matrix2)).toArray()));
    }
}
