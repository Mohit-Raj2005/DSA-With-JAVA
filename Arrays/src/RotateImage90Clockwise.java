//LEET-CODE [Q.48.Rotate Image (Medium)] [INTERVIEW IMPORTANT]
//Amazon, Paytm , Microsoft , Adobe
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//Example 1:
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Example 2:
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

//SOlUTION APPROACH
//Step 1: Taking the transpose of the input matrix
//Step 2: Reversing each row of the transpose matrix will give us the rotated matrix clockwise
        //Step 2.1: we will be going to each row
        //Step 2.2: we will be reversing each row using two pointer approach like in 1D arrray
// and reversing each column would same as anticlockwise
public class RotateImage90Clockwise {
    static void rotate(int[][] matrix) {
        int n= matrix.length;
        //Step 1: Transpose of a matrix
        for(int i=0 ;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // Step 2: Reverse all rows
        // similar to reversing in 1D array using 2 pointer approach
        for(int row=0;row<n;row++){   // for each row we will be reversing the row elements
            int startcol=0;
            int endcol=n-1;
            while(startcol<=endcol){
                //Swapping elements for reversing the array using two pointer approach
                int temp = matrix[row][startcol];
                matrix[row][startcol] = matrix[row][endcol];
                matrix[row][endcol]=temp;
                startcol++;
                endcol--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original matrix 1:");
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        rotate(matrix);
        System.out.println("Rotate matrix 1:");
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }


    }
}
