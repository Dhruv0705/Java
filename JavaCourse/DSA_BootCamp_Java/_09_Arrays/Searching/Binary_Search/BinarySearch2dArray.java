import java.util.Arrays;

/* 
 * Searching in a 2D Array
 *  [18,9,12]
 *  [36, -4, 91]
 *  [44,33,16]
 *      Target = 91;
 * 
 *      // O(n^2)
 *      // Loop through the first array row 
 *      for (int row = 0; row < arr.length; i++) {
 * 
 *         // Loop through each index of the row
 *          for (int col = 0; j < arr[row].length; j++) {
 *              
 *              // Check if the target is equal to the current index
 *              if (arr[i][j] == target) {
 *                  System.out.println(row + " " + col);
 *             }
 *         }
 *      return -1;
 *    }
 * 
*/

public class BinarySearch2dArray{
/*
 * Q1: Matrix is sorted in a row and column wise manner.
 *   ROW 0   1   2   3   COLUMNS
 *    0 [10, 20, 30, 40]
 *    1 [15, 25, 35, 45]
 *    2 [28, 29, 37, 49]
 *    3 [33, 34, 38, 50]
 *         Target = 37; 
 * 
 *      Try to figure out how to minimize the search space.
 *      Case 1. If element == target, return the index
 *      Case 2. If element > target, remove the column 40 > 37 remove the column(40) 40, 45, 49, 50 col --; move left
 *      Case 3. If element < target, remove the row 28 < 37 remove the row(28) 28, 29, 37, 49 row ++; move down
*/
    static int[] searchRowColumnMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            else if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    /*
     * Q2: Search in a sorted matrix
     *     0  1  2  3  COLUMNS
     *  0 [1, 2, 3, 4]
     *  1 [5, 6, 7, 8]
     *  2 [9, 10, 11, 12]
     *  3 [13, 14, 15, 16]
     *  ROWS
     * 
     * Target = 6;
     * 
     * Take Middle column and binary search it
     * if element == target, return the index
     * if element > target, ignore the rows below it
     * if element < target, ignore the rows above it
     * When two rows are left 
     *     check weather the mid is 
    */

    public SortedMatrixSearch(int[][] matrix, int target){
        
    }


    public static void main(String[] args) {
        
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = 37;
        System.out.println(Arrays.toString(searchRowColumnMatrix(arr, target)));
    
    }
}