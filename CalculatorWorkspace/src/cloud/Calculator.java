package cloud;

/**
 * The Calculator.java program is for calculating the price of the house based
 * on location and square feet.
 * 
 * @author Eugene Robb
 * @author L00094131@student.lyit.ie
 * @version 1.0
 * @since 06/04/17
 */
public class Calculator {

	private double servicePrice = 250.0;
	private double squareFootPrice;
	private double townPrice;
	private double finalPrice;
	private double houseSize;
	private String town;

	/**
	 * @param sFP
	 *            The square foot price
	 * @param fP
	 *            The final price
	 * @param tP
	 *            The town price
	 * @param hS
	 *            The house size
	 * @param t
	 *            The town name
	 */
	public Calculator(double sFP, double tP, double fP, double hS, String t) {
		squareFootPrice = sFP;
		townPrice = tP;
		finalPrice = fP;
		houseSize = hS;
		town = t;
	}

	/**
	 * Gets the service charge.
	 * 
	 * @return A double value representing the service charge.
	 */
	public double getServiceCharge() {
		return servicePrice;
	}

	/**
	 * Gets the square foot price of the property.
	 * 
	 * @return A double value representing the square foot price.
	 */
	public double getSquareFootPrice() {
		return squareFootPrice;
	}

	/**
	 * Gets the square feet of the property.
	 * 
	 * @return A double value representing the square feet.
	 */
	public double getSquareFeet() {
		return houseSize;
	}

	/**
	 * Sets the square foot price of the property.
	 * 
	 * @param houseSize
	 *            The size of the house in square feet.
	 */
	public void setSquareFeetPrice(double houseSize) {
		if (houseSize <= 120.0) {
			throw new IllegalArgumentException("Square feet must be reasonable.");
		}
		// Small House: min 121.0 - max 2500.0
		else if (houseSize <= 2500.0) {
			this.squareFootPrice = 5000.0;
		}
		// Medium House: min 2500.1 - max 3000.0
		else if (houseSize <= 3000.0) {
			this.squareFootPrice = 10000.0;
		}
		// Large House: min 3000.1 - max 4000.0
		else if (houseSize <= 4000.0) {
			this.squareFootPrice = 15000.0;
		}
		// Extra Large House: min 4000.1 - max 5000.0
		else if (houseSize <= 5000.0) {
			this.squareFootPrice = 20000.0;
		}
		// Anything Above: min 5000.1 - no max
		else {
			this.squareFootPrice = 25000.0;
		}
		this.houseSize = houseSize;
	}

	/**
	 * Gets the town name.
	 * 
	 * @return A String representing the property's town.
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Validates the town name using regex. This does not allow for numbers or
	 * symbols in the name.
	 * 
	 * @param town
	 *            The name of the town.
	 * @return A boolean variable which represents true or false.
	 */
	public static boolean validateTown(String town) {
		return town.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
	}

	/**
	 * Sets the town price.
	 * 
	 * @param town
	 *            A String value representing the town name.
	 */
	public void setTownPrice(String town) {
		if (validateTown(town)) {
			if (town == "burt" || town == "Burt") {
				this.townPrice = 200000.00;
			} else if (town == "letterkenny" || town == "Letterkenny") {
				this.townPrice = 250000.00;
			} else if (town == "donegal town" || town == "Donegal Town") {
				this.townPrice = 220000.00;
			} else if (town == "killybegs" || town == "Killybegs") {
				this.townPrice = 212500.00;
			} else if (town == "buncrana" || town == "Buncrana") {
				this.townPrice = 255500.00;
			} else if (town == "quigley's point" || town == "Quigley's Point" || town == "quigleys point"
					|| town == "Quigleys Point") {
				this.townPrice = 194500.00;
			} else if (town == "st. johnston" || town == "St. Johnston") {
				this.townPrice = 205500.00;
			} else if (town == "bundoran" || town == "Bundoran") {
				this.townPrice = 205000.00;
			} else {
				this.townPrice = 195500.00;
			}
			this.town = town;
		} else {
			throw new IllegalArgumentException("Town name can only be alphabetic with apostrophe or hyphen.", null);
		}
	}

	/**
	 * Gets the town price.
	 * 
	 * @return A double value representing the town price.
	 */
	public double getTownPrice() {
		return townPrice;
	}

	/**
	 * Gets the final price of the property.
	 * 
	 * @return A double value representing the final price.
	 */
	public double getFinalPrice() {
		finalPrice = this.squareFootPrice + this.townPrice + this.servicePrice;
		return finalPrice;
	}

}
