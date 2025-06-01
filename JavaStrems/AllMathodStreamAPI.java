package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllMathodStreamAPI {

	public static void main(String[] args) {

		System.out.println("Heare all mathod of Stream API by Ashish Thakur ");

		// filter(predicate)
		System.out.println("This is filter");

		List<Integer> list = List.of(10, 20, 25, 30);

		list.stream().filter(n -> n > 20).forEach(System.out::println);

		System.out.println("---------------------------------------");
		// map(Function)
		System.out.println("This is map");

		List<String> name = List.of("Ashish", "Kumar");
		name.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("---------------------------------------");

		// sorted()
		System.out.println("This is sorted");

		List<Integer> nums = List.of(1, 4, 5, 7, 8, 2, 2, 889);
		nums.stream().sorted().forEach(System.out::println);

		System.out.println("---------------------------------------");
		// distinct()

		System.out.println("This is distinct");

		List<Integer> num = List.of(1, 4, 5, 7, 8, 2, 2, 8, 8, 9);
		num.stream().distinct().forEach(System.out::println);

		System.out.println("---------------------------------------");

		// limit(n)

		System.out.println("This is limit");

		List<String> lists = List.of("AA", "BB", "CC", "DD", "EE");
		list.stream().limit(1).forEach(System.out::println);

		System.out.println("---------------------------------------");
		// skip(n)

		System.out.println("This is skip");

		List<String> lits = List.of("AA", "BB", "CC", "DD", "EE");
		list.stream().skip(2).forEach(System.out::println);

		System.out.println("---------------------------------------");
		// forEach()
		System.out.println("This is use of for each");

		List<String> l1 = List.of("AA", "BB", "CC", "DD", "EE");
		l1.stream().forEach(System.out::println);

		System.out.println("---------------------------------------");
		// collect(Collectors.toList())

		System.out.println("This is use for collect");

		List<String> names = List.of("Ashish", "Prashant", "Suraj");

		List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);

		System.out.println("---------------------------------------");
		// count()

		System.out.println("This is count");

		long conut = List.of("Ashish", "Prashant", "Suraj").stream().count();

		System.out.println(conut);

		System.out.println("---------------------------------------");
		// toArray()

		System.out.println("This is toArray");

		String[] arr = List.of("a", "b").stream().toArray(String[]::new);
		System.out.println(Arrays.toString(arr));

		System.out.println("---------------------------------------");
		// reduce() -sum

		System.out.println("This is reduce");

		List<Integer> sum = List.of(1, 2, 3);

		sum.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		System.out.println("---------------------------------------");
		// anyMatch()

		System.out.println("This is anyMatch");

		boolean result = List.of(1, 2, 3, 4).stream().anyMatch(n -> n > 2);
		System.out.println(result);

		System.out.println("---------------------------------------");
		// allMatch()

		System.out.println("This is allMatch");

		boolean results = List.of(1, 2, 3, 5).stream().allMatch(n -> n % 2 == 0);
		System.out.println(results);

		System.out.println("---------------------------------------");
		// noneMatch()

		System.out.println("This is noneMatch");

		boolean resulte = List.of(1, 2, 3, 4, 5, 6, 7, 74, 2).stream().noneMatch(n -> n % 2 == 0);
		System.out.println(resulte);

		System.out.println("---------------------------------------");
		// groupingBy() (using class)

		System.out.println("This is use owan clas groupint ");

		class Emp {
			String name;
			String dept;

			Emp(String name, String dept) {
				this.name = name;
				this.dept = dept;
			}
		}
		List<Emp> listing = List.of(new Emp("A", "HR"), new Emp("S", "IT"), new Emp("p", "HR"));

		Map<String, List<Emp>> grouped = listing.stream().collect(Collectors.groupingBy(e -> e.dept));
		System.out.println(grouped);

		System.out.println("---------------------------------------");
		// parallelStream()

		System.out.println("This is parallelStream");

		List<String> items = List.of("One", "Two", "Three");
		items.parallelStream().forEach(System.out::println);

	}

}
