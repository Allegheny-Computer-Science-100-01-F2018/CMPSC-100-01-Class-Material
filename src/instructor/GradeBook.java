/** Define class GradeBook with a member method displayMessage.
*/

public class GradeBook {

  // instance variable
  private String courseName;
  private String courseTag;

  public GradeBook (String name, String tag) {
    courseName = name;
    courseTag = tag;
  }

  /** method to change the course name.
  */
  public void setCourseName (String name) {
    courseName = name;
  }

  /** method to return the course name.
  */
  public String getCourseName() {
    return courseName;
  }

  /** method to change the course tag.
  */
  public void setCourseTag (String tag) {
    courseTag = tag;
  }

  /** method to return the course name.
  */
  public String getCourseTag() {
    return courseTag;
  }

  /** method to display a welcome message.
  */
  public void displayMessage() {
    System.out.println("Welcome to the Grade Book");
  }
}
