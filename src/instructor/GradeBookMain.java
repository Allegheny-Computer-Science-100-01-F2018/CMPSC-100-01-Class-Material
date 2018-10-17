import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main (String args[]) {

    // Obtain input from the user
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter the course name: ");
    String name = scanner.nextLine();

    GradeBook myGradeBook  = new GradeBook ();
    myGradeBook.displayMessage();

    myGradeBook.setCourseName(name);
    System.out.println("Course name: " + myGradeBook.getCourseName());
  }
}
