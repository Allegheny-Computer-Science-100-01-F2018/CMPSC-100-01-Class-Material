/** Purpose: A program that demonstrates the
* usage of the do while loop.
*/
public class Dowhile {
  public static void main ( String args[] ) {

    int num = 10;
    while(num < 10) {
      System.out.println("While Loop: " + num + " ");
      num++;
    }

    num = 10;
    do {
      System.out.print("Do while loop: " + num + " ");
      num++;
    }
    while(num < 10);
    
    System.out.println();
   }
}
