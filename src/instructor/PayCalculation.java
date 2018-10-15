import java.util.Scanner;

/** Program to calculate employee pay.
*/
public class PayCalculation {
  /** Use nested if statements
  to check paygrade and level conditions.
  */
  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);

    // get the user's input
    System.out.println(" Enter base salary");
    double salary = input.nextDouble();
    System.out.println(" Enter paygrade");
    int paygrade = input.nextInt();
    System.out.println(" Enter level");
    int level = input.nextInt();

    double newSalary = salary;

    if(paygrade == 1) {
      if(level >= 3 && level <= 4) {
        newSalary *= 1.05;
      }
      else if (level == 1 || level == 2){
        newSalary *= 1.02;
      }
      else {
        System.out.println("Invalid level input");
      }
    } else if (paygrade == 2) {
      if(level >= 3 && level <=4) {
        newSalary *= 1.08;
      }
      else if (level == 1 || level == 2){
        newSalary *= 1.04;
      }
      else {
        System.out.println("Invalid level input");
      }
    } else {
      System.out.println("Incorrect paygrade");
    }


    System.out.println("Salary is " + newSalary);
  }
}
