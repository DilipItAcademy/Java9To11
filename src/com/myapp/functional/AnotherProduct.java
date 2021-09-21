package com.myapp.functional;

public class AnotherProduct implements PrivateProductInterface {

	
	private Double price;
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
