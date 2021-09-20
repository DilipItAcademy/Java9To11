package com.myapp.functional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Optional<Integer>> optionals=
		Stream.of(Optional.of(1),Optional.empty(),Optional.of(2));
		
		Stream<Integer> intVals = optionals.flatMap(Optional::stream);
	
		intVals.forEach(System.out::println);
		
		List<String> vendors =Product.getProducts().map(product -> 
		product.getVendors().stream().findFirst())
				.flatMap(vendor -> vendor.stream())
				.collect(Collectors.toList());
		System.out.println("First Vendors "+vendors);
		
		
	}

}
