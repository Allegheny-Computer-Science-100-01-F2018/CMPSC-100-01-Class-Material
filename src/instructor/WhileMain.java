/** Class to demonstrate the while
* loop usage.
*/
public class WhileMain {
  public static void main (String [] args) {
    int count = 10;
    int num = 1;
    while (count > 0) {
      System.out.println("Count is: " + count);
      num = 1;
      while (num < 10) {
        System.out.println("Num is: " + num);
        num += 2;
      }
      count -= 2;
    }
  }
}
