import java.util.Arrays;
import java.util.Scanner;

public class Array {
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
            //


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
            
            // starting at 0 if i is less than the length of the array increment loop by 1
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt(); // set the value of the array to the input
                }
            }
            System.out.println(Arrays.toString(arr)); // print the array
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
    }
}
