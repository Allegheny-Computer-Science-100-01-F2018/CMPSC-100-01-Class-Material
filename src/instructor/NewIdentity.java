import java.util.Random;
import java.util.Scanner;

/** Defining new identity.
* @author Janyl Jumadinova
*/
public class NewIdentity {

  /** Use String methods to modify
  * user's input.
  */
  public static void main (String [] args) {
    // variable declaration
    String firstName;
    String lastName;
    String job;
    String job1;
    String job2;
    char letter;
    int position;

    // declare and assign Scanner object
    Scanner scan = new Scanner(System.in);

    // get user's input
    System.out.println("Please enter a first name: ");
    firstName = scan.nextLine();
    System.out.println("Please enter a last name: ");
    lastName = scan.nextLine();
    System.out.println("Please enter your dream job: ");
    job1 = scan.nextLine();
    System.out.println("Please enter another dream job: ");
    job2 = scan.nextLine();

    // randomly select a character from the firstName
    int length = firstName.length();
    Random random = new Random();
    position = random.nextInt(length);
    char letter1 = "aeorus".charAt(random.nextInt(6));

    // modify user's input to create new NewIdentity
    letter = firstName.charAt(position);
    firstName = firstName.replace(letter, letter1);
    int length1 = lastName.length();
    lastName = lastName.substring(random.nextInt(length1), length1);
    job = job1.concat(job2);

    // display new NewIdentity
    System.out.println("Your new first name is " + firstName.toUpperCase());
    System.out.println("Your new last name is " + lastName.toUpperCase());
    System.out.println("Your new job is " + job.toUpperCase());


  }
}
