package com.exception.retur;

public class Test {

	public static void main(String[] args) {
		/*
		 * try { System.out.println("try block"); return ; } catch(ArithmeticException
		 * e) { System.out.println("catch block "); } finally {
		 * System.out.println("finally block"); }
		 */
		System.out.println(m1());
		
	}
	public static int m1()
	{
		try
		{
			//System.out.println("try block");
			System.out.println(10/2);
			//System.exit(0);
		}
		catch(ArithmeticException e)
		{
			//System.out.println("catch block");
			return 65;
		}
		finally
		{
			return 67;
		}
		
	}

}
