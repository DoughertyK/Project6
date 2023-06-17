package project5;
import java.util.Stack;
/**
 * Printer class formats a string to print a Stack object.
 */
class Printer { // package-proteected

    /**
     * stackPrint interacts with Operator, uses the private stackStatusFormat to turn
     * the Stack into a string.
     * 
     * @param stackPrinted Stack<Integer> is the Stack to be formatted and convert into a string.
     * @return String formatted prined string of Stack for user to see
     */
    protected String stackPrint(Stack<Integer> stackPrinted){  // altered param name and type
        return stackStatusFormat(stackPrinted);
    }

    /**
     * stackStatusFormat uses .toString() Java function on Stack parameter, then
     * concats a simple statement to indicate that this is a print of the current Stack.
     * 
     * @param stackPrinted Stack<Integer> is the Stack to convert and place into formatted String.
     * @return String formatted for the program with output to assist user.
     */
    private String stackStatusFormat(Stack<Integer> stackPrinted) {  // altered param name and type
        return "Currently stored Stack: " + stackPrinted.toString();
    }
}

