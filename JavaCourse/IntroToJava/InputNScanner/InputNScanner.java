package IntroToJava.InputNScanner;

//Scanner package
import java.util.Scanner;

public class InputNScanner {
    
    // Input and Scanner
    public static void main(String[] args){

        try (// Input scanner
        Scanner scanner = new Scanner (System.in)) {
            // String
            System.out.print("Enter a string: ");
            String strScanned = scanner.next();

            // INT
            System.out.print("Enter a integer: ");
            int intScanned = scanner.nextInt();

            // Convert string to a integer (.parseInt())
            System.out.print("Enter a string to be converted to integer: ");
            String parseScanned = scanner.next();
            
            // Boolean
            System.out.print("Enter a boolean: ");
            boolean booScanned = scanner.nextBoolean();

            // Double
            System.out.print("Enter a float: ");
            double doubsScanned = scanner.nextDouble(); 

            System.out.println(strScanned);
            System.out.println(intScanned);
            System.out.println(parseScanned);
            System.out.println(booScanned);
            System.out.println(doubsScanned);
        } catch (NumberFormatException e) {

            // Print error
            e.printStackTrace();
        }
    }
}
