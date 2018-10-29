/** Bank class controls the main method.
It creates instances of the Account object and
use methods within the Account class.
*/
public class Bank {
  public static void main (String [] args) {
    System.out.println("Welcome!");

    Account smith = new Account(112233);
    Account watson = new Account (445566, 1000);

    smith.setBalance(500);
    System.out.println("Smith account balance: " + smith.getBalance());

    watson.setBalance(-100);
    System.out.println("Watson account balance: " + watson.getBalance());

    System.out.println("Thank you for using our program.");
  }
}
