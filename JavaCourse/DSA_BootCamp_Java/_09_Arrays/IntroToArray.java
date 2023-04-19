import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntroToArray {
    /*
     * Arrays and ArrayList:
     *  How Arrays Work
     *  Memory Management
     *  Input and Output
     *  Multi-Dimensional Arrays
     *  Dynamic Arrays
     *  Function Arrays
     *  Questions
    */

    /* Why Arrays?
     *  1. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
     *  2. To access an array element, we refer to an index number. This is much faster than accessing each variable separately.
     *  3. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
     *  4. To access an array element, we refer to an index number. This is much faster than accessing each variable separately.
     * 
     * Q: Store a roll number
     *   int rollNumber = 1;
     * 
     * Q: Store a person's name
     *   String name = "John";
     * 
     * Q: Store 3 roll numbers;
     *  int rollNumber1 = 1;
     *  int rollNumber2 = 2;
     *  int rollNumber3 = 3;
     * 
     * Solution: Use an array
     * int[] rollNumbers = {1, 2, 3};
     * 
     * Q: Store 3 names
     * String[] names = {"John", "Mary", "Bob"};
     * 
     * Syntax:
     * datatype[] variable_name = new datatype{value1, value2, value3};
     * 
    */
    /* 
     * How Array Works:
     *  int [] ros; // Declaration of array, ros is getting defined in the stack memory
     *  ros = new int[5]; // Initialization of array, ros is getting defined in the heap memory
     *      new is a keyword that creates an object in the heap memory 
     *      Must specify the size of the array when initializing
     * 
     *  int [] arr = new int[5]; // Declaration and Initialization of array
     *  |    |  |        | 
     *  Data Type     Create array of int data type with size 5 [Initialize array]
     *      |  |   
     *      Create array of int data type
     *         |
     *         Reference variable
     * 
     * Every single element in the array is an array itself 
     * Contiguous memory allocation
     *   means that the memory locations are allocated in a sequential manner
     *   Memory is allocated in the heap memory and the reference variable is stored in the stack memory
     *   The size of the array is fixed at the time of initialization
     *   The elements of the array are accessed using the index 
     *   The index starts from 0 and ends at size-1
     * 
     * Dynamic Memory Allocation
     * 
     * Index of the array
     *   Index of the array is like the position of the element in the array
     *   The index starts from 0 and ends at size-1
     *   [3,8,19,12,7,28,33]
     *   print(arr[0]); // print the first value of the array which is 3
     *   arr[3] = 5; // set the 4th value of the array to 5
     *   
     *   int [][] arr = {
     *      {1,2,3}, // 0th index
     *      {4,5}, // 1st index
     *      {6,7,8,9} // 2nd index -> arr[2] = {6,7,8,9} -> arr[2][0] = 6
     *  };
     * 
     * Length of the array
     *  int size = arr.length; // get the size of the array
     *  System.out.println(size); // print the size of the array
     * 
     *  int [][] arr = {
     *     {1,2,3},
     *     {4,5},
     *     {6,7,8,9}
     * };
     * 
     *  System.out.println(arr.length); // print the Number of rows
     * 
     * 
     * 
     * 
    */      

    public class Arr{
        // All the types of the array should be the same type
        // Store 5 roll number in an array
        public static void RollNumbers (){
            int[] rollNumbers = new int [5]; // 5 is the size of the array
            rollNumbers[0] = 1; // 0 is the index of the array set to 1
            rollNumbers[1] = 2; // 1 is the index of the array set to 2
            rollNumbers[2] = 3; // 2 is the index of the array set to 3
            rollNumbers[3] = 4; // 3 is the index of the array set to 4
            rollNumbers[4] = 5; // 4 is the index of the array set to 5
            System.out.println(rollNumbers[4]); // print the first value of the array
        }

        public static void RollNumbers2 () {
            int[] rollNumbers = {1, 2, 3, 4, 5}; // set the array to 1,2,3,4,5 values
            System.out.println(rollNumbers[0]); // print the first value of the array
            
            System.out.println('\n');
        }

        public static void ManualArray () {
            int [] arr = new int[5]; // create an array of int data type with size 5 all set to 0
            arr[0] = 21; // set the 1st value of the array to 21
            arr[1] = 45; // set the 2nd value of the array to 45
            arr[2] = 78; // set the 3rd value of the array to 78
            arr[3] = 90; // set the 4th value of the array to 90
            arr[4] = 12; // set the 5th value of the array to 12

            // prints [21, 45, 78, 90, 12]
            System.out.println(Arrays.toString(arr)); // print the array
            System.out.println(arr[3]); // print the 4th value of the array

            System.out.println('\n');
        }

        public static void IntArray () {
            // create an array of int data type with values 
            int[] arr = {15, 30, 45, 60, 75};
            System.out.println(arr[0]); // print the first value of the array

            arr[3] = 5; // set the 4th value of the array to 5
            System.out.println(Arrays.toString(arr)); // print the array
        
            int size = arr.length; // get the size of the array
            System.out.println("Size = " + size); // print the size of the array

            // create an array of int data type with size 5 all set to 0
            int[] arr2 = new int[5];
            System.out.println(Arrays.toString(arr2)); // print the array

            System.out.println('\n');
        }

        public static void StringArray () {
            // create an array of String data type with values 
            String[] arr = {"John", "Mary", "Bob"};
            System.out.println(arr[0]); // print the first value of the array

            arr[2] = "Alice"; // set the 3rd value of the array to Alice
            System.out.println(Arrays.toString(arr)); // print the array
        
            int size = arr.length; // get the size of the array
            System.out.println("Size = " + size); // print the size of the array

            // create an array of String data type with size 5 all set to null
            String[] arr2 = new String[5];
            System.out.println(Arrays.toString(arr2)); // print the array
        
            System.out.println('\n');
        }

        public static void InputArrayLoop () {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5]; // will only work with 5 values because the size is 5
            
            // starting at 0 if i is less than the length of the array increment loop by 1
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt(); // set the value of the array to the input
            }
            System.out.println(Arrays.toString(arr)); // print the array

        }

        public static void ForEachArray () {
            
            Scanner sc = new Scanner(System.in);
            int[] arr = {54, 89, 216}; // will only work with 5 values because the size is 5
            
            // for each loop
            for (int num : arr) {
                System.out.print(num + " "); // num represents element of the array
            }
            System.out.println();
        }

        public static void ArrayOfStringObject(){

            Scanner input = new Scanner(System.in);
            String [] str = new String[5];
            for (int i = 0; i < str.length; i++){
                str[i] = input.next();
            }

            System.out.println(Arrays.toString(str));
        }

        public static void Change(int[] arr){
            arr[0] = 100;
        }

        public static void MultiDimensionArray(){
            /*
             *  Multi Dimensional Array
             *  Or 2-D Array Matrix
             *   
             *    1 2 3
             *    4 5 6
             *    7 8 9
             * 
             * // 3 rows and 4 columns
             * Rows is mandatory
             * Columns is optional
             * 
             * 
             * int [][] arr = new int[3][4];
             * 
             * Image this as a table or array of arrays
             *  With each row being an array 
             *  And each column being an element of the array
            */
        
            int [][] arr = new int[3][4];
            int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
            int [][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };

            arr  [0][0] = 1;
            arr3 [0][1] = 2;
            
            System.out.println(Arrays.toString(arr2[1])); // 4,5,6 prints the index 1 row
            System.out.println(arr2[1][2]); // 6 prints the index 1 row and index 2 column

            int arr2d[][] = {{1,2,3}, {4,5}, {6,7,8,9}}; // 3 rows and 4 columns
            System.out.println(arr2d[0][2]); // 3
            System.out.println(arr2d[1][1]); // 5
            
        }

        public static void TwoDInputArray (){
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[3][3]; // will only work with 5 values because the size is 5
            
            // starting at the first row [0] as long as i is less then the amount of rows in the array increment loop by 1 moving to the next row
            for (int i = 0; i < arr.length; i++) {

                // starting at the first element in the colum if the row index of the column is less than the length of the array increment loop by 1 moving the the next column
                for (int j = 0; j < arr[i].length; j++) {

                    arr[i][j] = sc.nextInt(); // set the value of the array to the input
                }
            }
            System.out.println(Arrays.toString(arr)); // print the array
        }

        public static void ForLoopArray(){
            int[][] arr = {{1,2,3}, {4,5}, {6,7,8,9}}; // 3 rows and 4 columns

            // starting at the first element in the row if the row is less than the length of the array increment loop by 1
            for (int row=0 ; row < arr.length ; row++) {
                // for each column in every row index
                for (int col=0 ; col < arr[row].length ; col++) {
                    System.out.print(arr[row][col] + " "); // print the value of the array
                }
                System.out.println(); // print a new line matrix style 
            }
        }

        public static void ForEachArray2(){
            int[][] arr = {{1,2,3}, {4,5}, {6,7,8,9}}; // 3 rows and 4 columns
            for(int [] row : arr) {
                System.out.println(arr);
            }
        }

        public static void DynamicArray () {
            int [][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
            };

            for(int row = 0; row < arr.length; row++){
                for(int col = 0; col < arr[row].length; col++){
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
                
            }
        }

        public static void ArrayListExampleNFunctions(){

            // Syntax Create a array list of type integer with a size of 10
            // <> means generic type that creates a type of array list that can only hold that type of Wrapper classes only.
            ArrayList<Integer> list = new ArrayList<Integer>();

            // array list functions
            list.add(67); // adds 67 to the array list
            list.add(89); // adds 89 to the array list
            list.add(90); // adds 90 to the array list
            list.add(100); // adds 100 to the array list
            list.add(945); // adds 45 to the array list
            list.add(216); // adds 216 to the array list


            list.add(1, 45); // adds 45 to the array list at index 1
            list.remove(2); // removes the value at index 2
            list.set(0, 100); // sets the value at index 0 to 100
            
            System.out.println(list); // prints the array list
            System.out.println(list.contains(90)); // checks if the array list contains 90 true or false
        }

        public static void ArrayListMultiDetention(){
            Scanner input = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
            

            // Initialize the array list
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<Integer>());
            }

            // Add values to the array list
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    list.get(i).add(input.nextInt());
                }
            }

            // Print the array
            for(ArrayList<Integer> row : list){
                for(int val : row){
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            // Print the array 2
            System.out.println(list);
        }
    }

    public class Assignment {
        public class SwapValuesInArray{
            public static void SwapValues(){
                int [] arr = {1,3,23,9,18};
                swap(arr, 4, 2 );
    
                System.out.println(Arrays.toString(arr));
            }
    
            public static void swap(int [] arr, int index, int index2){
                int temp = arr[index];
                arr[index] = arr[index2];
                arr[index2] = temp;
            }
        }

        public class MaximumValueInArray{
            public static void MaxValue(){
                int [] arr = {15,87,31,18,9};
                System.out.println(maxRange(arr, 1, 3));
            }
            

            static int maxRange(int [] arr, int start, int end){
                
                // edge case
                // if array is empty
                if (arr.length == 0){
                    return -1;
                }

                int max = arr[start]; // set the max value to the first element in the array
                //int max = Integer.MIN_VALUE; // this is the smallest value that an integer can be

                for(int i = start; i <= end; i++){
                    if(arr[i] > max){
                        max = arr[i];
                    }
                }
                return max;
            }
        }

        public class ReverseArray {
            public static void Reverse(){
                int [] arr = {1,2,3,4,5};
                reverse(arr);
                System.out.println(Arrays.toString(arr));
            }

            static void reverse(int [] arr){
                int start = 0;
                int end = arr.length - 1;

                while(start < end){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
        }

        public class RichestCustomerWealth1672 {
            static int MaximumWealth(int [][] accounts){

                /*

                    Initialize the largest wealth
                    loop through the array i will loop thought each array while j will loop through each value
                    Initialize the sum total for the first row as i represent the first row of the array
                    loop through each value of array index i through they array
                    set sum to += the array of the array index [i] and the value [j] add i and j to sum
                    if the sum is > then the max set the max to the sum 
                    return the max.

                */

                int max = 0;
                for (int i = 0; i < accounts.length; i++){
                    int sum = 0;
                    for (int j = 0; j < accounts[i].length; j++){
                        sum += accounts[i][j];
                    }

                    if (sum > max){
                        max = sum;
                    }
                }
                return max;
            }
        }

        public class ConcatenationOfArray1929 {
            public static void Concatenation(int [] nums){
                // create a new array with the length of the array * 2
                int [] arr = new int[nums.length * 2];
                for (int i = 0; i < nums.length; i++){

                    // set the first half of the array to the original array
                    arr[i] = nums[i];

                    // set the second half of the array to the original array
                    arr[i + nums.length] = nums[i];
                }
                System.out.println(Arrays.toString(arr));
            }
               
        }
        


        
    }

    public static void main(String[] args) {
        Arr.RollNumbers();
        Arr.RollNumbers2();
        Arr.ManualArray();
        Arr.IntArray();
        Arr.StringArray();
        Arr.InputArrayLoop();
        Arr.ForEachArray();
        Arr.ArrayOfStringObject();

        System.out.println('\n');
        int[] ChangeArr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ChangeArr)); // print the array
        Arr.Change(ChangeArr);
        System.out.println(Arrays.toString(ChangeArr)); // print the array

        System.out.println('\n');
        Arr.MultiDimensionArray();
        Arr.TwoDInputArray();

        System.out.println('\n');
        Arr.ForLoopArray();

        System.out.println('\n');
        Arr.ForEachArray2();
        Arr.DynamicArray();
        Arr.ArrayListExampleNFunctions();

        System.out.println('\n');
        Arr.ArrayListMultiDetention();

        System.out.println('\n');
        Assignment.SwapValuesInArray.SwapValues();
        Assignment.MaximumValueInArray.MaxValue();
        Assignment.ReverseArray.Reverse();

    }
}