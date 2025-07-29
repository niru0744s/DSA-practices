import java.util.*;
public class matrix{

    public static void findLarge(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                largest = Math.max(largest , arr[i][j]);
                smallest = Math.min(smallest, arr[i][j]);
            }
        };
        System.out.println(largest);
        System.out.println(smallest);
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]);
            }
            // left 
            for(int i=endRow-1; i>= startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.err.println();
    }
    public static void main(String[]args){
        int newMatrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

    }
}
