// Import the Scanner
import java.util.Scanner;

// Beginning of the main class. The name of the main class and the file should be same.
public class Main {

    // Beginning of main method - a program starts from this method and ends here
    public static void main(String []args) {

        Scanner keyboard = new Scanner(System.in);

        // A variable for getting the day of the week is given below
        // Initialize the variable to have the value 1
        // 1- is Monday, 2- is Tuesday and so on
        int dayOfTheWeek = 1;
        int subChoice = 1;

        // Display a menu to get the day of the week from the user

        System.out.println("********** MENU *****************\n" +
                "These are the choices for week of the day. \\n Please enter only values from 1-7:\n" +
                "1. MONDAY\n" +
                "2. TUESDAY\n" +
                "3. WEDNESDAY\n" +
                "4. THURSDAY\n" +
                "5. FRIDAY\n" +
                "6. SATURDAY\n" +
                "7. SUNDAY\n" +
                "***********************************\n");

        // Prompt user for input. Also let user know the valid choices like (1-7).
        dayOfTheWeek = keyboard.nextInt();

        // Create a switch with case values from 1-7 to handle the schedule
        // for the input in "dayOfTheWeek"
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");
                System.out.println("Please select a choice:\n" +
                        "*********** SUB MENU FOR MONDAY ******\n" +
                        "* 1. Yes, I had my breakfast\n" +
                        "2. No, I would like one\n" +
                        "**************************************\n");

                subChoice = keyboard.nextInt();
                if (subChoice == 1) {
                    System.out.println("Good! You ate breakfast already. Have a good day!");
                } else if (subChoice == 2) {
                    System.out.println("You should really eat something before work...");
                } else {
                    System.out.println("NO such choice available");
                }
                break;

            // Implement all other cases for Tuesday to Sunday **/
            case 2:
                System.out.println("Tuesday: Still work.....");
                break;

            case 3:
                System.out.println("Wednesday: More work...but hump day!");
                break;

            case 4:
                System.out.println("Thursday: Almost there!");
                break;

            case 5:
                System.out.println("Friday: We did it! Enjoy the weekend.");
                break;

            case 6:
                System.out.println("Saturday: Any big plans for the night?");
                break;

            case 7:
                System.out.println("Sunday: Rest and prep for the upcoming week!");
                break;

            // Implement "default" to handle user entering values less than 1 or more than 7

            default:
                System.out.println("Enter a value between 1 and 7.");

        }

    } //end of main method

} //end of the main class