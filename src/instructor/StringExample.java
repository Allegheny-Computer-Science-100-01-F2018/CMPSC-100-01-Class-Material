import java.util.Scanner;

/** Program to demonstrate the usage
* of String methods.
*
* Compile: javac StringExample.java
* Run: java StringExample
*
* @author Janyl Jumadinova
* 24 September 2018
*/
public class StringExample {
  /** main method obtains the user's input
  * and obtains some information from it.
  */
  public static void main (String [] args) {
    // declare and assign Scanner
    Scanner input = new Scanner (System.in);
    String text;

    // ask the user for input
    System.out.println("Please enter some text: ");

    // store user's input in a variable
    text = input.nextLine();
    System.out.println("You entered: " + text);

    // Now we apply String class's charAt method and print it
    System.out.println("The second character is: " + text.charAt(1));

    // Now apply other String class's methods and print the results
  }
}
