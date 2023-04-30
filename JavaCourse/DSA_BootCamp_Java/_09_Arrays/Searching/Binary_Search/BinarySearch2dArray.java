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
     * Leetcode: https://leetcode.com/problems/search-a-2d-matrix/
     * 
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

    public static int [] SortedMatrixSearch(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1){
            return binarySearch(matrix, target, 0, 0, col - 1);
        }

        if (col == 0){
            return new int[]{-1, -1};
        }

        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;

        // run the loop till 2 rows are remaining
        while(rowStart < (rowEnd - 1)) { // while this is true it will have more then two rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            // if the target is equal to the mid element, return the index
            if (matrix[mid][colMid] == target) {
                return new int[] {mid, colMid};
            }

            // if the target is less then the mid element, ignore the right half
            if (matrix[mid][colMid] < target) {
                rowStart = mid;
            }

            // if the target is greater then the mid element, ignore the left half
            else {
                rowEnd = mid;
            }
        }

        // after the while loop is done, we will have two rows left
        // check whether the target is present in the col of 2 rows

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        if (matrix[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }

        // search in 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, target, rowStart, 0, colMid-1);
        }
        // search in 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]) {
            return binarySearch(matrix, target, rowStart, colMid + 1, col - 1);
        }
        // search in 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, target, rowStart + 1, 0, colMid-1);
        } else {
            return binarySearch(matrix, target, rowStart + 1, colMid + 1, col - 1);
        }
        
    }

    // search in the row provided between the colStart and colEnd indexes
    static int[] binarySearch (int [][] matrix, int target, int row, int colStart, int colEnd){
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int []{row, mid};
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            }
            else {
                colEnd = mid - 1;
            }
        }
        return new int [] {-1, -1} ;
    }

    public static void main(String[] args) {
        
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int [][] arr2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9 ,10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(searchRowColumnMatrix(arr, 29)));
        System.out.println(Arrays.toString(SortedMatrixSearch(arr2, 16)));
    }
}