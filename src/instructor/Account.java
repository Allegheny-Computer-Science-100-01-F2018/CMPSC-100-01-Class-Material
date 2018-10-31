/** Account class to create an account.
It has two constructors and two methods.
*/
public class Account {
  private int accNo;
  private double balance;
  private Person person;

  /* Construct a new bank account.
  */
  public Account (int accountNo) {
    accNo = accountNo;
    balance = 0;
    //System.out.println("First constructor");
  }

  /** Second contructor: specify the starting balance.
  */
  public Account (int accountNo, double bal) {
    accNo = accountNo;
    balance = bal;
    //System.out.println("Second constructor");
  }

  /** Third contructor: add person object.
  */
  public Account (int accountNo, double bal, Person per) {
    accNo = accountNo;
    balance = bal;
    person = per;
  }

  /** Method to return the balance.
  */
  public double getBalance() {
    return balance;
  }

  /** Method to change the balance.
  */
  public void setBalance(double change) {
    if((balance + change) >= 0) {
      balance += change;
    } else {
      System.out.println("Insufficient funds");
    }
  }

  /** Method to return the Person object.
  */
  public Person getPerson() {
    return person;
  }

  /** Method to change the Person object.
  */
  public void setPerson(Person per) {
    person = per;
  }
}
