package project4;
import java.util.LinkedList;
/**
 * Printer class formats a string to print a Linked List object.
 */
class Printer { // package-proteected

    /**
     * linkedPrint interacts with ProgramManager, uses the private listStatusFormat to turn
     * the Linked List into a string.
     * 
     * @param listPrinted LinkedList<Integer> is the linked list to be formatted and convert into a string.
     * @return formated String of Linked List for user to see
     */
    protected String linkedPrint(LinkedList<Integer> listPrinted){
        return listStatusFormat(listPrinted);
    }

    /**
     * listStatusFormat uses .toString() Java function on Linked List parameter, then
     * concats a simple statement to indicate that this is a print of the current linked list.
     * 
     * @param listPrinted LinkedList<Integer> is the Linked List to convert and place into formatted String.
     * @return String formatted for the program with output to assist user.
     */
    private String listStatusFormat(LinkedList<Integer> listPrinted) {
        return "Currently stored Linked List: " + listPrinted.toString();
    }
}

