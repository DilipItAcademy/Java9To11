package com.myapp.functional;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestAsynchrousDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runnable task =()->{
			System.out.println("im running asynchronously in thread "
		+Thread.currentThread().getName());
		};
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		CompletableFuture.runAsync(task,service);
		
		Thread.sleep(1000);
		
		System.out.println("im running  in thread "
		+Thread.currentThread().getName());
		

	}

}
