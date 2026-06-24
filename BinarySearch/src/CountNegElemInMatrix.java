//LEET-CODE[Q.1351. Count Negative Numbers in a Sorted Matrix]

//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

//Example 1:
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.

import java.util.Arrays;

//Example 2:
//Input: grid = [[3,2],[1,0]]
//Output: 0
public class CountNegElemInMatrix {
    static int countNegatives(int[][] grid) {
        int row = grid.length;  //number of rows
        int col = grid[0].length;  // number of columns
        int negCount = 0;    // total negative elements
        int negIndx =  - 1;   // variable for storing the starting index of the negative element
        int i =0;   // i variable for counting the rows
        while(i<row){
            int start =0;    // starting index for each row
            int end = col-1;  // ending index for each row
            while(start<=end){   // applying binary search to find the starting index of the negative element in each row
                int mid = start + (end - start)/2;
                if(grid[i][mid]<0){
                    negIndx = mid;
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(negIndx>-1){    // if there is negative element present
                negCount = negCount + col - negIndx;  // calculating the number of total negative elements in that row and adding it to the previous count of negative elements
            }
            i++;  // increasing the row count
        }
        return negCount;
    }
    public static void main(String[] args) {
        int[][] grid1 = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int[][] grid2 = {{3,2},{0,1}};
        System.out.println("Grid 1: "+ Arrays.deepToString(grid1));
        System.out.println("Count of Negative elements in grid 1: "+ countNegatives(grid1));
        System.out.println("Grid 2: "+ Arrays.deepToString(grid2));
        System.out.println("Count of Negative elements in grid 2: "+ countNegatives(grid2));
    }
}
