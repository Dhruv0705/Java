package IntroToJava.InputNScanner;

//Scanner package
import java.util.Scanner;

public class InputNScanner {
    
    public static void main(String[] args){

        // Input scanner
        Scanner scanner = new Scanner (System.in);

        // String
        System.out.print("Enter a string: ");
        String strscanned = scanner.next();

        // INT
        System.out.print("Enter a integer: ");
        int intscanned = scanner.nextInt();

        // Convert string to a integer (.parseInt())
        System.out.print("Enter a string to be converted to integer: ");
        String parsescanned = scanner.next();
        int x = Integer.parseInt(parsescanned);

        // Boolean
        System.out.print("Enter a boolean: ");
        boolean booscanned = scanner.nextBoolean();

        // Float
        System.out.print("Enter a float: ");
        double doubscanned = scanner.nextDouble(); 

        System.out.println(strscanned);
        System.out.println(intscanned);
        System.out.println(parsescanned);
        System.out.println(booscanned);
        System.out.println(doubscanned);
    }
    
}
