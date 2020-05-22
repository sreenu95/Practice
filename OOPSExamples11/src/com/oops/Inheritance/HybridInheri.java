package com.oops.Inheritance;

/*
errors: 
=> follow the naming convention 
explain what is the use of inheritance and it's types
Inheritance means re-using(acquiring) properties of the existing class(parent) and add some more properties in the child class. 
there are four types 
1. single Inheritance(One parent to One Child)
2. multiLevel Inheritance(One parent One child)(Parent-->Child1(Child of Parent)-->C1(Child of Child1)-->Child of c1 )
3. multiple Inheritance(one child having multiple parent classes)
4. Hybrid Inheritance(One parent class having multiple Child classes)
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
