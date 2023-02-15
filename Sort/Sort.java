// Dhruv Patel
// 10/17/2022
// CAC210 Sorting Project #2
// Dr.Wagner 

// Remove package when running
package Sort;

import bridges.base.LineChart;
import bridges.benchmark.SortingBenchmark;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class Sort {

  // This is how you would add a helper method your sorting
  // algorithm may need. For example, quicksort uses partition
  // Zybook 3.2/3.3
  // Selection Sort
  static Consumer <int[]> SelectionSort = arr -> {

  // Implement selection sort - treats the input as two parts, a sorted and unsorted parts as variable i and j keeps track of the two parts.

  // For loop as i starts a 1 loops through  incrementing by one to the right each loop.
	  for (int i = 0; i < arr.length - 1; i++) {

	         // Find index of smallest remaining element
	         int indexSmallest = i;

           // For loop to searches the unsorted part of the array for the smallest element indexSmallest that stores the index of the smallest element found . 
           // ReLoops till all elements are sorted
	         for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < arr[indexSmallest]) {
	               indexSmallest = j;
	            }
	         }
	        
	         // Swap arr[i] and arr[indexSmallest]
	         int temp = arr[i];
	         arr[i] = arr[indexSmallest];
	         arr[indexSmallest] = temp;
	      }
  };
  //Built in java sort method
  static Consumer <int[]> javaSort = arr -> {
    Arrays.sort(arr);

  };
  // Built in java sort method
  // Zybook 3.4/3.5
  // Insertion sort
  static Consumer <int[]> InsertionSort = arr -> {

  // Implement insertion sort - treats the input as two parts, a sorted part and a unsorted part that repeatedly inserts the next value from the unsorted part into the correct location in the sorted part. 

    // For loop as i starts at 1 of the unsorted list, checks to see if the current element being inserted is smallest then all of the element in the sorted part as i is incremented to the next element in the unsorted part.
    for (int i = 1; i < arr.length; i++) {

      // Keeps track of current element within index i
      int j = i;
      
      // While loop to insert arr[i] into sorted part stopping once arr[i] is in the correct position. until index 0 is reached.
      // j keeps track of the index of the current element being inserted into the sorted part.
      while (j > 0 && arr[j] < arr[j-1]) {
        
        // Swap arr[j] and arr[j -1]
        int temp = arr[j];
        arr [j] = arr[j-1];
        arr[j - 1] = temp;

        // If the current element is less than the element to the left, the values are swapped. 
        j--;
      }
    }
  };   
  
  // Zybook 13.1
  // Bubble Sort
  static Consumer <int[]> BubbleSort = arr -> {
  
  // Implement Bubble Sort - iterates through a list, comparing and swapping adjacent elements if the second elements is less than the first element it sorts within the list. Uses nested loop to only swap adjacent elements always O(N^2).  

    // For loop as i start at index 0, as long as i is less then array length - 1 then the loop will continue incrementing i each loop 
    for (int i = 0; i < arr.length - 1; i++) {

      // For loop as j is = to 0, as long as j is less than the array length - 1 and - 1 value then j will be incremented by one each loop
      for (int j = 0; j < arr.length - i - 1; j++) {

        // If loop to swap the adjacent element as long as the value of j is greater then j+1 within the array until array is sorted.
        if (arr[j] > arr[j+1]) {

            // Swaps arr[j] and arr [j+1] as loop continues.
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
      }
    }
  };
  
// NOTE: Within 3 sorting algorithms: Insertion Sort was found to be the fastest as the best case scenario, followed by Selection Sort as the average case scenario, and Bubble Sort with the worst runtime and worst case scenario. 

// Big-O notation 
// Insertion Sort: O(N^2) - Worst case scenario
// Selection Sort: O(N^2) - Worst case scenario
// Bubble Sort: O(N^2) - Worst case scenario

  public static void main(String[] args) throws IOException, RateLimitException, InterruptedException {

	
    Bridges bridges = new Bridges(32, "Dhruv", "136398531999");

    bridges.setTitle("Sorting Benchmark");
    bridges.setDescription("Sorting Benchmark test");

    LineChart plot = new LineChart();
    plot.setTitle("Sort Runtime");
    SortingBenchmark bench = new SortingBenchmark(plot);
    bench.linearRange(100, 10000, 20);
    bench.setTimeCap(1000 * 1); //1 seconds

    // Add your sorting algorithms to the benchmark
    bench.run("Selection Sort", SelectionSort);
    bench.run("Java Sort", javaSort);
    bench.run("Insertion Sort", InsertionSort);
    bench.run("Bubble Sort", BubbleSort);

    // Visualize the plot
    bridges.setDataStructure(plot);
    bridges.visualize();

    bridges.setDataStructure(plot);
    bridges.visualize();

    bridges.setDataStructure(plot);
    bridges.visualize();

    bridges.setDataStructure(plot);
    bridges.visualize();
  }

}

