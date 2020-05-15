package com.oops.Inheritance;

class Office
{
	public void work()
	{
		System.out.println("work");
	}
}
class Employee extends Office
{
	public void learn()
	{
		System.out.println("learning");
	}
}
public class Student {

	public static void main(String[] args) {
			Employee e=new Employee();
			e.work();
			e.learn();
	}

}
