//Problem: Wave Print a Matrix
//Description:
//Given a 2D matrix of size m × n, return its elements arranged in a “wave” order. This means starting from the top‑most row and printing elements down in one column, then moving to the next column and printing them up, and continuing this zig‑zag pattern until all columns are processed.
//Example 1:
//Input:
//mat = [[1, 2, 3],
//       [4, 5, 6],
//       [7, 8, 9]]
//Output:
//[1, 4, 7, 8, 5, 2, 3, 6, 9]
//Explanation:
//Column 0 → top to bottom → [1, 4, 7]
//Column 1 → bottom to top → [8, 5, 2]
//Column 2 → top to bottom → [3, 6, 9]
//Final result = [1, 4, 7, 8, 5, 2, 3, 6, 9]


import java.util.ArrayList;

public class WavePrintMatrix {
    static ArrayList<Integer> wavePattern(int matrix[][]){
        ArrayList<Integer> array=new ArrayList<>();
        int m=matrix.length;//rows
        int n=matrix[0].length; //columns
        for(int col=0;col<n;col++){  //iterating over columns
            if(col%2==0){ //for even columns
                for(int row=0;row<m;row++){   // for even columns, iterating from top to bottom
                    array.add(matrix[row][col]); // for even columns, adding from top to bottom
                }
            }
            else{
                for(int row=m-1;row>=0;row--){ // for even columns, iterating from bottom to top
                    array.add(matrix[row][col]);  // for even columns, iterating from bottom to top
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int mat1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Wave Pattern for matrix 1: "+wavePattern(mat1));

    }
}
