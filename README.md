#Project 6 - Sorted Input (Project 4 and Project 5)

## Introduction

Project4 and Project5 from CSC6301 are Java programs that accept, process, and sort integers provided by a user. Project4 uses a Linked List to store the items, and Project5 uses a Stack.

## Technical Details

Both project4 and project5 attempt to adhere to SOLID principles.  There are 5 classes other than Main: Reader, Operator, Printer, Sorter, and Converter.  

Main class uses Operator to access Reader to read user input, and Sorter to sort the numbers then add them to the data structure (Linked List in project4, Stack in project5). Then Prints the results using Printer. Main class prompts user to enter a comma-separated list of integers. Reader parses the input. Converter converts the parsed input into the appropriate data structure. Sorter sorts the data structure. Then the sorted data structure is printed to the console for confirmation using Printer.

### Dependencies
Project4 uses LinkedList, Collections, ArrayList, and Scanner
Project5 uses the same, except Stack in place of LinkedList

### Project4 Comments, mistakes
Project 4 comments mistakenly referred to classes by an earlier version's names.  These were kept to preserve the project as-is when submitted for Week 4. Corrected class names were used for Project 5. 

## Usage

The user is prompted to enter a comma-separated list into the command line upon running Main.java (Project5 in this example).

```bash
Enter a comma-separated list of integers and hit Enter:
```

The user then provides input:

```bash
hello, 2.2, 3, -1, 11
```

The application processes the input and provides feedback on the console. It ignores any input that is not an integer:

```bash
hello cannot be pushed to the Stack. Skipping this value.
-------------------------
2.2 cannot be pushed to the Stack. Skipping this value.
-------------------------
Currently Stored Stack: [-1, 2, 3, 11]
```

Project4 interaction is identical except user will be met with messages regarding "Linked List" in place of "Stack".

## Created by

Kael Dougherty | CSC6301 | 06/2023

