/**
 * 
 */
package cloud;

import java.util.Scanner;

/**
 * Date: 12/03/17 This is a simple application which calculates the price of the
 * house using address and size.
 * 
 * @author Eugene Robb
 * @version 1.0
 *
 */
public class HouseCalculator {
	// Scanner variable
	private static Scanner keyIn;

	// Price variables
	static double servicePrice = 250.00;
	static double currentPrice = 0.0;
	static double finalPrice = 0.0;

	// Square feet variables
	static double smallHouse = 5000.00;
	static double mediumHouse = 10000.00;
	static double largeHouse = 15000.00;
	static double extraLargeHouse = 20000.00;

	// Address variables
	static double letterkenny = 250000.00;
	static double buncrana = 185000.00;
	static double killybegs = 150000.00;
	static double burt = 200000.00;
	static double other = 175000.00;

	public static void main(String[] args) {
		keyIn = new Scanner(System.in);
		System.out.println("Price Calculator");
		System.out.println("-------------------------");
		System.out.println("Enter Address (town area): ");
		String answer = keyIn.nextLine();

		if (answer.equals("burt") || answer.equals("Burt")) {
			currentPrice = servicePrice + burt;
			System.out.println("Current Price: €" + currentPrice);

		} else if (answer.equals("letterkenny") || answer.equals("Letterkenny")) {
			currentPrice = servicePrice + letterkenny;
			System.out.println("Current Price: €" + currentPrice);
			
		} else if (answer.equals("buncrana") || answer.equals("Buncrana")) {
			currentPrice = servicePrice + buncrana;
			System.out.println("Current Price: €" + currentPrice);
			
		} else if (answer.equals("killybegs") || answer.equals("Killybegs")) {
			currentPrice = servicePrice + killybegs;
			System.out.println("Current Price: €" + currentPrice);
			
		} else {
			currentPrice = servicePrice + other;
			System.out.println("Current Price: €" + currentPrice);
			
		}
		
		System.out.println();
		
		// Calculating the price of using square feet
		System.out.println("Enter Size of House (Square Feet): ");
		double size = keyIn.nextDouble();
		if (size <= 2500) {
			finalPrice = currentPrice + smallHouse;
			System.out.println();
			System.out.println("Final Price: €" + finalPrice);
			
		} else if (size <= 3000) {
			finalPrice = currentPrice + mediumHouse;
			System.out.println();
			System.out.println("Final Price: €" + finalPrice);
			
		} else if (size <= 4000) {
			finalPrice = currentPrice + largeHouse;
			System.out.println();
			System.out.println("Final Price: €" + finalPrice);
			
		} else {
			finalPrice = currentPrice + extraLargeHouse;
			System.out.println();
			System.out.println("Final Price: €" + finalPrice);
			
		}

	}

}