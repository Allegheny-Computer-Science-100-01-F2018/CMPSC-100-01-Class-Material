/** Bank class controls the main method.
It creates instances of the Account object and
use methods within the Account class.
*/
public class Bank {
  public static void main (String [] args) {
    System.out.println("Welcome!");

    Account smith = new Account(112233);
    Account watson = new Account (445566, 1000);
    Person jones = new Person("Jane Jones");
    Account jonesAccount = new Account (221122, 100, jones);

    smith.setBalance(-500);
    System.out.println("Smith account balance: " + smith.getBalance());

    watson.setBalance(-100);
    System.out.println("Watson account balance: " + watson.getBalance());

    jones.setAddress("520 N Main Street");
    System.out.println("Name: " + jones.getName());
    System.out.println("Address: " + jones.getAddress());
    System.out.println("Account balance: " + jonesAccount.getBalance());
    System.out.println("Account info: " + jonesAccount.getPerson().getName());

    System.out.println("Thank you for using our program.");
  }
}
