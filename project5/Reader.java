package project5;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Reader reads and processes the comma seperated list input from user. 
 * It uses .readInput() to strip input before each comma. Using try-catch, 
 * it creates an array of only integers input. It then returns an integer array.
 * 
 */
class Reader { // uses package-private for SOLID -- limited access to this class

    private Scanner scanner;  // Kept private for SOLID principles.

    /**
     * Constructor for Reader for program to read user input.
     */
    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * readInput uses scanner for the user's input, splitting the input to be checked for integers 
     * by using the private method inputToArray to create an Integer array from valid input.
     * 
     * @return intsValid Integer Array of valid integers from the user's input.
     */
    protected Integer[] readInput() {
        String[] input = scanner.nextLine().split("\\s*,\\s*"); // uses regex, splits input by commas and spaces
        System.out.println("------------------------------"); // improves readability 
        Integer[] intsValid = inputToArray(input);
        return intsValid;
    }

    /**
     * inputToArray reads the String line of input, splits it makes an array of integers using only values 
     * that pass NumberFormatException. userInput string parameter works with readInput which parses the text.
     * 
     * @param input String passed from the readInput method which recieves the users input
     * @return Array of integers to be sorted and made into linked list using Sorter class, only returns valid integers.
     */
    private Integer[] inputToArray(String[] input) {
        List<Integer> intNumbers = new ArrayList<>(); // uses Arraylist to convert from String list with .valueOf
        
        for (int i = 0; i < input.length; i++) {
            try { // try-catch handles exceptons for non-integers
                 intNumbers.add(Integer.valueOf(input[i])); // converts and adds strings to ArrayList as integers
            } catch (NumberFormatException e) { // Java's number format exception condition
                System.out.println(input[i] + " cannot be pushed to Stack. Skipping this value.");
                System.out.println("-------------------------");
            }
        }
        return intNumbers.toArray(new Integer[0]);  // converts List<integer> to an Integer Array 
    }

    /**
     * Closes scanner object, keeps program from directly accessing Scanner.
     */
    protected void close() {
        scanner.close();
    }
}