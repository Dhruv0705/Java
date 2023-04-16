import java.util.Scanner;

public class SwitchStatements {
    /* In switch statements, you can jump to various cases based on your expression
     * Syntax:
     * switch (expression){
     *     case value1:
     *        // code
     *       break;
     *    case value2:
     *       // code
     *      break;
     *   default:
     *     // code
     *   break;
     * }
     * 
     * Cases have to be the same types as expression, must be constant or literals 
     *  for example: int, char, String, enum
     * Duplicate cases values are not allowed
     * Break is use to terminate the switch statement
     * 
     * 
     * 
     * 
     * 
    */

    public static void Fruit(){
        Scanner input = new Scanner (System.in);
        String fruit = input.next();

        switch (fruit){
            case "Apple":
                System.out.println("Red");
                break;
            case "Banana":
                System.out.println("Yellow");
                break;
            case "Grapes":
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid fruit");
                break;
        }

        // Enhanced switch statement
        switch (fruit){
            case "Apple" -> System.out.println("Red");
            case "Banana" -> System.out.println("Yellow");
            case "Grapes" -> System.out.println("Green");
            default -> System.out.println("Invalid fruit");
        }


        

    }

    public static void Days(){
        Scanner input = new Scanner (System.in);
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void WeekDays(){
        Scanner input = new Scanner (System.in);
        int day = input.nextInt();

        switch (day){
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void NestedSwitch(){
        Scanner input = new Scanner (System.in);
        int ID = input.nextInt();
        String Department = input.next();

        switch (ID){
            case 1:
                switch (Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                break;

            case 2:
                switch (Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                        break;
                }
                break;

            default:
                System.out.println("Invalid ID");
                break;
        }
    }
    public static void main(String [] args){
        SwitchStatements.Fruit();
        SwitchStatements.Days();
        SwitchStatements.WeekDays();
        SwitchStatements.NestedSwitch();
    }
}
