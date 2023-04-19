public class LinearSearch {
    /*
     * Linear Search
     * 
     *  Searching : It is the process of finding a particular element in a given array.
     *  Linear Search : 
     *      It is the simplest searching algorithm. 
     *      It is used to search for an element in an array.
     *      In sequential search, we compare the target value with all the elements in the array.
     * 
     *          i   i  i  [i]
     *          0   1  2   3   4   5  6
     * arr = [ 18, 12, 9, 14, 77, 50, 6 ]  (unsorted array)
     * Q: Find whether 14 exists in the array or not
     * TARGET = 14 The target value is compared with all the elements in array in sequential order.
     * if no value is found, then the target value is not present in the array return -1
     * 
     *  Time Complexity : Best case O(1) : Worst case O(n) n=> size of array 
     *  Space Complexity : O(1)
     *      How many checks will the loop make in the best case
     *          i.e element found at the first index. =  1 comparison if target is found at the first index 
     *      Worst Case: You do not find the element in the array.
     *          iterate through every time and check if the element is present and return there was no target element in the array.
     *          Size of array = n
     *              n=> size of array = 100 => 100 comparisons
     *                  100 => 100 comparisons
     *                  100000 => 100000 comparisons
    */
    
    // search in the array and return the index of the element if found
    // else return -1
    static int linearSearch(int[] arr, int target){
        
        // if the array is empty return -1
        if (arr.length == 0){
            return -1;
        }

        // traverse the array from start to end 
        for (int i = 0; i < arr.length; i++){

            // check for the target element
            if (arr[i] == target) {

                // if the target element is found, return the index
                return i;
            }
        }

        // else if the target element is not found in the array, return -1
        return -1;
    }

    // search the target and return the index of the element if found
    // else return -1
    static int linearSearch2(int[] arr, int target){
        
        // if the array is empty return -1
        if (arr.length == 0){
            return -1;
        }

        // traverse the array from start to end 
        for (int element : arr){

            // check for the target element
            if (element == target) {

                // if the target element is found, return the index
                return element;
            }
        }

        // else if the target element is not found in the array, return -1
        return -1;
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        
        // if the array is empty return -1
        if (arr.length == 0){
            return false;
        }

        // traverse the array from start to end 
        for (int element : arr){

            // check for the target element
            if (element == target) {

                // if the target element is found, return the index
                return true;
            }
        }

        // else if the target element is not found in the array, return -1
        return false;
    }

    // search for a character in a string and return true or false if found
    static boolean SearchInStrings(String str, char target){
        
        // if the array is empty return -1
        if (str.length() == 0){
            return false;
        }

        // traverse the array from start to end 
        for (int i = 0; i < str.length(); i++){
        // for (char element : str.toCharArray()){
            // if (element == target){
                // return true;

            // check for the target element
            if (str.charAt(i) == target) {
            

                // if the target element is found, return the index
                return true;
            }
        }

        // else if the target element is not found in the array, return -1
        return false;
    }

    // search for a character in a string and return the index of the character if found
    // else return -1
    static int SearchInStrings2(String str, char target){
        
        // if the array is empty return -1
        if (str.length() == 0){
            return -1;
        }

        // traverse the array from start to end 
        for (int i = 0; i < str.length(); i++){

            // check for the target element
            if (str.charAt(i) == target) {

                // if the target element is found, return the index
                return i;
            }
        }

        // else if the target element is not found in the array, return -1
        return -1;
    }

    public class LinearAssignment {
        static int SearchInRange(int [] arr, int target, int start, int end){
            // if the array is empty return -1
            if (arr.length == 0){
                return -1;
            }

            // traverse the array from start to end 
            for (int i = start; i <= end; i++){

                // check for the target element
                if (arr[i] == target) {

                    // if the target element is found, return the index
                    return i;
                }
            }

            // else if the target element is not found in the array, return -1
            return -1;
        }

        static int MaximumNumber(int[] arr){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i : arr){
                if (i > max){
                    max = i;
                }
                if (i < min){
                    min = i;
                }
            
            }
            // return min and max
            return min;
            // return max;

        }

        static int[] TwoDArray(int [][]arr, int target){
            if (arr.length == 0 || arr[0].length == 0){
                return -1;
            }

            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    if (arr[i][j] == target){
                        return new int[] {i, j};
                    }
                }
            }

            return -1;

        }
    }

    public static void main(String[] args) {
        int[] arr = {18, 12, 9, -7, 3, 14, 77, 50, 6};
        int target = 14;
        System.out.println(LinearSearch.linearSearch(arr, target));
        System.out.println(LinearSearch.linearSearch2(arr, target));
        System.out.println(LinearSearch.linearSearch3(arr, target));
        System.out.println(LinearSearch.SearchInStrings("Hello", 'e'));
        System.out.println(LinearSearch.SearchInStrings2("Hello", 'e'));

        System.out.println('\n');
        System.out.println(LinearSearch.LinearAssignment.SearchInRange(arr, target, 1, 7));
        System.out.println(LinearSearch.LinearAssignment.MaximumNumber(arr));
        System.out.println(LinearSearch.LinearAssignment.TwoDArray(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, 9));
    }
}
    
