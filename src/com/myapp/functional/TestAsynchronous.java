package com.myapp.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class TestAsynchronous {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		//List<String> strings = new ArrayList<>();
		
		//final List<String> strings = List.of("a", "z", "c");
		
		final List<String>  strings = new ArrayList<>();
		strings.add("a");
		strings.add("z");
		strings.add("c");
		
		//strings.sort((s1,s2)-> s1.compareTo(s2));
		
		Runnable r =()->{
			strings.sort(Comparator.naturalOrder());
		};
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future =service.submit(r);
		
		//Thread.sleep(1000);
		System.out.println(future.get());
		//SwingUtilities.invokeLater(()-> {})
		
		System.out.println(future.isDone());
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//System.out.println(strings);
		System.out.println("Hello");

	}
	
	// Blocking v/s NonBlocking
	
	
	// Blocking means that a thread has to wait to execute a task or access a resource
	
	// Synchrnoized is a blocking way to prevent to race conditions
	
	

}
