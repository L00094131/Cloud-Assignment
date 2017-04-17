package cloud;

public class Calculator {
	
	private double servicePrice;
	private double currentPrice;
	private double finalPrice;
	// Square feet variables
	private double smallHousePrice;
	private double mediumHousePrice;
	private double largeHousePrice;
	private double extraLargeHousePrice;
	// Address variables
	private double letterkennyPrice;
	private double buncranaPrice;
	private double killybegsPrice;
	private double burtPrice;
	private double otherPrice;

	
	public Calculator(){
		servicePrice = 250.00;
		currentPrice = 0.0;
		finalPrice = 0.0;
		smallHousePrice = 5000.00;
		mediumHousePrice = 10000.00;
		largeHousePrice = 15000.00;
		extraLargeHousePrice = 20000.00;
		letterkennyPrice = 250000.00;
		buncranaPrice = 185000.00;
		killybegsPrice = 150000.00;
		burtPrice = 200000.00;
		otherPrice = 175000.00;
	}
	
	public Calculator(double sP, double cP, double fP, double sH, double mH, double lH, double eLH, double l, double b, double k, double bu, double o){
		servicePrice = sP;
		currentPrice = cP;
		finalPrice = fP;
		smallHousePrice = sH;
		mediumHousePrice = mH;
		largeHousePrice = lH;
		extraLargeHousePrice = eLH;
		letterkennyPrice = l;
		buncranaPrice = bu;
		killybegsPrice = k;
		burtPrice = b;
		otherPrice = o;
	}

	public double getServiceCharge() {
		return servicePrice;
	}

	public void setServiceCharge(double serviceCharge) {
		this.servicePrice = serviceCharge;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getSmallHouse() {
		return smallHousePrice;
	}

	public void setSmallHouse(double smallHouse) {
		this.smallHousePrice = smallHouse;
	}

	public double getMediumHouse() {
		return mediumHousePrice;
	}

	public void setMediumHouse(double mediumHouse) {
		this.mediumHousePrice = mediumHouse;
	}

	public double getLargeHouse() {
		return largeHousePrice;
	}

	public void setLargeHouse(double largeHouse) {
		this.largeHousePrice = largeHouse;
	}

	public double getExtraLargeHouse() {
		return extraLargeHousePrice;
	}

	public void setExtraLargeHouse(double extraLargeHouse) {
		this.extraLargeHousePrice = extraLargeHouse;
	}

	public double getLetterkenny() {
		return letterkennyPrice;
	}

	public void setLetterkenny(double letterkenny) {
		this.letterkennyPrice = letterkenny;
	}

	public double getBuncrana() {
		return buncranaPrice;
	}

	public void setBuncrana(double buncrana) {
		this.buncranaPrice = buncrana;
	}

	public double getKillybegs() {
		return killybegsPrice;
	}

	public void setKillybegs(double killybegs) {
		this.killybegsPrice = killybegs;
	}

	public double getBurt() {
		return burtPrice;
	}

	public void setBurt(double burt) {
		this.burtPrice = burt;
	}

	public double getOther() {
		return otherPrice;
	}

	public void setOther(double other) {
		this.otherPrice = other;
	}
	

}
