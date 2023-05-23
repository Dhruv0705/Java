import java.util.Arrays;

public class SelectionSort {
    
    /*
     * Selection Sort:
     * 
     *  1. Find the smallest element in the array and swap it with the element at the first index.
     *  2. Find the second smallest element in the array and swap it with the element at the second index.
     *  3. Repeat this process till the entire array is sorted.
     * 
     *  4, 5, 1, 2, 3  
     *  4, 3, 1, 2, 5
     *  2, 3, 1, 4, 5
     *  2, 1, 3, 4, 5
     *  1, 2, 3, 4, 5
     * 
     *  Time Complexity: O(n^2)
     *  
     *  
     */
    static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
