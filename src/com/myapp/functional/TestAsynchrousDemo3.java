package com.myapp.functional;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class TestAsynchrousDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Supplier<String> task =()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return Thread.currentThread().getName();
		};
		//ExecutorService service = Executors.newSingleThreadExecutor();
		
		CompletableFuture<String> completableFuture =
				CompletableFuture.supplyAsync(task);
		
		String data = completableFuture.join();
		
		System.out.println("Data "+data);
		
		data = completableFuture.join();
		
		System.out.println("Data "+data);
		
		
//		Thread.sleep(1000);
		
		System.out.println("im running  in thread "
		+Thread.currentThread().getName());
		
		//service.shutdown();
		

	}

}
