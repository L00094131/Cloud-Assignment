package cloud;

/**
 * The Calculator.java program is for calculating the
 * price of the house based on location and square feet.
 * 
 * @author Eugene Robb - L00094131
 * @version 1.0
 * @since 06/04/17
 */
public class Calculator {

	private double servicePrice;
	private double currentPrice;
	private double finalPrice;
	private double houseSize;

	/**
	 * @param cP
	 * @param fP
	 * @param hS
	 */
	public Calculator(double cP, double fP, double hS) {
		currentPrice = cP;
		finalPrice = fP;
		houseSize = hS;
	}

	/**
	 * @return
	 */
	public double getServiceCharge() {
		servicePrice = 250.0;
		return servicePrice;
	}

	/**
	 * @return
	 */
	public double getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @return
	 */
	public double getSquareFeet() {
		return houseSize;
	}

	/**
	 * @param houseSize
	 * @param currentPrice
	 */
	public void setSquareFeetPrice(double houseSize, double currentPrice) {
		if (houseSize <= 120.0) {
			throw new IllegalArgumentException("Square feet must be reasonable.");
		}
		// Small House: min 121.0 - max 2500.0
		else if (houseSize <= 2500.0) {
			currentPrice = 5000.0;
			this.currentPrice = currentPrice;
		}
		// Medium House: min 2500.1 - max 3000.0
		else if (houseSize <= 3000.0) {
			currentPrice = 10000.0;
			this.currentPrice = currentPrice;
		}
		// Large House: min 3000.1 - max 4000.0
		else if (houseSize <= 4000.0) {
			this.currentPrice = 15000.0;
		}
		// Extra Large House: min 4000.1 - max 5000.0
		else if (houseSize <= 5000.0) {
			this.currentPrice = 20000.0;
		}
		// Anything Above: min 5000.1 - no max
		else {
			this.currentPrice = 25000.0;
		}
		this.houseSize = houseSize;
	}

	/**
	 * @return
	 */
	public double getFinalPrice() {
		return finalPrice;
	}

	/**
	 * @param finalPrice
	 */
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

}
