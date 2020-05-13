package com.oops.polymorphism;
class Add
{
	public static void  sum(int a, int b)
	{
		System.out.println("sum is"+(a+b));
	}
}
class Add1 extends Add
{
	public static void sum(int a,int b,int c)
	{
		System.out.println("sum of 3 numbers is"+(a+b+c));
	}
}
public class OverLoading {

	public static void main(String[] args) {
		Add1 a=new Add1();
		a.sum(67, 4);
		a.sum(9, 4, 3);
	}

}
