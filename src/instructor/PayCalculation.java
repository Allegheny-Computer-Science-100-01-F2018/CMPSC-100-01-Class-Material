
import java.util.Scanner;

public class PayCalculation {
  public static void main ( String [] args ) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Base salary: " );
    int salary = input.nextInt();
    System.out.print ( "Pay grade: " );
    int paygrade = input.nextInt();
    System.out.print ( "Level: " );
    int level = input.nextInt();

    if (paygrade == 1) {
      if (level >= 2 && level <= 4) {
        salary *= 1.05;
      }
      else {
        salary *= 1.04;
      }
    }
    else {
      salary *= 1.06;
    }
  }
}
