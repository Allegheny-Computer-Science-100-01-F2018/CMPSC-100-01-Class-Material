/** A program that demonstrates the nested
* for loop structure.
*/
public class NestedForLoop {
  public static void main (String args[]) {

    for(int num1 = 0; num1 <= 2; num1++) { // outer
      for(int num2 = 0; num2 <= 6; num2+=2) { //middle
        for(int num3 = 2; num3 >= 0; num3--) { //inner
          System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
        }
      }
    }
  }
}
