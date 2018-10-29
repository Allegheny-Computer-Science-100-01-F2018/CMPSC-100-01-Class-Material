/** Account class to create an account.
It has two constructors and two methods.
*/
public class Account {
  private int accNo;
  private double balance;

  /* Construct a new bank account.
  */
  public Account (int accountNo) {
    accNo = accountNo;
    balance = 0;
    System.out.println("First constructor");
  }

  /** Second contructor: specify the starting balance.
  */
  public Account (int accountNo, double bal) {
    accNo = accountNo;
    balance = bal;
    System.out.println("Second constructor");
  }

  /** Method to return the balance.
  */
  public double getBalance() {
    return balance;
  }

  /** Method to change the balance.
  */
  public void setBalance(double change) {
    balance += change;
  }
}
