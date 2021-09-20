package com.myapp.functional;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestList {

	
	private static Predicate<Product> getProduct(double price){
		return product -> product.getPrice() > price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Product> list = new ArrayList<>();
//		
//		list.add(new Product(1, "Iphone13", 124565.5, 
//				new String[] {"amazon","flipkart"}));
//		
//		list.add(new Product(4, "SamsungZFlip", 149565.5, 
//				new String[] {"amazon","flipkart"}));
		
		
		
		
	List<Product> list=	List.of(new Product(1, "Iphone13", 124565.5, 
				new String[] {"amazon","flipkart"}),
				new Product(4, "SamsungZFlip", 149565.5, 
						new String[] {"amazon","flipkart"}),
				new Product(2, "Oneplus", 39999.0, 
						new String[] {"amazon","flipkart"}),
				new Product(2, "OneplusNord", 39999.0, 
						new String[] {"amazon","flipkart"}));
	
	
	
	
	
	//list = new ArrayList<>();
	
	System.out.println(list.getClass());
	
	
			
//	list.stream().filter(predicate).forEach(System.out::println);
		
			List<Product> filteredList=
					list.stream().distinct().filter(getProduct(35000.5)).collect(Collectors.toList());			
			
			filteredList.forEach(System.out::println);
//			List<Product> filteredList=
//list.stream().filter(predicate).collect(Collectors.toList());
	
	
	DoubleSummaryStatistics statistics= 
	list.stream().mapToDouble(Product::getPrice).summaryStatistics();
	
	System.out.println(statistics.getMin());
	
	System.out.println(statistics.getMax());

	System.out.println(statistics.getAverage());
	
	System.out.println(statistics.getSum());
	
	
	
			
	
//	
//	list.add(new Product(4, "SamsungZFlip", 149565.5, 
//			new String[] {"amazon","flipkart"}));
//		
		

	}

}
