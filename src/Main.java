import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = ""; // Initialize playerA variable (user input)
        String playerB = ""; // Initialize playerB variable (user input)
        String yesOrNo = ""; // Initialize yesOrNo variable (user input)
        boolean done1 = false; // Initialize done1 variable and set to false for do while loop
        boolean done2 = false; // Initialize done2 variable and set to false for do while loop
        boolean done3 = false; // Initialize done3 variable and set to false for do while loop
        do {
            do {
                System.out.print("Enter a move for player A [R, P, or S]: "); // Prompt user for move for player A
                playerA = in.nextLine(); // Reads a string value from the user
                playerA = playerA.toUpperCase(); // Sets user input to uppercase in case they typed in lowercase
                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) { // Condition: If playerA variable equals R, or equals P, or equals S,
                    done1 = true; // Set done1 to true so we can stop this loop
                } else {
                    System.out.println("You have to enter a valid move."); // Output that the user has to enter a valid move
                }
            } while (!done1); // Loop: While done1 variable is false (loop will stop when done1 is true, or in other words when the user enters a valid move)
            do {
                System.out.print("Enter a move for player B [R, P, or S]: "); // Prompt user for move for player B
                playerB = in.nextLine(); // Reads a string value from the user
                playerB = playerB.toUpperCase(); // Sets user input to uppercase in case they typed in lowercase
                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) { // Condition: If playerB variable equals R, or equals P, or equals S,
                    done2 = true; // Set done2 to true so we can stop this loop
                } else {
                    System.out.println("You have to enter a valid move."); // Output that the user has to enter a valid move
                }
            } while (!done2); // Loop: While done2 variable is false (loop will stop when done2 is true, or in other words when the user enters a valid move)
            if (playerA.equals("R")) { // Condition: If playerA variable equals R,
                if (playerB.equals("R")) { // Condition: If playerB variable equals R,
                    System.out.println("Rock vs Rock, it's a tie!"); // Output that it's a tie
                } else if (playerB.equals("P")) { // Condition: If playerB variable equals P,
                    System.out.println("Paper covers Rock, Player B wins!"); // Output that playerB won
                } else {
                    System.out.println("Rock breaks scissors, Player A wins!"); // Output that playerA won
                }
            } else if (playerA.equals("P")) { // Condition: If playerA variable equals P,
                if (playerB.equals("R")) { // Condition: If playerB variable equals R,
                    System.out.println("Paper covers Rock, Player A wins!"); // Output that playerA won
                } else if (playerB.equals("P")) { // Condition: If playerB variable equals P,
                    System.out.println("Paper vs Paper, it's a tie!"); // Output that it's a tie
                } else {
                    System.out.println("Scissors cuts Paper, Player B wins!"); // Output that playerB won
                }
            } else {
                if (playerB.equals("R")) { // Condition: If playerB variable equals R,
                    System.out.println("Rock breaks scissors, Player B wins!"); // Output that playerB won
                } else if (playerB.equals("P")) { // Condition: If playerB variable equals P,
                    System.out.println("Scissors cuts Paper, Player A wins!"); // Output that playerA won
                } else {
                    System.out.println("Scissors and scissors, it's a tie!"); // Output that it's a tie
                }
            }
            do {
                System.out.print("Would you like to play again? [Y or N]: "); // Prompt the user to play again
                yesOrNo = in.nextLine(); // Reads a string value from the user
                yesOrNo = yesOrNo.toUpperCase(); // Sets user input to uppercase in case they typed in lowercase
                if (yesOrNo.equals("Y") || yesOrNo.equals("N")) { // Condition: If yesOrNo variable equals Y or equals N,
                    done3 = true; // Set done3 to true so we can stop this loop
                } else {
                    System.out.println("You have to enter Y or N."); // Output that the user has to enter a valid answer
                }
            } while(!done3); // Loop: While done3 variable is false (loop will stop when done3 is true, or in other words when the user enters a valid answer)
            done1 = false; // Set done1 to false so if the program gets looped again it won't automatically let the user type whatever they want
            done2 = false; // Set done2 to false so if the program gets looped again it won't automatically let the user type whatever they want
            done3 = false; // Set done3 to false so if the program gets looped again it won't automatically let the user type whatever they want
        } while(yesOrNo.equals("Y")); // Loop: While yesOrNo equals Y (when the user enters N the program will stop)
    }
}