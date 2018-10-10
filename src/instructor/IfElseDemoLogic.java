import java.util.Scanner;

/** Program to determine whether a character a vowel.
*/
public class IfElseDemoLogic {

  /** Main method uses conditional
  *  if statements to check if a given
  *  character is a vowel.
  */
  public static void main ( String [] args ) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );

    // char data type
    char character;
    // get character from input (2 method calls)
    character = input.next().charAt(0);

    // notice ' ' marks char
    if (character == 'a' || character == 'e'|| character == 'i'
        || character == 'o' || character == 'u') {
      System.out.println ( character+" is a vowel." );
    }
    else {
      System.out.println ( character+" is not a vowel." );
    }
  }
}
