/** Person class to hold an account
* holder's information.
*/
public class Person {
  private String name;
  private String address;

  /** Contructor to create a Person instance.
  */
  public Person (String name1) {
    name = name1;
    address = null;
  }

  /** Method to change the user's name.
  */
  public void setName (String name1) {
    name = name1;
  }

  /** Method to return the user's name.
  */
  public String getName() {
    return name;
  }

  /** Method to change the user's address.
  */
  public void setAddress (String ad) {
    address = ad;
  }

  /** Method to return the user's address.
  */
  public String getAddress() {
    return address;
  }
}
