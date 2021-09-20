package com.myapp.functional;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class Product {
	
	private int id;
	private String name;
	private Double price;
	private Set<String> vendors;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, Double price ) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	


	public Product(int id, String name, Double price, Set<String> vendors) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.vendors = vendors;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	

	public Set<String> getVendors() {
		return vendors;
	}


	public void setVendors(Set<String> vendors) {
		this.vendors = vendors;
	}


	


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}


	public static Stream<Product> getProducts(){
		return Stream.of(new Product(1, "Iphone13", 124565.5, 
				Set.of("amazon","flipkart")),
				new Product(4, "SamsungZFlip", 149565.5, 
						Set.of("amazon","flipkart")),
				new Product(2, "Oneplus", 39999.0, 
						Set.of("amazon","tatacliq")),
				new Product(5, "OneplusNord", 79999.0, 
						Set.of("ebay","target")));
	
	}
	
	public static Product getProduct() {
		return getProducts().findFirst().get();
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", vendors=");
		builder.append(vendors);
		builder.append("]");
		return builder.toString();
	}
	
	

}
