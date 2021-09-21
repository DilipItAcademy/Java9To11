package com.myapp.functional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTryWithResource {
	
	public void before9TryWithResource() throws IOException {
		try(FileInputStream fis = new FileInputStream("./Product.java")){
			fis.read();
		}
		
	}
	
	public static void nowJava9TryWithResource(FileInputStream fis) throws IOException {
		try(FileInputStream fis2 = fis){
			fis2.read();
		}
		
	}
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		// TODO: handle exception
		
		
		nowJava9TryWithResource(new FileInputStream("./Product.java"));
		
		
		List<String> list = new ArrayList<>() {
		
			public boolean add(String s) {
				return super.add(s);
				
			};
		};
		
		
		

	}

}
