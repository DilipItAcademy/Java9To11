package com.myapp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestAsynchrnousCompletableFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ExecutorService service = Executors.newSingleThreadExecutor();
	
	
	Supplier<List<Long>> supplyIds = () ->{
	
		return Arrays.asList(1L,2L,3L);
	};
	
	Function<List<Long>, CompletableFuture<List<User>>> getUsers = 
			 ids -> {
			Supplier<List<User>> userSupplier = 
					() -> ids.parallelStream().map(User::new)
					.collect(Collectors.toList());
			
			return CompletableFuture.supplyAsync(userSupplier);
			};
			
	Function<List<Long>, CompletableFuture<List<Email>>> getEmails = 
					 ids -> {
					Supplier<List<Email>> userSupplier = 
							() -> ids.stream().map(Email::new)
							.collect(Collectors.toList());
					
					return CompletableFuture.supplyAsync(userSupplier);
					};		
			
			
			CompletableFuture<List<Long>> completableFuture=
					CompletableFuture.supplyAsync(supplyIds);
			
			CompletableFuture<List<User>> userFuture =
					completableFuture.thenCompose(getUsers);
			
			CompletableFuture<List<Email>> emailFuture =
			completableFuture.thenCompose(getEmails);
			
			userFuture.thenAcceptBoth(emailFuture,(users,emails) ->{
			System.out.println(users.size()+ "--- "+emails.size());	
			});
			
			
					
	
	}

}
