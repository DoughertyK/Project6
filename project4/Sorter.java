package project4;

import java.util.LinkedList;
import java.util.Collections;

/**
 * Sorter Class sorts a LinkedList, using .sort() from Java Collections. 
 * This implemented sort method manipulates a linked list itself, placing it
 * in ascending order.
 *
 */
class Sorter {  // package-private
    
   /**
     * sortLinked deals with Combiner. Sorts Linked List, uses private sorter method 
     * which sorts and returns ascending order linkedlist. Confirm the sorting for user
     * by printing statement after each .add() to Linked List. 
     * 
     * @param toSort LinkedList<Integer> Linked List to be sorted into ascending order
     * @return sortedList LinkedList<Integer> a sorted Linked List from the unsorted input
     */
    protected LinkedList<Integer> sortLinked(LinkedList<Integer> toSort) {
        System.out.println("Sorting Linked List: " + toSort + "...");
        sorter(toSort); // private method used to access Collections.sort()
        System.out.println("----------------------");
        return toSort;


    }

    /**
     * Sorter sorts Linked List accessed by sortLinked method using .sort() from Java Collections,
     * in ascending order. Private method used to protect the method from outside access.
     * 
     * @param toSort LinkedList<Integer> the unsorted Linked List that is put in ascending order.
     */
    private void sorter(LinkedList<Integer> toSort) {
        Collections.sort(toSort); // from Java Collections, sorts Linked Lists
        
    }


}
