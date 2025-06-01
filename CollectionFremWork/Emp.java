package com.CollectionFremWork;

import java.util.HashSet;
import java.util.Set;
class Empoloye
{
	Integer name;
	public Empoloye(Integer _name)
	{
		this.name=_name;
		
	}
	@Override
	public int hashCode()
	{ 
		System.out.println("in side hashcode overrode");
		return 12321;
	}
}
 
public class Emp {

	public static void main(String[] args) {
 
		Set<Empoloye> name = new HashSet<Empoloye>();
		name.add(new Empoloye(56));
//		name.add(new Empoloye("Sachin"));
//		name.add(new Empoloye("Kuldeep"));
//		name.add(new Empoloye("Ms.Dhoni"));
//		name.add(new Empoloye("Kohali"));
//		name.add(new Empoloye("Rohit"));
//		name.add(new Empoloye("SirJateja"));


		System.out.println();
		
	}

}
