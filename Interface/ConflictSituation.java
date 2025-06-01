package com.Interface;

interface movie{
	default void show()
	{
		System.out.println("A interface show ");
	}
}
interface boy{ 
	default void show()
	{
		System.out.println("B interface show ");
	}
}



public class ConflictSituation implements movie,boy {

	
	public void show() {
		System.out.println(" my own");
		movie.super.show(); //interface ka default method call karengep
		boy.super.show();
		
	}
	public static void main(String[] args) {
 
		ConflictSituation obj = new ConflictSituation();
		
		obj.show();
	}

}
