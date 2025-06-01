package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class User
{
	String name;
	List<String> mob;
	
	public User(String name, List<String> mob)
	{
	
		this.name=name;
		this.mob=mob;
		
	}
	public List<String> getmob()
	{
		return mob;
	}
}



public class UserMob_FlatMap {

	public static void main(String[] args) {

		List<User>  users = Arrays.asList(
				new User("Ashish", Arrays.asList("111","222")),
				new User("Thakur", Arrays.asList("333","444")));
		
		List<String> allmob= users.stream()
				.flatMap(user ->user.getmob().stream())
				.collect(Collectors.toList());
		
		System.out.println(allmob);
	}
 
}
