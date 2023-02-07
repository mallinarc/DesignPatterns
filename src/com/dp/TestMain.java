package com.dp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class TestMain {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSz");
		System.out.println(".....LocalDateTime.now().format(formatter):"+OffsetDateTime.parse(LocalDateTime.now().toString()));
		//'2011-12-03T10:15:30Z
		System.out.println("....... Instant.now()"+Instant.now());

	}

}
