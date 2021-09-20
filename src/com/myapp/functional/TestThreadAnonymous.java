package com.myapp.functional;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TestThreadAnonymous {
	
	private String name1,name2;
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name1, name2);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TestThreadAnonymous))
			return false;
		TestThreadAnonymous other = (TestThreadAnonymous) obj;
		return Objects.equals(name1, other.name1) && Objects.equals(name2, other.name2);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Anonymous Class
		
		Thread thread1 = new Thread("My-Thread") {
			public void run() {
				System.out.println("From "+Thread.currentThread().getName());	
			}
		};
		thread1.start();
		
		// Anonymous Class
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From "+Thread.currentThread().getName());
				
			}
		};
		Thread thread = new Thread(runnable,"My-Thread");
		thread.start();
		
	
	// 
		
		// (arg1,arg2) -> {  }
		// () ->{ }
		// () -> 
		// arg -> {
		
		// }
		
		new Thread(()->{
			System.out.println("From "+Thread.currentThread().getName());
			
		},"Lambda-1").start();
		
		
		Runnable r = ()-> {
			System.out.println("From "+Thread.currentThread().getName());
			
		};
		new Thread(r,"Lambda-2").start();
		
//		Comparator<String> comparator = new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		};
		
		
		Comparator<String> comparator1 = ( s1, s2)-> 
		s1.compareTo(s2);
		
		Comparator<String> comparator2 = ( s1, s2)-> 
		s1.compareTo(s2);
		
		
		System.out.println(comparator1.equals(comparator2));
		System.out.println(comparator1.hashCode());
		
		System.out.println(comparator2.hashCode());
		
		
		
		Set<String> set  = new TreeSet<>(comparator1);
		set.add("ddjdhj");
		set.add("cchkjkdjkd");
		
		
	Mylambda mylambda=	()->{
			
		};
		
	Runnable runnable2 = ()->{
		
	};
	
		
		
		
		
	}
	
	
	
	
	

}
