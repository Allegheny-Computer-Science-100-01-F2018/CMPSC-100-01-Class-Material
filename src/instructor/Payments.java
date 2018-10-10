import java.util.Scanner;

/** Program to calculate monthly
* payments for a loan */
public class Payments {

	/** Main method obtains user's input
	* and applies the amortization formula
	*/
	public static void main (String [] args){

		// declare variables
		double loanAmount;
		double rate;
		int loanTerm;
		// create an instance of the Scanner
		Scanner scan = new Scanner (System.in);

		// obtain user's input
		System.out.println("Enter a loan amount");
		loanAmount = scan.nextDouble();
		System.out.println("Enter a rate");
		rate = scan.nextDouble();
		System.out.println("Enter loan term");
		loanTerm = scan.nextInt();

		// apply amortization formula
		// calculate the term for the power function
		double term = Math.pow(1 + rate, loanTerm);
		System.out.println("Term is: " + term);

		double payment = loanAmount * rate * (term / (term - 1));
		System.out.println("Payment: "+ payment);

		// demonstration of the conversion from String to int
		String myString = "546";
		int myInteger = Integer.parseInt(myString);
		System.out.println("My integer " + myInteger);
	}
}
