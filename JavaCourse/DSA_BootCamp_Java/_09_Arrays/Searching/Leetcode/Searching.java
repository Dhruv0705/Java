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

    /*
     * 704. Binary Search [EASY]
     * https://leetcode.com/problems/binary-search/
     * 
     *      Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. 
     *      If target exists, then return its index, otherwise return -1.
     * 
     *      Input: nums = [-1,0,3,5,9,12], target = 9
     *      Output: 4
     * 
     *      Input: nums = [-1,0,3,5,9,12], target = 2
     *      Output: -1
     * 
     *      Note: Binary Search
     * 
    */

    static int BinarySearch704(int [] nums, int target){
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

        return -1;
    }

    /* 852. Peak Index in a Mountain Array [MEDIUM]
     * https://leetcode.com/problems/peak-index-in-a-mountain-array/
     * 
     *      Let's call an array A a mountain if the following properties hold:
     *      A.length >= 3
     *      There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     *      Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
     *      
     *      Input: [0,1,0]
     *      Output: 1
     *      
     *      Input: [0,2,1,0]
     *      Output: 1
     *      
     *      bionic array
     *          2
     *        1  1
     *       0    0
     * 
     *      Find the max number in the array
     * 
    */

    static int PeakIndexInMountainArray852(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int midpoint = start + (end - start) / 2;

            if(arr[midpoint] > arr[midpoint + 1]){
                // in increasing part of the array [left]
                // this could be the answer
                // but we need to check the left side
                end = midpoint;
            }
            else{
                // in decreasing part of the array [right]
                start = midpoint + 1; // we can eliminate the midpoint as mid+1 is greater then mid
            }
        }
        // in the end, start == end and points to the max element in the array
        // start and end are both trying to find the max element in the 2 checks
        // hence, we can return either start or end as they are both pointing to the max element
        return start;

    }

    /*
     * 162. Find Peak Element [MEDIUM]
     * https://leetcode.com/problems/find-peak-element/
     * 
     *      A peak element is an element that is strictly greater than its neighbors.
     *      Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks. 
     *      You may imagine that nums[-1] = nums[n] = -∞.
     *      You must write an algorithm that runs in O(log n) time.
     *      
     *      Input: nums = [1,2,3,1]
     *      Output: 2
     *      
     *      Input: nums = [1,2,1,3,5,6,4]
     *      Output: 1 or 5   
     *  
     *      Find the max number in the array
     *      Note very similar to 852
    */

    static int FindPeakElement162(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int midpoint = start + (end - start) / 2;

            if(arr[midpoint] > arr[midpoint + 1]){
                // in increasing part of the array [left]
                // this could be the answer
                // but we need to check the left side
                end = midpoint;
            }
            else{
                // in decreasing part of the array [right]
                start = midpoint + 1; // we can eliminate the midpoint as mid+1 is greater then mid
            }

        }
        // in the end, start == end and points to the max element in the array
        // start and end are both trying to find the max element in the 2 checks
        // hence, we can return either start or end as they are both pointing to the max element
        return -1;
    }

    /*
     * 1095. Find in Mountain Array [HARD]
     * https://leetcode.com/problems/find-in-mountain-array/
     * 
     *      (This problem is an interactive problem.)
     *      You may recall that an array A is a mountain array if and only if:
     *      A.length >= 3
     *      There exists some i with 0 < i < A.length - 1 such that:
     *      A[0] < A[1] < ... A[i-1] < A[i]
     *      A[i] > A[i+1] > ... > A[A.length - 1]
     * 
     *      Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
     *          If such an index doesn't exist, return -1.
     * 
     *          You can't access the mountain array directly.  You may only access the array using a MountainArray interface:
     * 
     *          MountainArray.get(k) returns the element of the array at index k (0-indexed).
     *          MountainArray.length() returns the length of the array.
     * 
     *      Input: array = [1,2,3,4,5,3,1], target = 3
     *      Output: 2
     * 
     *      Input: array = [0,1,2,4,2,1], target = 3
     *      Output: -1
     * 
     * Find the peak element in the array
     * Search in the left side of the peak element ascending order
     * if not found binary search in the right side of the peak element descending order
    */

    static int FindInMountainArray1095 (int[] arr, int target){
        int peak = PeakIndexInMountainArray(arr);
        // search in the left side
        int left = orderAgnosticBS(arr, target, 0, peak);
        if(left != -1){
            return left;
        }
        // search in the right side
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int PeakIndexInMountainArray(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int midpoint = start + (end - start) / 2;

            if(arr[midpoint] > arr[midpoint + 1]){
                // in increasing part of the array [left]
                // this could be the answer
                // but we need to check the left side
                end = midpoint;
            }
            else{
                // in decreasing part of the array [right]
                start = midpoint + 1; // we can eliminate the midpoint as mid+1 is greater then mid
            }
            
        }
        return start;
    }
    
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    /* LeetCode 33. Search in Rotated Sorted Array [MEDIUM]
     * https://leetcode.com/problems/search-in-rotated-sorted-array/
     * 
     *      Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
     *      (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
     *      You are given a target value to search. If found in the array return its index, otherwise return -1.
     *      You may assume no duplicate exists in the array.
     *      Your algorithm's runtime complexity must be in the order of O(log n).
     * 
     *      Input: nums = [4,5,6,7,0,1,2], target = 0
     *      Output: 4
     * 
     *      Input: nums = [4,5,6,7,0,1,2], target = 3
     *      Output: -1
     * 
     * 1. Find the pivot element pivot is largest element in the array
     * 2. Search in the left side of the pivot element 0 to pivot - 1
     * 3. Search in the right side of the pivot element pivot + 1 to n - 1
     * 
     * When the mid element is greater than the next mid element that is the pivot element
     * or when the mid element is smaller than the previous mid element that is the pivot element
     * 
     * Test cases:
     * if pivot element==target return pivot
     * if target is greater than or equal to arr[0] search in the left side
     * else search in the right side
     * 
    */
    
    static int SearchInRotatedSortedArray33(int [] arr, int target){
        int pivot = FindPivot(arr);

        // if pivot is -1, it means the array is not rotated
        if(pivot == -1){

            // just do normal binary search
            return orderAgnosticBS(arr, target, 0, arr.length - 1);
        }
        // if pivot is found, search in the two subarrays around pivot
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            // search in the left side
            return orderAgnosticBS(arr, target, 0, pivot - 1);
        }
        // search in the right side
        return orderAgnosticBS(arr, target, pivot + 1, arr.length - 1);
    }

    static int FindPivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int midpoint = start + (end - start) / 2;

            if(midpoint < end && arr[midpoint] > arr[midpoint + 1]){
                return midpoint;
            }
            if(midpoint > start && arr[midpoint] < arr[midpoint - 1]){
                return midpoint - 1;
            }
            if(arr[start] >= arr[midpoint]){
                // the pivot is in the left side
                end = midpoint - 1;
            }
            else{
                // the pivot is in the right side
                start = midpoint + 1;
            }
        }
        // pivot is not found
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

        int [] nums704 = {-1,0,3,5,9,12};
        int target704 = 9;
        System.out.println(BinarySearch704(nums704, target704));

        int [] nums852 = {0,1,0};
        System.out.println(PeakIndexInMountainArray852(nums852));

        int [] nums162 = {1,2,1,3,5,6,4};
        System.out.println(FindPeakElement162(nums162));

        int [] nums1095 = {0,1,2,4,2,1};
        int target1095 = 4;
        System.out.println(FindInMountainArray1095(nums1095, target1095));
        
        int [] nums33 = {4,5,6,7,0,1,2};
        int target33 = 3;
        System.out.println(SearchInRotatedSortedArray33(nums33, target33));
    
        
    
    }

    
}
