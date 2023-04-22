import java.util.Arrays;

public class Searching {

    /*
     *  If you see a sorted array: [arr = [2,4,6,8,9,11,15]]
     *      Try applying binary search first
     * 
    */

    // Celling of a number: arr = [2,4,6,8,9,11,15]
    //      Ceiling = smallest element in array greater or = target
    //      Ceiling (arr, target = 14) = 14
    //      Ceiling (arr, target = 10) = 11
    //      Ceiling (arr, target = 16) = -1
    // return arr index start because start is the smallest element in array greater or = target
    static int Ceiling(int [] arr, int target){

        // If target is greater than all elements in array return -1
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if(target > arr[midpoint]){
                start = midpoint + 1;
            }
            else if (target < arr[midpoint]){
                end = midpoint - 1;
            }  
            else{
                return midpoint;
            }
        }
        // If target is greater than all elements in array return the last element
        return arr[start];
    }

    // Floor of a number: arr = [2,4,6,8,9,11,15]
    //      Floor = largest element in array smaller or = target
    //      Floor (arr, target = 14) = 11
    //      Floor (arr, target = 10) = 9
    //      Floor (arr, target = 16) = 15
    // return arr index end because end is the largest element in array smaller or = target
    static int Floor(int [] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if(target > arr[midpoint]){
                start = midpoint + 1;
            }
            else if (target < arr[midpoint]){
                end = midpoint - 1;
            }  
            else{
                return midpoint;
            }
        }
        // If target is greater than all elements in array return the last element
        // return the index
        return end;
    }

    /*
     * Leetcode 35: Search Insert Position [EASY]
     *    Given a sorted array of distinct integers and a target value, return the index if the target is found.
     *      If not, return the index where it would be if it were inserted in order.
     *      You must write an algorithm with O(log n) runtime complexity.
     *  
     *    Input: nums = [1,3,5,6], target = 5
     *    Output: 2
     *     
     * 
     *   Binary Search as you are given a ascending sorted array find the target
     * 
    */
    static int searchInsert(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if (target > nums[midpoint]){
                start = midpoint + 1;
            }
            else if (target < nums[midpoint]){
                end = midpoint - 1;
            }
            else{
                return midpoint;
            }
        }
        // If target is greater than all elements in array return the last element
        // return the index
        return start;
    }

    /*
     * Leetcode 744: Find Smallest Letter Greater Than Target [EASY]
     * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
     * 
     *     Given a characters array letters that is sorted in non-decreasing order and a character target, 
     *     return the smallest character in the array that is larger than target.
     *     Note that the letters wrap around.
     *          For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
     *                       Input: letters = ["c","f","j"], target = "a"
     *                       Output: "c"
     */
    static int nextGreatestLetter744(char [] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;

            if (target < letters[midpoint]){
                end = midpoint - 1;
            }
            else{
                start = midpoint + 1;
            }
        }

        // If target is greater than all elements in array return the first element
        // return the letter
        return letters[start % letters.length];

    }

    /*
     * 34. Find the first and last position of an element in sorted array [MEDIUM]
     * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
     * 
     *      Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
     *      If target is not found in the array, return [-1, -1].
     *      You must write an algorithm with O(log n) runtime complexity.  
     * 
     *      Input: nums = [5,7,7,8,8,10], target = 8
     *      Output: [3,4]
     * 
     *      Input: nums = [5,7,7,7,7,8,8,10], target = 7
     *      Output: [1,4]
     * 
     *      Input: nums = [5,7,7,7,7,8,8,10], target = 6
     *      Output: [-1,-1]
     * 
     *      Note: Binary Search
     *            Run two binary searches to find the first occurrence and last occurrence of target
     *            Find the first occurrence of target
     *            If the target is found, search the left half of the array, otherwise 
     * 
    */
    static int[] FirstAndLastPosition34(int[]nums, int target){
        int [] ans = {-1, -1};

        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int [] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if (target > nums[midpoint]){
                start = midpoint + 1;
            }
            else if (target < nums[midpoint]){
                end = midpoint - 1;
            }

            // IF were trying to find the start index then bring end closer else were trying to find the end index and bring start closer a rerun binary search
            else{
                
                // potential answer found
                ans = midpoint;

                // if the target is found, search the left half of the array, otherwise search right
                if (findStartIndex){
                    end = midpoint - 1;
                }
                else{
                    start = midpoint + 1;
                }
            }
        }
        return ans;
    }

    /*
     * Leetcode 702: Search in a Sorted Array of Unknown Size [MEDIUM]
     * https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/
     * 
     *      Given an integer array sorted in ascending order, write a function to search target in nums.
     *      If target exists, then return its index, otherwise return -1. However, the array size is unknown to you.
     *      You may only access the array using an ArrayReader interface, where ArrayReader.get(k) returns the element of the array at index k (0-indexed).
     *      You may assume all integers in the array are less than 10000, and if you access the array out of bounds, ArrayReader.get will return 2147483647.
     *      
     *      Input: array = [-1,0,3,5,9,12], target = 9
     *      Output: 4
     *      
     *      Input: array = [-1,0,3,5,9,12], target = 2
     *      Output: -1
     * 
     * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
     *      Assume you don't know the size of the array
     *      Cannot use arr.length to find the end of the array
     *      Keep Doubling the index to find the end of the array
     * 
    */
    static int FindPositionInInfiniteNumbers(int[] nums, int target){

        // first find the range where the target may be present
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        /// condition for the target to lie in the range
        //  the target should be greater then the element at the end index position of the array

        // while the target is greater then the element at the end index position, double the box size
        while (target > nums[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int [] nums, int target, int start, int end){
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if (target > nums[midpoint]){
                start = midpoint + 1;
            }
            else if (target < nums[midpoint]){
                end = midpoint - 1;
            }
            else{
                return midpoint;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Ceiling( arr, target)); // 16 index 5
        System.out.println(Floor( arr, target)); // 14 index 4
        System.out.println(searchInsert(arr, target)); // 5

        char [] letters = {'c','f','j'};
        char target744 = 'a';
        
        System.out.println((char)nextGreatestLetter744(letters, target744));

        int [] nums = {5,7,7,7,7,8,8,10};
        int target34 = 7;
        System.out.println(Arrays.toString(FirstAndLastPosition34(nums, target34)));

        int [] nums702 = {-1,0,3,5,9,12};
        int target702 = 9;
        System.out.println(FindPositionInInfiniteNumbers(nums702, target702));

    }
}
