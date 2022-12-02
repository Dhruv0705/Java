package IntroToJava.NestedStatement;
import java.util.Scanner;

public class NestedStatement {
    
    public static void main(String [] args) {

        System.out.print("Input your age: ");
        Scanner input = new Scanner (System.in);
        String s = input.nextLine();

        int age = Integer.parseInt(s);

        if(age >=18){
            System.out.print("Input your fav food:");
            String food = input.nextLine();
            
            if (food.equals("pizza")){
                System.out.println("Mine too");
            }
            else{
                System.out.println("Not mine");
            }
        }
        else if(age >=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You cannot ride! ");
        }
    }
}
