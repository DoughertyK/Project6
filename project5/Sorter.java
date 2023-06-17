package project5;

import java.util.Stack;
import java.util.Collections;

/**
 * Sorter Class sorts a Stack, using .sort() from Java Collections. 
 * This implemented sort method manipulates a Stack itself, placing it
 * in ascending order.
 *
 */
class Sorter {  // package-private
    
   /**
     * sortStack deals with Operator. sortStack, uses private sorter method 
     * which sorts and returns ascending order Stack. Confirms the sorting for user
     * by printing statement after each .push() to Stack. 
     * 
     * @param toSort Stack<Integer> Stack to be sorted into ascending order
     * @return sortedStack Stack<Integer> a sorted Stack from the unsorted input
     */
    protected Stack<Integer> sortStack(Stack<Integer> toSort) { // altered variable and parameter names and types, change method output type
        System.out.println("Sorting Stack: " + toSort + "...");
        sorter(toSort); // private method used to access Collections.sort()
        System.out.println("----------------------");
        return toSort;


    }

    /**
     * Sorter sorts Stack accessed by sortStack method using .sort() from Java Collections,
     * in ascending order. Private method used to protect the method from outside access.
     * 
     * @param toSort Stack<Integer> the unsorted Stack that is put in ascending order.
     */
    private void sorter(Stack<Integer> toSort) {  // altered variable names and types, altered param type
        Collections.sort(toSort); // from Java Collections, sorts Stacks as well as Linked Lists (previously in program)
    }


}
