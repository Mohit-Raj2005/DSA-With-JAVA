//LEET-CODE [Q.867. Transpose Matrix]
//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Example 1:
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
//Example 2:
//Input: matrix = [[1,2,3],[4,5,6]]
//Output: [[1,4],[2,5],[3,6]]

public class TransposeOfMatrix {
        static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols =  matrix[0].length;
        int[][] transposematrix = new int[cols][rows];   //initialising transpose matrix with new int[cols][rows] cols as rows and rows as cols
        for(int i =0;i<rows;i++){
            for(int j =0 ; j< cols;j++){
                transposematrix[j][i]=matrix[i][j];   //swapping rows and columns of input matrix and transpose matrix
            }
        }
        return transposematrix;
    }

    public static void main(String[] args) {
            int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
            int[][] matrix2 = transpose(matrix1);
            System.out.println("Input Matrix1:");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Transpose matrix 1:");
            for (int i = 0; i < matrix2.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
    }
}
