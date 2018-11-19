/** Class to implement a simple
* calculator.
*/
public class Calculator {
  private double result;

  /** Constructor to initialize the result.
  */
  public Calculator(double res) {
    result = res;
  }

  public void calculate(double left, char op, double right) {
    switch (op) {
      case '+':
        result = left + right;
        break;
      case '-':
        result = left - right;
        break;
      case '*':
        result = left * right;
        break;
      case '/':
        result = left / right;
        break;
      case '%':
        result = left % right;
        break;
      default:
        System.out.println("Invalid operator");
    }
  }
  public double getResult() {
    return result;
  }
}
