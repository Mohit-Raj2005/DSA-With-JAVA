//------------GeeksForGeeks---------------//
//[Q.Print Matrix in snake Pattern]    ------>>
//                                    <<-------|   L-->>R--->>L-->R-->>L
//                                    |------->>
//Given a matrix mat[][] of size n x n. Print the elements of the matrix in the snake like pattern depicted below.
//Examples :
//Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
//Output: [45, 48, 54, 87, 89, 21, 70, 78, 15]
//Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15]

//Input: n = 2, mat[][] = [[1, 2], [3, 4]]
//Output: [1, 2, 4, 3]
//Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]

import java.util.ArrayList;
public class PrintMatrixSnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int row=0;row<matrix.length;row++){  //iterating rows
            if(row%2==0){  //for even rows , iterating columns from left to right
                for(int column=0;column<matrix[0].length;column++){
                    array.add(matrix[row][column]); //adding element of that iteration to the arraylist
                }
            }
            else{  //for odd rows , iterating from right to left
                for(int column = matrix[0].length-1;column>=0;column--){
                    array.add(matrix[row][column]);  //adding element of that iteration to the arraylist

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int mat1[][] = {{45, 48, 54}, {21, 89, 87}, {70, 78, 15}};
        System.out.println("Snake Pattern for matrix 1: "+snakePattern(mat1));
        int mat2[][] = {{1,2}, {3,4}};
        System.out.println("Snake Pattern for matrix 2: "+snakePattern(mat2));
    }
}
