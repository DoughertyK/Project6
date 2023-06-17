package project4;

/**
 * Main class uses an instance of ListReader to read user input, and SortedList 
 * to sort the numbers then add them to the linked list. This class acts as user interface.
 * User prompted to enter comma seperated list of integers separated by commas. The numbers are
 * then inserted and stored in a sorted linked list. 
 * 
 * The sorted list is printed to the console for confirmation.
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
 * hello cannot be added to linked list. Skipping this value.
 * -------------------------
 * 2.2 cannot be added to linked list. Skipping this value.
 * -------------------------
 * Currently Stored Linked List: [-1, 2, 3, 11]
 * <p>
 * 
 * @author Kael Dougherty - CSC6301 - 06/2023
*/

public class Main {

    /**
     * Main method explains the program and desired input then initializes programManager which uses the
     * package classes to read the input, parse it, turn it into a Linked List and Sort it, 
     * then programManager returns the sorted Linked List as a string.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        // opening print statements, input prompt
        System.out.println("------------------------------");
        System.out.println("This program will read a comma seperated list of integers, then sort it and create a sorted linked list from it.");
        System.out.println("Enter a comma seperated list of integers and hit Enter:");
 
        Operator programOperation = new Operator();
        programOperation.programActions();
        
        
 
        // Closing print statements
        System.out.println("------------------------------");
        System.out.println("Exiting program.");
    }
}
