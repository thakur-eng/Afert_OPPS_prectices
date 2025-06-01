package com.CollectionFremWork;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;

public class SortListStrings {

	public static void main(String[] args) {
 
		List<String> name = new ArrayList<>(Arrays.asList("Ashish","Prashant","Jitenra","Ramkripal"));
	
		Collections.sort(name);
 
		System.out.println("Name Alfabetical " + name);
		
		
	}

}
