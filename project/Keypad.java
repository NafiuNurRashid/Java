package project;

//Keypad.java
// Represents the keypad of the ATM
 import java.util.Scanner; // program uses Scanner to obtain user input

public class Keypad
 {
 private Scanner input; // reads data from the command line

//no-argument constructor initializes the Scanner
 public Keypad()
 {
 input = new Scanner( System.in );
 } // end no-argument Keypad constructor

 // return an integer value entered by user
 public int getInput()
 {
 return input.nextInt(); // we assume that user enters an integer
 } // end method getInput
 } // end class Keypad



//EXTRA
/*
 * public class Keypad { // no attributes have been specified yet
 * 
 * // no-argument constructor public Keypad() { } // end no-argument Keypad
 * constructor
 * 
 * // operations public int getInput() { } // end method getInput } // end class
 * Keypad
 */