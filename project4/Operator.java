package project4;

import java.util.LinkedList;
/**
 * Combiner creates an object using the package classes so that they may be combined to perform the
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
     * Constructor for Combiner initialized along with three other package classes.
     */
    public Operator() {
        this.reader = new Reader();
        this.converter = new Converter();
        this.sorter = new Sorter();
        this.printer = new Printer();
    }

    /**
     * programAction It uses readMakeSortList to carry out the 
     * desired program functions.  
     */
    protected void programActions(){
        runProgram();
    }


    /**
     * readMakeSortList uses ListReader, Converter, and Sorter to carry out the programs desired functions 
     * in an encapsulated private method.  
     * 
     */
    private void runProgram() {
        Integer[] numbers = reader.readInput();
        reader.close();

        LinkedList<Integer> convertedLinked = converter.arrayToLinked(numbers);
        
        LinkedList<Integer> sortedLinked = sorter.sortLinked(convertedLinked);
        
        String outputList = printer.linkedPrint(sortedLinked);

        System.out.println(outputList);

    }
}