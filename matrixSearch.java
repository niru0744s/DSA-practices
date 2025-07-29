public class matrixSearch {
    public static boolean searchAlgo(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(key == matrix[row][col]){
                System.out.println("Value found at"+row+col+"Position");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }
    public static void main(String[]args){
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                                {27,29,37,48},
                                    {32,33,39,50}};
        int key = 33;
        searchAlgo(matrix, key);
    }
}
