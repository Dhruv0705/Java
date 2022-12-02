package PyramidPattern;

import java.util.Scanner; 

public class Pyramid {
    public static void main(String[] args) {
        // Ask user to input a number between 5 and 10
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter a number from 5 to 10: ");

        int inputedNumber = input.nextInt();
        
        // while the inputed number is greater then 5 or less then 10 the loop will process
        while (inputedNumber <5 || inputedNumber >10);

            // to get the row for the inputed number is greater then or equal to 1 will minus 1 until rows is = 1 
            // So loop will continue as the user enter 3 will set value to row and until row is not equal to 1 the loop will run as the value of row is minising 1 each loop.
            for (int rows = inputedNumber; rows >= 1; --rows) {
                System.out.print( "Row" + " " + rows + " :" );
                // for colums, as colums is not 1 or less then rows then the colums will be incremented by one to enter the value to new colum
                // loop starting at the bottom of the list will contineu to loop as long as rows is not equal to colums if not will add a new row until the 5th colums as the inputed value is 5. 
                for (int colums = 1;  colums >=  rows; ++ colums) {

                    // prints inputed value from colums 

                    //System.out.print( colums + " " );
                }

                // print empty string as it deletes from inputed number and print to the new line as the loops reruns until 1
                System.out.println();
            }
        
        }
    }
