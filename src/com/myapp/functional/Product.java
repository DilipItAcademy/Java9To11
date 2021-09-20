package com.myapp.functional;

import java.util.Arrays;
import java.util.Objects;

public class Product {
	
	private int id;
	private String name;
	private Double price;
	private String[] vendors;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, Double price, String[] vendors) {
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


	public String[] getVendors() {
		return vendors;
	}


	public void setVendors(String[] vendors) {
		this.vendors = vendors;
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
		builder.append(Arrays.toString(vendors));
		builder.append("]");
		return builder.toString();
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


	
	
	

}
