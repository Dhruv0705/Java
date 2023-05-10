public class BubbleSort {

    /*
     *  Bubble Sort
     *     -   Bubble sort is a simple sorting algorithm. This sorting algorithm
     *          is comparison-based algorithm in which each pair of adjacent elements
     *          is compared and the elements are swapped if they are not in order.
     *          sorted step by step.
     *      
     *      - What are we doing?
     *          -   We are comparing two adjacent elements and swapping them if they are not in order.
     *          -   We are doing this for every element in the array.
     *          if 3 is greater then 1, True : swap them
     *          if 3 is greater then 5, false : do not swap them
     *          
     *       - Why 
     *          With the first iteration, we are guaranteed to have the largest element at the end of the array.
     *          With the second iteration, we are guaranteed to have the second largest element at the end of the array.
     *          and so on...
     * 
     *          Meaning the first loop will have the largest element at the end of the array.
     *          1, 3, 5, 4, 2 | The loop will continue until the largest element is at the end of the array.
     *              In this case 5 so the loop will stop will it becomes 1, 3, 4, 2, 5 then the next loop with 4 | 1, 3, 2, 4, 5
     *              Next time no need to compare the last element because it is already sorted. 4 < 5
     * 
     *  3, 1, 5, 4, 2 | 3 > 1, swap them
     *  1, 3, 5, 4, 2 | 3 < 5, do not swap them
     *  1, 3, 4, 5, 2 | 5 > 2, swap them
     *  1, 3, 4, 2, 5 | 4 > 2, swap them  
     *  1, 3, 2, 4, 5 | 3 > 2, swap them
     *  1, 2, 3, 4, 5 | 3 < 4, do not swap them
     * 
     *  
     * 
     * 
     * 
    */

    public static void main(String[] args) {
        
    }
}
