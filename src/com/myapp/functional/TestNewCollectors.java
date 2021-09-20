package com.myapp.functional;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.Set;
public class TestNewCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Product> products = Product.getProducts();
		
		Map<Set<String>, Set<Product>> productsByVendors =
				
		products.collect(groupingBy(Product::getVendors,
				filtering(p->p.getPrice()>100000.00, toSet())));
		
		System.out.println(productsByVendors);
		
		
		Map<Double, Set<String>> vendorsByPrice =
		products.collect(groupingBy(Product::getPrice,
				flatMapping(p->p.getVendors().stream(), toSet())));

		System.out.println(vendorsByPrice);
	}

}
