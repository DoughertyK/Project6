package project5;

import java.util.Stack;
/**
 * Operator creates an object using the package classes so that they may be combined to perform the
 * desired program operations in a more organized and SOLID consistent manner.
 * 
 *
 */
class Operator { // uses package-protected class
    private Reader reader; // uses composition to create other package objects, that this object depends on
    private Converter converter;
    private Sorter sorter;
    private Printer printer;

    /**
     * Constructor for Operator initialized along with three other package classes.
     */
    public Operator() {
        this.reader = new Reader();
        this.converter = new Converter();
        this.sorter = new Sorter();
        this.printer = new Printer();
    }

    /**
     * programActions uses runProgram() to carry out desired program functions.  
     */
    protected void programActions(){
        runProgram();
    }


    /**
     * runProgram uses Reader, Converter, and Sorter to carry out the programs desired functions 
     * in an encapsulated private method.  
     * 
     */
    private void runProgram() {
        Integer[] numbers = reader.readInput();
        reader.close();

        Stack<Integer> convertedStack = converter.arrayToLStack(numbers); // saves to Stacks for project5 rather than LinkedLists
        
        Stack<Integer> sortedStack = sorter.sortStack(convertedStack);
        
        String outputStack = printer.stackPrint(sortedStack);

        System.out.println(outputStack);

    }
}