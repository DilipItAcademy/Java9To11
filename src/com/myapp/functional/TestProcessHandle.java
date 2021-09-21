package com.myapp.functional;

//import java.lang.management.ManagementFactory;

public class TestProcessHandle {
	
	// java.lang.Process
	
	// Represents Native Processes created from Java
	
	// java.lang.ProcessHandle
	
	// Represents any native process on our operating system

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	//	ManagementFactory.getRuntimeMXBean().getName().split("@")[0]

		// Get The process id
		long pid= ProcessHandle.current().pid();
		long parentPid = ProcessHandle.current().parent().get().pid();
		
		// Kill Your own process
		// ProcessHandle.current().destroyForcibly();
		 
		 System.out.println("Current Process "+pid);
		 
		 System.out.println("Parent Process "+parentPid);
		
		
	}

}
