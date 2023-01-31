package com.dp.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class LearnAtomic {

	public static void main(String[] args) {
		AtomicReference<String> atmRef = new AtomicReference<String>("Ramesh");
		atmRef.compareAndSet("Like", "Subscribe");
		System.out.println(atmRef);

		atmRef.compareAndSet("Ramesh", "Subscribe");
		System.out.println(atmRef);

	}

}
