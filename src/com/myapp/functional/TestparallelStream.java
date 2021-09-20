package com.myapp.functional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestparallelStream {
	public static void main(String[] args) {
		
		
		System.setProperty(
	"java.util.concurrent.ForkJoinPool.common.parallelism", "4");
		
	List<String> collect =
			
			Stream.iterate("+", s -> s+ "+")
			.parallel()
			.limit(1000)
			.peek(s-> System.out.println(
		s+" processed in thread "+Thread.currentThread().getName()))
			.collect(Collectors.toList());
	System.out.println("Size "+collect.size());
		
		
		
	}

}
