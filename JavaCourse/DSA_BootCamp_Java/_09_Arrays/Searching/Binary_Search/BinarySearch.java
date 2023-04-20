public class BinarySearch {

    /*
     * Binary Search
     * 
     *  - Binary search is a search algorithm that finds the position of a target
     *      value within a sorted array.
     *  - Binary search compares the target value to the middle element of the array.
     *  - If they are not equal, the half in which the target cannot lie is
     *      eliminated and the search continues on the remaining half, again taking
     *      the middle element to compare to the target value, and repeating this
     *      until the target value is found. If the search ends with the remaining
     *      half being empty, the target is not in the array.
     * 
     *   arr = [2, 4, 6, 9, 11, 12, 14, 20, 36, 48] (sorted array in ascending order)
     *   arr = [48, 36, 20, 14, 11, 9, 6, 4, 2] (sorted array in descending order)
     *   
     * 
     *   Q: Find whether 36 exists in the array or not
     *   TARGET = 36
     *   Since the array is sorted, we can use binary search to find the target element.
     * 
     *   1. Find the middle element of the array
     *      arr.length = 10
     *      mid = 10/2 = 5
     *      arr[mid] = 12
     *   2. Compare the target value with the middle element of the array
     *      arr[mid] = 12
     *      TARGET = 36
     *      36 > 12
     *     TARGET > arr[mid] => Search in the right else search in the left half of the array
     *     The target value is greater than the middle element of the array
     *          So, the target value cannot be present in the left half of the array
     *          Eliminate the left half of the array
     *     Search in the right half of the array
     *   3. If middle element == target element, return the index of the middle element
     *   4. If middle element != target element, repeat the steps 1, 2, 3, 4
     *           0  1  2  3  4   5   6   7   8   9
     *  Example: |  |  |  |  |   |   |   |   |   |  
     *    arr = [2, 4, 6, 9, 11, 12, 14, 20, 36, 48]
     *    TARGET = 36
     *    mid = 0 - 9/2 = 4
     *    arr[mid] = 11
     *    TARGET > arr[mid] => Search in the right half of the array
     *    mid = 5 - 9/2 = 7
     *    arr[mid] = 12
     *    TARGET > arr[mid] => Search in the right half of the array
     *    mid = 7
     *    arr[mid] = 20
     *    TARGET > arr[mid] => Search in the right half of the array
     *    mid = 8
     *    arr[mid] = 36
     *    TARGET == arr[mid] => return mid
     *    return mid = 8
     * 
     *  Time Complexity:
     *   Best Case: O(1) => When the middle element is the target element
     *   Worst Case: O(log n) => When the target element is not present in the array
     *   
     *  Why Binary Search?
     *     - Binary search is faster than linear search
     *     - Binary search is preferred over linear search when the array is sorted
     * Q: Find the max number of comparisons required to find the target element in the array
     * 
     * Linear search:
     *    Will make n comparisons
     *    n = arr.length
     *    n = 10000 
     *    10000 comparisons
     * Binary search:
     *   Will make log n comparisons
     *   n = arr.length
     *   n = 10000
     *   log n = 13.28
     *   13 comparisons     
     *
    */

    // Return the index of the target element
    // If the target element is not present in the array, return -1
    public static int AscendingSortedBinarySearch(int[] arr, int target) {
        // Search space is arr[start..end]
        int start = 0;
        
        int end = arr.length - 1;
        while (start <= end) {
            
            // Find the middle element
            // int mid = (start + end) / 2; // This can cause integer overflow if the sum of start and end is greater than the range of int causing exceeding the range of int and giving a negative number
            int mid = start + (end - start) / 2; // This is the better way to find the middle element
            if (target < arr[mid]) {

                // Search in the left half
                end = mid - 1;
            } else if (target > arr[mid]) {
                // Search in the right half
                start = mid + 1;
            } else {
                // target == arr[mid]
                return mid;
            }
        }
        // target is not present in the array
        return -1;
    }

    /* 
     * Order-Agnostic Binary Search
     *      You don't know whether the array is sorted in ascending or descending order
     *      
     * arr = [90, 75, 18, 12, 6, 4, 3, 1]
     * 
     * 

    */
    public static int DescendingSortedBinarySearch (int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <=end){
            int midpoint = start + (end - start) /2;
            
            if (target > arr[midpoint]){
                end = midpoint - 1;
            }
            else if (target < arr[midpoint]){
                start = midpoint + 1;
            }
            else {
                return midpoint;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 5, 15, 16, 18, 22, 45, 67, 89, 90, 100};
        int [] arr2 = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 22;
        System.out.println(AscendingSortedBinarySearch(arr, target)); // 11
        System.out.println(DescendingSortedBinarySearch(arr2, 75)); // 1

    }
}
