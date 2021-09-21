package com.myapp.functional;

import java.time.Instant;
import java.util.Comparator;

public class TestShowAllProcesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessHandle.allProcesses()
		.map(ProcessHandle::info)
		.sorted(Comparator.comparing(info->info.startInstant()
				.orElse(Instant.MAX))).forEach(TestShowAllProcesses::print);

	}
	private static void print(ProcessHandle.Info info) {
		if(info.startInstant().isPresent() && info.command().isPresent()) {
			System.out.println("Started At "+info.startInstant().get()
					+" , Command "+info.command().get());
		}
	}

}
