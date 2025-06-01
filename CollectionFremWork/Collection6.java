package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;

public class Collection6 {

	public static void main(String[] args) {

		System.out.println("This is Collection example with all tpye of Primetive ");

		List<String> name = new ArrayList<String>();
		name.add("Ashish");

		System.out.println("Name: " + name);

		List<Integer> age = new ArrayList<Integer>();
		age.add(24);

		System.out.println("Age :" + age);

		List<Double> wait = new ArrayList<Double>();
		wait.add(79.6);

		System.out.println("wait: " + wait);

		List<Float> height = new ArrayList<Float>();
		height.add(5.8f);

		System.out.println("height: " + height);

		List<Long> MobNum = new ArrayList<Long>();
		MobNum.add(8051865112L);

		System.out.println("MobNum: " + MobNum);

		List<Boolean> merid = new ArrayList<Boolean>();
		merid.add(false);

		System.out.println("merid: " + merid);

		List<Character> male = new ArrayList<Character>();
		male.add('M');

		System.out.println("male: " + male);

		List<Object> Mix = new ArrayList<Object>();
		Mix.add("Ashish");
		Mix.add(24);
		Mix.add(79.6);
		Mix.add(5.8f);
		Mix.add(8051865112L);
		Mix.add(false);
		Mix.add('M');

		System.out.println("All Details is this : " + Mix);

	}

}
