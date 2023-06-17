package project4;
import java.util.LinkedList;

/**
 * Converter Class converts input into a LinkedList.
 * 
 */
class Converter {  // package private

    private LinkedList<Integer> listReturn;  // composition used to create class

    /**
     * Constructor builds a new linked list to fill with input.
     */
    public Converter() {
        this.listReturn = new LinkedList<>();
    }

    /**
     * Adds provided integrs to the object's linked list  using convertToLinked to control access.
     *
     * @param integersValid an Integer array of valid user inputs to be added to the linked list.
     * @return LinkedList of the integer array parameter.
     */
    protected LinkedList<Integer> arrayToLinked(Integer[] integersValid) {
       LinkedList<Integer> linkedNow = convertToLinked(integersValid);
       return linkedNow;
    }
    
    /**
     * convertToLinked adds integers to linked list. Updates user with printed output at the addition 
     * of each integer to the Linked List. Adds them in the order of the array.
     *
     * @param intArray Integer Array numbers to be added to the linked list.
     * @return Linked List made from the integers array parameter.
     */
    private LinkedList<Integer> convertToLinked(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) { // loops through array, adding integers to Linked List
            System.out.println("Adding " + intArray[i] + " to linked list...");
            listReturn.add(intArray[i]); // .add from LinkedList to copy array
            System.out.println("---------------------------");
            }
            return listReturn;
        }




}
