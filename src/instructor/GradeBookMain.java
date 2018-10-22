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
    System.out.println("Enter the course tag");
    String tag = scanner.nextLine();

    GradeBook myGradeBook  = new GradeBook (name, tag);
    myGradeBook.displayMessage();

    System.out.println("Change the course name: ");
    String name1 = scanner.nextLine();
    myGradeBook.setCourseName(name1);
    System.out.println("Course name: " + myGradeBook.getCourseName());

    //myGradeBook.setCourseTag(tag);
    System.out.println("Course tag: " + myGradeBook.getCourseTag());
  }
}
