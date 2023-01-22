package PyramidPattern;

import java.util.Scanner; 

public class Pyramid {
    public static void main(String[] args) {

        try (// Ask user to input a number between 5 and 10
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number from 5 to 10: ");

            int inputtedNumber = input.nextInt();
            
            // while the inputted number is greater then 5 or less then 10 the loop will process
            while (inputtedNumber <5 || inputtedNumber >10);

                // to get the row for the inputted number is greater then or equal to 1 will minus 1 until rows is = 1 
                // So loop will continue as the user enter 3 will set value to row and until row is not equal to 1 the loop will run as the value of row is minising 1 each loop.
                for (int rows = inputtedNumber; rows >= 1; --rows) {
                    System.out.print( "Row" + " " + rows + " :" );
                    
                    // for column, as column is not 1 or less then rows then the column will be incremented by one to enter the value to new colum
                    // loop starting at the bottom of the list will continue to loop as long as rows is not equal to column if not will add a new row until the 5th colums as the inputed value is 5. 
                    for (int column = 1;  column >=  rows; ++ column) {

                        // prints inputted value from column and rows
                        //System.out.print( column + " " );
                    }

                    // print empty string as it deletes from inputted number and print to the new line as the loops reruns until 1
                    System.out.println();
                }
        }
    }
}
