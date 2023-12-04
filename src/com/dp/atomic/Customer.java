package com.dp.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	// private static volatile int idCounter = 0;
	AtomicInteger idCount = new AtomicInteger(0);
	private int id;

	public Customer() {
		id = idCount.getAndIncrement();

	}
}
