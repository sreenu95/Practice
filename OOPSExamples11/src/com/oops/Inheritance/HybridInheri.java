package com.oops.Inheritance;

/*
errors: 
=> follow the naming convention 
explain what is the use of inheritance and it's types
*/
class phone
{
	int sid;
	String name;
	public void work()
	{
		System.out.println("working");
	}
}
class Motrola extends phone
{
	int num;
	String gen;
	public void use()
	{
		System.out.println("using");
	}
}
class nokia extends phone
{
	int nid;
	public void provide()
	{
		System.out.println("providing new features");
	}
}
public class HybridInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nokia n=new nokia();
		n.provide();
		n.work();
		Motrola m=new Motrola();
		m.use();
		m.work();
	}

}
