package project5;
import java.util.Stack;

/**
 * Converter Class converts input into a Stack.
 * 
 */
class Converter {  // package private

    private Stack<Integer> stackReturn;  // composition used to create class

    /**
     * Constructor builds a new Stack to fill with input.
     */
    public Converter() {
        this.stackReturn = new Stack<>();
    }

    /**
     * Adds provided integrs to the object's Stack using convertToStack to control access.
     *
     * @param integersValid Integer[] an Integer array of valid user inputs to be added to the Stack.
     * @return Stack Stack<Integer>  the integer array parameter turned into a Stack.
     */
    protected Stack<Integer> arrayToLStack(Integer[] integersValid) { // altered variable names and types change method output type
       Stack<Integer> stackNow = convertToStack(integersValid);
       return stackNow;
    }
    
    /**
     * convertToLinked adds integers to Stack. Updates user with printed output at the addition 
     * of each integer to the Stack. Adds them in the order of the array.
     *
     * @param intArray Integer Array numbers to be added to the Stack.
     * @return Stack made from the integers array parameter.
     */
    private Stack<Integer> convertToStack(Integer[] intArray) { // altered variable names and types change method output type
        for (int i = 0; i < intArray.length; i++) { // loops through array, adding integers to Stack
            System.out.println("Pushing " + intArray[i] + " to Stack...");
            stackReturn.push(intArray[i]); // .push() from Stack Collections to copy array
            System.out.println("---------------------------");
            }
            return stackReturn;
        }




}
