package com.oops.polymorphism;
class Student
{
	public void read()
	{
		System.out.println("reading");
	}
}
class Learn extends Student
{

	//@Override
	public void read() {
		// TODO Auto-generated method stub
		//super.read();
		System.out.println("reading");
	}
	
}

public class OverRiding {

	public static void main(String[] args) {
		
		  Student s=new Learn();
		  s.read();
		 
	}

}
