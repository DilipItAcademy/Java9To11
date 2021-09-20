package com.myapp.functional;

import java.util.stream.Stream;

public class TestNullableStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long zero = Stream.ofNullable(null).count();
		long one = Stream.ofNullable(Product.getProduct()).count();
		
		System.out.printf("zero: %d, one: %d",zero,one);
		
//		Product product = getPossiblyNull(false);
//		Stream<String> vendors=
//		product == null ? Stream.empty(): product.getVendors().stream();
//		vendors.forEach(System.out::println);
		
		
		Stream.ofNullable(getPossiblyNull(true))
		.flatMap(p ->p.getVendors().stream())
		.forEach(System.out::println);
		
		
		

	}
	
	private static Product getPossiblyNull(boolean isNull) {
		return isNull ? null : Product.getProduct();
	}

}
