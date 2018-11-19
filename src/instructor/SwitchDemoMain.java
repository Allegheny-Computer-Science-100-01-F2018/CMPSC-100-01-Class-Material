import java.util.Scanner;
import java.text.DecimalFormat;

public class SwitchDemoMain {
 	public static void main ( String args[] ) {

		double left, right;
 		char operator;
		Scanner input = new Scanner ( System.in );
 		System.out.print ( "Enter a simple expression: " );
		left = input.nextDouble();	// requires spaces between double values and char operator!
 		operator = input.next().charAt(0);
 		right = input.nextDouble();
		System.out.print ( left +" "+ operator +" "+ right +" = ");

		Calculator calc = new Calculator(0);
    calc.calculate(left, right, operator);
		double result = calc.getResult();

		DecimalFormat fmt = new DecimalFormat("0.##");

		System.out.println(fmt.format(result));

 	}
}
