package com.myapp.functional;

public interface PrivateProductInterface {
	
	Double getPrice();
	
	default double getPriceWithTax() {
		return getTaxedPriceInternal();
		
	}
	
	default double getOfferPrice(double discount) {
		return getTaxedPriceInternal() * discount;
		
	}
	private double getTaxedPriceInternal() {
		return getPrice()*getTax();
	}
	
	private double getTax() {
		return 1.0;
	}

}
