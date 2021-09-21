package com.myapp.functional;

public class TestPrivateInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = 
				new Product(1, "Oneplus9Pro",80000.00);
		
		System.out.println(product.getPriceWithTax());

		
		AnotherProduct anotherproduct = new AnotherProduct();
		anotherproduct.setPrice(80000.00);
		System.out.println(anotherproduct.getPriceWithTax());
		
	}

}
