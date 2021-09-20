package com.myapp.functional;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface NoParameter{
	void print();
}

@FunctionalInterface
interface OneParameter{
	void print(String s);
}
@FunctionalInterface
interface MultipleParameter{
	void print(int x,String ...strings );
}

class Product{
	
	int productId;
	
	

	public Product(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	
}

public class TestlamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoParameter noParameter =()-> System.out.println("No Parameter");
	
		OneParameter oneParameter =(s1)-> System.out.println("One  Parameter "+s1);
	
//		String array[]= {"s11","s21","s31"};
		MultipleParameter multipleParameter =(x, array ) -> {
		for(String s:array)
			System.out.println(s);
		};
		
		// ContainingClass :: staticMethod
		
		// containingobject :: instanceMethod
		
		// ContainingType:: methodName
		
		// ClassName::New
		
		
		multipleParameter.print(1,new String("one"),"two","three");
		
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");

		list.add("three");
		
		
		list.forEach(s -> System.out.println(s));
		
		List<Product> list1 = new ArrayList<>();
		
		list1.add(new Product(3));
		list1.add(new Product(4));
		list1.add(new Product(6));
		
		list1.forEach(Product::getProductId);
		
		
		
	}

}
