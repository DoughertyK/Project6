package project5;

/**
 * Main class uses Operator to access Reader to read user input, and Sorter
 * to sort the numbers then add them to the Stack. Then Prints the results using Printer 
 * This class prompts to enter comma seperated list of integers. Those integers are
 * then inserted and stored in a sorted Stack 
 * 
 * The sorted Stack is printed to the console for confirmation.
 *
 * <p>
 * Use Example:
 *
 * "Enter a comma seperated list of integers and hit Enter:"
 * 
 * input: 
 * hello, 2.2, 3, -1, 11
 * 
 * output:
 * hello cannot be pushed to the Stack. Skipping this value.
 * -------------------------
 * 2.2 cannot be pushed to the Stack. Skipping this value.
 * -------------------------
 * Currently Stored Stack: [-1, 2, 3, 11]
 * <p>
 * 
 * @author Kael Dougherty - CSC6301 - 06/2023
*/

public class Main {

    /**
     * Main method explains the program and desired input then initializes Operator which uses the
     * package classes to read the input, parse it, turn it into a Stack and sort it, 
     * then Operator returns the sorted Stack as a string.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        // opening print statements, input prompt
        System.out.println("------------------------------");
        System.out.println("This program will read a comma seperated list of integers, then push the integers into a Stack, and create a sorted Stack from it.");
        System.out.println("Enter a comma seperated list of integers and hit Enter:");
 
        Operator programOperation = new Operator();
        programOperation.programActions();
 
        // Closing print statements
        System.out.println("------------------------------");
        System.out.println("Exiting program.");
    }
}
