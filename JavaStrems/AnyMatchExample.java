package com.JavaStrems;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
 
		List<String> emails = Arrays.asList("ashish@gmail.com","prashant@fmail.com","kishan@yahoo.com","rishav@kodewala.com");
		
		boolean email= emails.stream().anyMatch(e -> e.endsWith("@gmail.com"));
		
		System.out.println("Thare is any Gmail  ?? : "+email);
		
	}

}
