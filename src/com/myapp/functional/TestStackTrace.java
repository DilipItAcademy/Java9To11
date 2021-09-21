package com.myapp.functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.lang.StackWalker.StackFrame;

public class TestStackTrace {

	
	public static void method1() {
		method2();
		
	}
	
	public static void method2() {
		method3();
		
	}

	public  static void method3() {
		method4();
		
	}

	public static void method4() {
		// TODO Auto-generated method stub
		
		StackWalker walker = StackWalker.getInstance();
		
		List<String> lines =
		walker.walk(stackStream -> 
		stackStream.filter(stackFrame -> 
		stackFrame.getMethodName().startsWith("m"))
		.map(StackFrame::getMethodName).collect(Collectors.toList()));
		
		lines.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<Thread, StackTraceElement[]> stackTrace= Thread.getAllStackTraces();

		// StackWalker -> walk, forEach, StackFrame
		
		method1();
		
		
		
	}

}
