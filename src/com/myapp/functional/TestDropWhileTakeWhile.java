package com.myapp.functional;

import java.util.stream.IntStream;

public class TestDropWhileTakeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IntStream.range(1, 100)
//		.filter(i -> i<4).forEach(System.out::println);
		
//		IntStream.range(1, 100)
//		.takeWhile(i -> i<4).forEach(System.out::println);
		
		
//		IntStream.range(1, 100)
//		.filter(i -> i>=4).forEach(System.out::println);
		
		IntStream.range(1, 10)
		.dropWhile(i -> i<4).forEach(System.out::println);

	}

}
