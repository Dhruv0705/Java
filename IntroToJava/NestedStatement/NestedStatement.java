package IntroToJava.NestedStatement;
import java.util.Scanner;

public class NestedStatement {
    
    // Ask the user for their age and favorite food. 
    public static void main(String [] args) {

        // Ask the user for their age
        System.out.print("Input your age: ");

        // Read the user's input
        try (Scanner input = new Scanner (System.in)) {

            // Read the user's input
            String s = input.nextLine();

            // Convert the user's input to an integer
            int age = Integer.parseInt(s);

            // If the user is 18 or older
            if(age >=18){

                // Ask the user for their favorite food
                System.out.print("Input your fav food:");

                // Read the user's input
                String food = input.nextLine();
                
                // If the user's favorite food is pizza
                if (food.equals("pizza")){

                    // Print "Mine too"
                    System.out.println("Mine too");
                }

                // Otherwise
                else{

                    // Print "Not mine"
                    System.out.println("Not mine");
                }
            }

            // else if the user is 13 or older
            else if(age >=13){

                // Print "You are a teenager"
                System.out.println("You are a teenager");
            }
            
            // Otherwise
            else{

                // Print "You are a child"
                System.out.println("You are a child");
            }
        
        // Close the scanner
        } catch (NumberFormatException e) {

            // Print the error
            e.printStackTrace();
        }
    }
}
