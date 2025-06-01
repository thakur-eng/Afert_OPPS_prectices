package com.Pattern;

abstract class CodeWithKodeWala {

	abstract void student();

	{
		System.out.println("Start your larning ");
	}

}
class Batch extends CodeWithKodeWala {
	@Override
	void student() {
		System.out.println(" heare is start yours java class");
	}
}

class Interview extends CodeWithKodeWala {
	@Override
	void student() {
		System.out.println("take your interview in Interview room");
	}
}

public class   KodeWala 
{
	public static void main(String[] args) {
		 
		CodeWithKodeWala s = new Batch();
		s.student();
		
		
	}
}
